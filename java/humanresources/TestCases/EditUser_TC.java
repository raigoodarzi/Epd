package humanresources.TestCases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import epd.pageObject.SerchUser;
import humanresources.pageObjects.EditUser;
import humanresources.pageObjects.Login;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class EditUser_TC {
	WebDriver driver;
	@DataProvider(name = "Edit")
	public  Iterator<Object[]> Provider() throws IOException{
	
		CSVReader Reader = new CSVReader(new FileReader ("./src/test/resources/data/EditUser.csv"),',','\'',1);
		String Nextline[];
		List<Object[]> MyData = new ArrayList<Object[]>();
		while((Nextline = Reader.readNext())!=null) {
			MyData.add(Nextline);
		}
		
		Reader.close();
		return MyData.iterator();
   	}
  @Test(dataProvider = "Edit")
  public void f(String user , String pass ,String Coding, String  lastname , String familyName,String fatherName , String sex 
		  ,String BirthDate,String PBirth, String Email, String tell , String city , String address ,String zipcode,
		  String education ,String StartDate ,String education2) throws InterruptedException {
	  Login lo = PageFactory.initElements(driver,Login.class);
	  lo.loginepd(driver, user, pass);
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]"
	  		+ "/his-home/div/div/div/div/nav/div/div[3]")).click();    //click on hr
	  
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window);
		 
	  }
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  
	  SerchUser SU = PageFactory.initElements(driver, SerchUser.class);
	  SU.Searchuser2(Coding);
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/"
	  		+ "app-employee-list/div/div[3]/employee-grid/div[2]/div/div"
	  		+ "/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[13]/a")).click();
	  
	  
	  
	  
	  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	  
	  EditUser EU = PageFactory.initElements(driver, EditUser.class);
	  EU.EditEmployee(lastname, familyName, fatherName, sex, BirthDate, PBirth, Email, tell
			  ,city,address ,zipcode,education ,StartDate ,education2);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8010");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
