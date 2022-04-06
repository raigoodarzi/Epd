package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.Login;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class LoginToCenter {
	WebDriver driver;
	@DataProvider(name = "login")
	public Iterator<Object[]> provider() throws IOException{
	CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/logindata.csv"),',','\'',1);
	List <Object[]> myEntries = new ArrayList<Object[]>();
	String [] nextline;
	while ((nextline = Reader.readNext())!=null) {
		myEntries.add(nextline);
	}
	Reader.close();
	return myEntries.iterator();
	}

	
	
  @Test(dataProvider = "login")
  public void f( String user , String pass) throws InterruptedException {
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd( driver, user, pass);
	  Thread.sleep(3000);
	  WebElement Center = driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/"
	  		+ "div[2]/div/div[2]/his-home/div/div/div/div/nav/div/div[6]/a"));   
	  
	  Center.click();  //click on center's icon
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://79.175.176.91:8010/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
