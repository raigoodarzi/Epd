package testcasbackup;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import epd.pageObject.Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class HrLogin {
	WebDriver driver;
	
	@DataProvider(name = "LoginHr")
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader reader = new CSVReader(new FileReader("D:\\webDriver-goudarzi\\eclipse-workspace\\epd\\src\\test\\resources\\data\\logindata.csv"), ',', '\'', 1);
		List <Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextline ;
		while ((nextline = reader.readNext()) !=null) {
			myEntries.add(nextline);
		}
		
		reader.close();
		return myEntries.iterator();
	}
	
	
  @Test(dataProvider = "LoginHr")
  public void f(String username , String Password) throws InterruptedException {
	  Login hlogin = PageFactory.initElements(driver, Login.class);
	  hlogin.loginepd(username, Password);
	  Thread.sleep(2000);
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
  public void afterMethod() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.close();
  }

}
