package testcasbackup;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import epd.pageObject.AccessLevel;
import epd.pageObject.LoginTohr;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class SecurityTestCase {
	WebDriver driver;
	@DataProvider(name = "Login")
	public Iterator<Object[]> provider() throws IOException{
	CSVReader Reader = new CSVReader(new FileReader("D:\\webDriver-goudarzi\\eclipse-workspace\\epd\\src\\test\\resources\\data\\logindata.csv"), ',','\'',1);
	List <Object[]> myEntries = new ArrayList<Object[]>();
	String[] nextline;
	while((nextline =Reader.readNext())!=null) {
		myEntries.add(nextline);
	}
	Reader.close();
	return myEntries.iterator();
	}
	
  @Test(dataProvider = "Login")
  public void f(String username , String password) throws InterruptedException {
	  
	  LoginTohr lh = PageFactory.initElements(driver, LoginTohr.class);
	  lh.Logintohr(driver, username, password);
	  
	  for(String Window : driver.getWindowHandles()) {
		  driver.switchTo().window(Window);
		 
	  }
	  
	  Thread.sleep(3000);
	  AccessLevel access = PageFactory.initElements(driver, AccessLevel.class);
	  access.AccessLevel();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8013/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	 
	  
	  
	  
  }

}
