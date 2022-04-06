package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.CenterActivity;
import center.pageobjects.DeleteCenter;
import center.pageobjects.Login;

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
import org.testng.annotations.AfterMethod;

public class DeleteCenterTC {
	WebDriver driver;
	@DataProvider(name = "delete")
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader Reader = new CSVReader (new FileReader("./src/test/resources/data/delet.csv"),',','\'',1);
		String nextline[];
		List<Object[]> mydata =new ArrayList<Object[]>();
		
		while((nextline = Reader.readNext())!=null) {
			mydata.add(nextline);
		}
		
		Reader.close();
		return mydata.iterator();
		
	}
  @Test(dataProvider = "delete")
  public void f(String user , String pass , String centername) throws InterruptedException {
	  Login lo = PageFactory.initElements(driver, Login.class);   //login to landing
	  lo.loginepd(driver, user, pass);
	  
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
	  
	 WebElement center = driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his"
	 		+ "-home/div/div/div/div/nav/div/div[6]/a"));
	 
	 center.click();    //go to center page
	 
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 
	 for(String window : driver.getWindowHandles()) {
		 driver.switchTo().window(window);
		 
	 }
	  
	 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
	 DeleteCenter  Dc = PageFactory.initElements(driver, DeleteCenter.class);
	 Dc.centerdelete(centername);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver  = new ChromeDriver();
	  driver.get("http://79.175.176.91:8010/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
