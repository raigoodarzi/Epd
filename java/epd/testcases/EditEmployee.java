package epd.testcases;

import org.testng.annotations.Test;

import epd.pageObject.EditUser;
import epd.pageObject.LoginTohr;
import epd.pageObject.SerchUser;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class EditEmployee {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  LoginTohr  loginhr = PageFactory.initElements(driver, LoginTohr.class);
	  loginhr.Logintohr(driver, "0853870942", "m4K0i3v8");
	  
	  for(String window:driver.getWindowHandles()) {
		  driver.switchTo().window(window);
	  }
	  
	  
	  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
	  su.Searchuser2("0078499682");
	  Thread.sleep(2000);
	// show last data
	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div"
	  		+ "/div/div/app-employee-list/div/div[3]/employee"
	  		+ "-grid/div[2]/div/div/kendo-grid/div/kendo-grid-list"
	  		+ "/div/div[1]/table/tbody/tr/td[13]/a")).click();
	  
	  Thread.sleep(3000);
	//ignore edit
	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[1]/button[2]")).click();  //ignore
	  Thread.sleep(3000);
	  
	  SerchUser su0 = PageFactory.initElements(driver, SerchUser.class);
	  su0.Searchuser2("0680708601");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div"
		  		+ "/div/div/app-employee-list/div/div[3]/employee"
		  		+ "-grid/div[2]/div/div/kendo-grid/div/kendo-grid-list"
		  		+ "/div/div[1]/table/tbody/tr/td[13]/a")).click();
		  
	  
	  
	  EditUser eu = PageFactory.initElements(driver, EditUser.class);
	  
	  eu.Edit("0680708601", "09124568745");
	  

	  SerchUser su1 = PageFactory.initElements(driver, SerchUser.class);
	  su1.Searchuser2("0680708601");
	  Thread.sleep(1000);
	//show afer edit
	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/app"  
	  		+ "-employee-list/div/div[3]/employee-grid/div[2]"
	  		+ "/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[13]")).click();
	  
	  
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
