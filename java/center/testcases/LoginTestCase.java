package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.Login;

//import epd.pageObject.Login;

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

public class LoginTestCase {
	WebDriver driver;
	@DataProvider(name = "login")
	public Iterator <Object[]> Provider() throws IOException {
	CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/logindata.csv"),',','\'',1);
	List<Object[]> myEntries = new ArrayList<Object[]>();
	String[] nextLine ;
	while((nextLine =Reader.readNext())!=null) {
	myEntries.add(nextLine);
	
	}
	Reader.close();
	return myEntries.iterator();
	
		
	}

  @Test(dataProvider = "login") 
  public void f( String user , String pass) throws InterruptedException {
	  Login lol = PageFactory.initElements(driver, Login.class);
	  lol.loginepd(driver, user, pass);
	  
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8010/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
