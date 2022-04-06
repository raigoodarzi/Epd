package testcasbackup;

import org.testng.annotations.Test;

import epd.pageObject.Afzodankarbar;
import epd.pageObject.Login;
import epd.pageObject.LoginTohr;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class AddEmployee {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  
	 LoginTohr  loginhr = PageFactory.initElements(driver, LoginTohr.class);
	 loginhr.Logintohr(driver, "0853870942", "m4K0i3v8");
	 driver.navigate().to("http://79.175.176.91:8007/employee/info");
	 
	 Thread.sleep(6000);

	 String winHandleBefore = driver.getWindowHandle();   //first window
	 Actions action = new Actions(driver);
	 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main\"]/app-employee-list/div/div[2]/div[2]/button[1]"))).click().perform();
	
	 driver.navigate().to("http://79.175.176.91:8007/employee/add");
	 
	
	 
	 for(String winHandle : driver.getWindowHandles()){
		 driver.switchTo().window(winHandle);
		}
	 
	 driver.switchTo().window(winHandleBefore);
	 Thread.sleep(10000);
	 
	 Afzodankarbar  Ak = PageFactory.initElements(driver, Afzodankarbar.class);
	 Ak.Afzodan(driver, "0078499682");

	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8013/home");
	  driver.manage().window().maximize();
	
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
