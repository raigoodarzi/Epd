package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.CenterActivity;
import center.pageobjects.Login;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class CenterActivityTC {
	WebDriver driver;
	@DataProvider(name = "activity")
	public Iterator<Object[]> Provider() throws IOException{
	CSVReader Reader = new CSVReader (new FileReader("./src/test/resources/data/activity.csv"),',','\'',1);
	String nextline[];
	List <Object[]> TestData = new ArrayList<Object[]>();
	while ((nextline = Reader.readNext())!=null) {
		TestData.add(nextline);
	}
	Reader.close();
	return TestData.iterator();
	}
  @Test(dataProvider = "activity")
  public void f(String user,String pass,String CenterName) throws InterruptedException {
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, user, pass);
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  
	  WebElement Center = driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/"
	  		+ "div/div[2]/his-home/div/div/div/div/nav/div/div[6]/a"));
	  Center.click();
	  
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window);
	  }
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  

	  CenterActivity CA = PageFactory.initElements(driver, CenterActivity.class);
	  CA.centeractivity(CenterName);
	 
	  
	  
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
