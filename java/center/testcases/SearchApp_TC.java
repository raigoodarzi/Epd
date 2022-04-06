package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.Login;
import center.pageobjects.SearchApp;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SearchApp_TC {
	WebDriver driver;
	@DataProvider(name = "search")
	
	public Iterator<Object[]> Provider() throws IOException{
		
	CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/logindata.csv"),',','\'',1);
	String nextline[];
	List<Object[]> mydata = new ArrayList<Object[]>();
	
	while((nextline = Reader.readNext())!= null) {
		mydata.add(nextline);
	}
	
	Reader.close();
	return mydata.iterator();
	}
	
  @Test(dataProvider  = "search")
  public void f(String username ,  String password) throws InterruptedException {
	  
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, username, password);
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/"
	  		+ "div[2]/his-home/div/div/div/div/nav/div/div[6]/a")).click();  //open center
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window);            //switch  to center page
	  }
	  
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  SearchApp SA = PageFactory.initElements(driver, SearchApp.class);
	  SA.searchingapp(driver);
	  
	  WebElement Mri = driver.findElement(By.xpath("/html/body/app-root/app-center"
	  		+ "-layout/div[1]/div/div/div/app-add-application"
	  		+ "/div[2]/div/div/div/div/table/tbody/tr[4]/td[6]"));   //find a webelement
	  
	  
	 // Assert.assertEquals(Mri.getText(), "ثبت فیلم MRI");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8010/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
