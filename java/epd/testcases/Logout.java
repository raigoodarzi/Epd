package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.LoginTohr;

import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Logout {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  LoginTohr lh = PageFactory.initElements(driver, LoginTohr.class);
	  lh.Logintohr(driver, "0853870942", "m4K0i3v8");
	  
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window);
	  }
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement exitButton;
	  exitButton = driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/app-header/header/div/div/div[2]/div[1]/a[2]"));
	  exitButton.click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8013/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	
	  
	  
  }

}
