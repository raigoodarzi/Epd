package humanresources.TestCases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

//import center.pageobjects.Login;
import epd.pageObject.EntesabKarmand;
import epd.pageObject.LoginTohr;
import epd.pageObject.SerchUser;
import humanresources.pageObjects.Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Entesab_TC {
	WebDriver driver;
	
	@DataProvider(name = "Entesab")
	public Iterator<Object[]> provider() throws IOException{
		CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/Entesab.csv"), ',', '\'', 1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextline ;
		while((nextline =Reader.readNext())!= null ) {
			myEntries.add(nextline);
		}
		Reader.close();
		return myEntries.iterator();
	}
	
  @Test(dataProvider = "Entesab" )
  public void f(String username,String password, String target) throws InterruptedException, AWTException {
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, username, password);
	 // String window1 = driver.getWindowHandle();
	  
	  Thread.sleep(4000);
	  
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]"
	  		+ "/div/div[2]/his-home/div/div/div/div/nav/div/div[3]/a")).click();
	  
	  for(String window2 : driver.getWindowHandles()) {
		  driver.switchTo().window(window2);
		  
	  }
	  
	  Thread.sleep(6000);
	  EntesabKarmand Ek = PageFactory.initElements(driver, EntesabKarmand.class);
	  Ek.EntesabKarmand();
	  Thread.sleep(2000);
	  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
	  su.SerchUser1(target);
	  Thread.sleep(2000);
	  EntesabKarmand  Ek2 = PageFactory.initElements(driver, EntesabKarmand.class);
	  Ek2.EntesabKarmand2();
	  
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
