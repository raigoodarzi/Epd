package humanresources.TestCases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.Login;
import humanresources.pageObjects.Bazyabi;
import humanresources.pageObjects.SerchUser;

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
import org.testng.annotations.AfterMethod;

public class BazyabiRamz_TC {
	WebDriver driver;
	@DataProvider(name = "resetpass") 
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/Search-hr.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] Nextline;
		while ((Nextline = Reader.readNext())!=null) {
			myEntries.add(Nextline);
			
		}
		Reader.close();
		return myEntries.iterator();
	}
	
	
  @Test(dataProvider = "resetpass")
  public void f(String username , String Pass , String coding) throws InterruptedException {
	  
	 Login lo = PageFactory.initElements(driver, Login.class);
	 lo.loginepd(driver, username, Pass);
	  
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/"
			+ "div[2]/his-home/div/div/div/div/nav/div/div[3]/a")).click();  //click on hr
	 
	  String window1 = driver.getCurrentUrl();  //Switch be safhe etelaate karbaran
	  for(String window2 :driver.getWindowHandles()) {
		  driver.switchTo().window(window2);
	  }
	  
	  
	  
	  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
	  su.Searchuser2(coding);
	  
	  Bazyabi ba = PageFactory.initElements(driver, Bazyabi.class);
	  ba.Bazyabi();
	  
	  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8010");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
