package testcasbackup;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import epd.pageObject.LoginTohr;
import epd.pageObject.SerchUser;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;


public class SearchUsertestcase {
	WebDriver driver;
	@DataProvider(name = "searchuser")
	public Iterator<Object[]> provider() throws IOException{
	CSVReader Reader =new CSVReader(new FileReader("D:\\webDriver-goudarzi\\eclipse-workspace\\epd\\src\\test\\resources\\data\\searchuser.csv"),',','\'',1 );
	List <Object[]> myEntries = new ArrayList<Object[]>();
	String[] nextLine;
	while((nextLine = Reader.readNext()) !=null) {
		myEntries.add(nextLine);
		
	}
	
	Reader.close();
	
	return myEntries.iterator();

	}
	
	@Test(dataProvider ="searchuser" )
  public void f(String username , String password , String target) throws InterruptedException {
	  LoginTohr lh = PageFactory.initElements(driver, LoginTohr.class);
	  lh.Logintohr(driver, username  , password); 
	  
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window);
		  
	  }
	  

	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  

	  
	  
	  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
	  su.Searchuser2(target);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8013/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {

  }
  
  

}
