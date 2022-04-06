package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.Deactive;
import epd.pageObject.Login;
import epd.pageObject.LoginTohr;
import epd.pageObject.SerchUser;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.testng.annotations.AfterMethod;

public class DeactiveTestCase {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  LoginTohr lo = PageFactory.initElements(driver, LoginTohr.class);
	  lo.Logintohr(driver, "0853870942", "m4K0i3v8");
	 
	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  Thread.sleep(5000);
	  System.out.println(driver.getCurrentUrl());
	  driver.navigate().to("http://79.175.176.91:8007/employee/info");
	  System.out.println(driver.getCurrentUrl());
	  Thread.sleep(5000);
	  
	  String window1 = driver.getWindowHandle();
	
	  
	  for (String Window2 : driver.getWindowHandles()) {
		  driver.switchTo().window(Window2);
		  System.out.println(driver.getCurrentUrl());
	  }
//	  driver.close();	
//	  driver.switchTo().window(window1);
//	  
	  Thread.sleep(5000);
//	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-"
//	  		+ "list/div/div[2]/div[1]/div/div/div[2]/span[2]")).click();
	 
		  System.out.println(driver.getCurrentUrl());

		  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
		  su.Searchuser2("0174683316");
	  
		  Deactive deactive = PageFactory.initElements(driver, Deactive.class);
		  deactive.DeactiveUser( "0174683316");
	  
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/app-header/header/div/div/div[2]/div[1]/a[2]")).click();  //return to landing 
  
	  WebDriverWait driverwait = new WebDriverWait(driver, 10);
	  
	  driverwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/app-root/d"
	  		+ "iv/app-layout/div/div/app-header/header/div[3]/div[2]"))));
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/app-header/header/div[3]/div[2]")).click();  //exit from landing 
	  
	  Thread.sleep(2000);
	  deactive.loginDeactive("0792391640", "tG4Q4C18");
			  
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
