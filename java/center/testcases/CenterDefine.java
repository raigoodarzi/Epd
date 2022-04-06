package center.testcases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import center.pageobjects.DefineCenter;
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

public class CenterDefine {
	WebDriver driver;
	@DataProvider(name = "CenterDefine")
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader Reader = new CSVReader(new FileReader("./src/test/resources/data/centerdefine3.csv"),',','\'',1);
		String [] nextline;
		List<Object[]> MyEntries = new ArrayList<Object[]>();
		while((nextline = Reader.readNext())!=null) {
			MyEntries.add(nextline);
		}
		Reader.close();
		return MyEntries.iterator();
				}
	
  @Test(dataProvider = "CenterDefine")
  public void f( String user , String pass ,String CenterName, String EnName , String CenterCode , String Nationalcode, String  ecoCode ,String ostan , String city,
		    String cloudUrl,String hisUrl , String codeposti , String address , String tell ) throws InterruptedException {
	  
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, user, pass);
	  
	  Thread.sleep(5000);

	  WebElement Center = driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]"
	  		+ "/div/div[2]/his-home/div/div/div/div/nav/div/div[6]/a"));   
	  Center.click();  //click on center's icon
	  	  
	  Thread.sleep(2000);
	  for (String window : driver.getWindowHandles())
	  driver.switchTo().window(window);  //go to center page
  		
	   Thread.sleep(3000);
	   DefineCenter DC = PageFactory.initElements(driver, DefineCenter.class);
	   DC.Define(CenterName, EnName, CenterCode, Nationalcode, ecoCode, ostan,city,cloudUrl, hisUrl ,codeposti, address, tell);
  }

	  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://79.175.176.91:8010/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	
  }

}
