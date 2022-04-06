package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.AccessLevel;
import epd.pageObject.LoginTohr;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class SecurityTestCase {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  LoginTohr lh = PageFactory.initElements(driver, LoginTohr.class);
	  lh.Logintohr(driver, "0853870942", "m4K0i3v8");
	  
	  for(String Window : driver.getWindowHandles()) {
		  driver.switchTo().window(Window);
		 
	  }
	  
	  Thread.sleep(3000);
	  AccessLevel access = PageFactory.initElements(driver, AccessLevel.class);
	  access.AccessLevel();
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
