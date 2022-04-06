package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.Login;
import center.pageobjects.Variable;

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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class AddVariable_TC {
	WebDriver driver;
	@DataProvider(name = "variable")
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/Variables.csv"),',','\'',1);
		String NextLine[];
		List<Object[]>  MyData = new ArrayList<Object[]>();
		
		while((NextLine = Reader.readNext())!= null) {
			MyData.add(NextLine);
			
		}
		
		Reader.close();
		return MyData.iterator();
		
 		
	}
  @Test(dataProvider = "variable")
  public void f(String user , String pass , String Appname , String AppEnname , String Groupename,String GroupEnname, String MahiyatName, String MAhiyatEnName ) throws InterruptedException {
	  
	  Login Lo = PageFactory.initElements(driver, Login.class);
	  Lo.loginepd(driver, user, pass);              // Login to landing 
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]"
	  		+ "/his-home/div/div/div/div/nav/div/div[6]/a")).click();        //click on  center icone
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  for(String newwindow : driver.getWindowHandles()) {
		  driver.switchTo().window(newwindow);
	  }
	  
	  Variable Va = PageFactory.initElements(driver, Variable.class);
	  Va.AddVariable(driver, Appname, AppEnname, Groupename, GroupEnname, MahiyatName, MAhiyatEnName);
	  
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
