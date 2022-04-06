package humanresources.TestCases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.Highliter;
import humanresources.pageObjects.Deactive;
import humanresources.pageObjects.Login;
import humanresources.pageObjects.SerchUser;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Deactive_TC {
	WebDriver driver;
	@DataProvider(name = "deactive")
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/deactive.csv"),',','\'',1);
		String nextline[];
		List<Object[]> MyData = new ArrayList<Object[]>();
		
		while((nextline =Reader.readNext())!=null) {
			MyData.add(nextline);
			
		}
		
		Reader.close();
		return MyData.iterator();
		
	}
  @Test(dataProvider = "deactive")
  public void f(String user , String pass , String coding , String Duser , String Dpass) throws InterruptedException, AWTException {
	  
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, user, pass);
	  
	 
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]"
	  		+ "/his-home/div/div/div/div/nav/div/div[3]/a")).click();   //go to hr
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  
	  for (String Window2 : driver.getWindowHandles()) {
		  driver.switchTo().window(Window2);
		 
	  }



		  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
		  su.Searchuser2(coding);
		  
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
		  Deactive deactive = PageFactory.initElements(driver, Deactive.class);
		  deactive.DeactiveUser();
		  
		 
	     Thread.sleep(2000);
	  
	     driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/app-header/header/div/div/div[2]/div[1]/a[2]")).click();  //return to landing 
  
	     Thread.sleep(2000);

	  
	     driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[1]/div[3]/span/a")).click();  //exit from landing 
	  
	     Thread.sleep(5000);
	     
	   
	     lo.loginepd(driver, Duser, Dpass);
	   
	  
	     
	     
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
