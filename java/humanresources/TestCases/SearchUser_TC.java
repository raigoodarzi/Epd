package humanresources.TestCases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import humanresources.pageObjects.Login;
import humanresources.pageObjects.SerchUser;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class SearchUser_TC {
	WebDriver driver;
	@DataProvider(name = "search")
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/Search-hr.csv"),',','\'',1);
		String nextline[];
		List<Object[]> MyData =new ArrayList<Object[]>();
		while((nextline = Reader.readNext())!=null) {
			MyData.add(nextline);
		}
		Reader.close();
		return MyData.iterator();
		
		
	}
  @Test(dataProvider = "search")
  public void f(String user , String pass , String nationalcode ) throws InterruptedException {
	 Login lo = PageFactory.initElements(driver, Login.class);
	 lo.loginepd(driver, user, pass);
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his-home/"
	 		+ "div/div/div/div/nav/div/div[3]/a")).click();   //click on hr
	 
	
	 
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window);
		  
	  }
	  

	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  SerchUser su = PageFactory.initElements(driver, SerchUser.class);
	  su.Searchuser2(nationalcode);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8010"
	  		+ "/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
