package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.EntesabKarmand;
import epd.pageObject.LoginTohr;
import epd.pageObject.SerchUser;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Entesab {
	WebDriver driver;
	String username = "0853870942";
	String password = "m4K0i3v8";
	String target = "0680708601";
	
  @Test
  public void f() throws InterruptedException, AWTException {
	  Thread.sleep(3000);
	  LoginTohr lh = PageFactory.initElements(driver, LoginTohr.class);
	  lh.Logintohr(driver, username, password);
	  Thread.sleep(8000);
	  
	  String window1 = driver.getWindowHandle();
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
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8013/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
