package humanresources.TestCases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.Login;
import humanresources.pageObjects.Adduser;

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
import org.testng.annotations.AfterMethod;

public class AddUser_TC {
	WebDriver driver;
	@DataProvider(name = "ADD")
	public Iterator<Object[]> Provider() throws IOException{
		
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/data/AddingUser.csv"),',','\'',1);
		List<Object[]> MyData = new ArrayList<Object[]>();
		String Nextline[];
		
		while((Nextline = reader.readNext())!= null) {
			MyData.add(Nextline);
		}
		
		reader.close();
		return MyData.iterator();
		
	}
	
  @Test(dataProvider = "ADD")
  public void f(String user,String pass,String Name , String familyName , String fatherName , String sex ,String birhtDate ,
			String placeOfBirth , String Nationalcode , String status, String email,String tel ,String City,
			String address ,String ZipCode ,String UserType ,String education ,String startDate ,String group ,
			String Aria ,String role ,String startDate2 ,String education2 ,String Place ,String Duration ,String Unit) throws InterruptedException {
	  
	  Login Lo = PageFactory.initElements(driver, Login.class);
	  Lo.loginepd(driver, user, pass);                           //login to landing
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his-home"
	  		+ "/div/div/div/div/nav/div/div[3]/a")).click();     //login to hr
	  
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window);
	  }
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/"
	  		+ "app-employee-list/div/div[2]/div[2]/button[1]")).click();   //click on afzudan
	  
	  Adduser add = PageFactory.initElements(driver, Adduser.class);
	  add.AddEmploye(  Name ,  familyName ,  fatherName ,  sex , birhtDate ,
				 placeOfBirth ,  Nationalcode ,  status,  email, tel , City,
				 address , ZipCode , UserType , education , startDate , group ,
				 Aria , role , startDate2 , education2 , Place , Duration , Unit);
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
