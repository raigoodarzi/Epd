package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.Login;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class loginTestCase {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {

	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd("0266578179", "5570010238Aa");
	 /// lo.loginepd(user, pass);
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
