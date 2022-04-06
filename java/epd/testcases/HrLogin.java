package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.Login;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class HrLogin {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Login hlogin = PageFactory.initElements(driver, Login.class);
	  hlogin.loginepd("0266578179", "5570010238Aa");
	  Thread.sleep(3000);
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("/html/body/app-root/div/app-layout/"
	  		+ "div/div/his-home/div[1]/div/div[1]/nav/ul/li[2]/a/span"))).click().perform();
	  
	  
	//  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/his-home/div[1]/div/div[1]/nav/ul/li[2]/a/span")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://79.175.176.91:8013/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
