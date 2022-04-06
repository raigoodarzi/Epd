package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.DefineApp;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class DefineAppTestCase {
	WebDriver driver;
	@DataProvider(name = "Apps")
	public Iterator<Object[]> Provider() throws IOException{
	CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/DefineApp.csv"),',','\'',1);
	String nextline[];
	List<Object[]> MyEnteries = new ArrayList<Object[]>();
	while((nextline = Reader.readNext())!=null) {
		MyEnteries.add(nextline);
		
	}
	
	Reader.close();
	return MyEnteries.iterator();
		
	}
  @Test(dataProvider = "Apps")
  public void f(String user , String pass , String Appname , String AppEnname, String code , String logo) throws InterruptedException {
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, user, pass);
	  driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);  //wait to loading landing
	  
	  WebElement Center = driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]"
	  		+ "/his-home/div/div/div/div/nav/div/div[6]/a"));      //center element
	  Center.click();
	  
	  for(String window: driver.getWindowHandles()) {
		  driver.switchTo().window(window);						//switch to CenterPage
	  }
	  
//	  WebDriverWait wait = new WebDriverWait(driver,3000);
//	  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("searchSubProjectTab"))));
	  
	  Thread.sleep(3000);
	  
	  DefineApp DA = PageFactory.initElements(driver, DefineApp.class);
	  DA.defineapp(driver, Appname, AppEnname, code, logo);
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
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 // driver.close();
  }

}
