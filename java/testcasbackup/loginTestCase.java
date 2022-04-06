package testcasbackup;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import epd.pageObject.Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class loginTestCase {
	WebDriver driver;
	
	@DataProvider(name = "login")
	public Iterator<Object[]>  Provider() throws IOException{
	
	CSVReader reader = new CSVReader(new FileReader("D:\\webDriver-goudarzi\\eclipse-workspace\\epd\\src\\test\\resources\\data\\logindata.csv"),',','\'',1);
	List <Object[]> myEntries = new ArrayList<Object[]>();
	String[] nextLine;
	while((nextLine = reader.readNext()) !=null) {
		myEntries.add(nextLine);
		
	}
	reader.close();
	
	return myEntries.iterator();

	}

	
	
	
  @Test(dataProvider = "login")
  public void f(String username , String password ) throws InterruptedException {

	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(username, password);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8013/home");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
  
  

}
