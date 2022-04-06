package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.Bazyabi;
import epd.pageObject.LoginTohr;
import epd.pageObject.SerchUser;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class BazyabiRamz {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  LoginTohr Lohr = PageFactory.initElements(driver, LoginTohr.class);
	  Lohr.Logintohr(driver, "0853870942", "m4K0i3v8");
	  Thread.sleep(10000);
	  
	
	  String window1 = driver.getCurrentUrl();  //Switch be safhe etelaate karbaran
	  for(String window2 :driver.getWindowHandles()) {
		  driver.switchTo().window(window2);
	  }
	  
	  
	  
	  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
	  su.Searchuser2("0078499682");
	  
	  Bazyabi ba = PageFactory.initElements(driver, Bazyabi.class);
	  ba.Bazyabi();
	  
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
