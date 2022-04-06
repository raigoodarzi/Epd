package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.EditCenter;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class EditCenter_TC {
	WebDriver driver;
	@DataProvider(name = "Edit")
	public Iterator<Object[]> Provider() throws IOException{
	CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/EdirCenter.csv"),',','\'',1);
	String nextline[];
	
	List<Object[]> MyData =new ArrayList<Object[]>();
	
	while((nextline = Reader.readNext())!= null) {
		MyData.add(nextline);
	}
	Reader.close();
	return MyData.iterator();
	}
		
	
	
  @Test(dataProvider = "Edit")
  public void f(String username, String pass,String centername, String hospitalname,String hospitalEnName , String centerCode,
		  String nationalCode, String ostan, String city, String address, String logo, String phone  ) throws InterruptedException {
	  
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, username, pass);  //Login to landing
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/"
	  		+ "his-home/div/div/div/div/nav/div/div[6]/a")).click();  //click on CenterApp
	  
	  
	  for(String WindowNow : driver.getWindowHandles()) {    //swich to centerApp
		  driver.switchTo().window(WindowNow);
	  }
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  
	  EditCenter EC = PageFactory.initElements(driver, EditCenter.class);
	  EC.edit(driver, centername, hospitalname, hospitalEnName, centerCode, nationalCode, ostan, city, address, logo, phone);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://79.175.176.91:8010/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }









}
