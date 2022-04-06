package epd.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Deactive {
	WebDriver driver;

	@FindBy(xpath  = "/html/body/app-root/div/app-hr-layout/div/div/div/app-empl"
			+ "oyee-list/div/div[2]/div[1]/div/employee-search/form/div[4]/div/input")
	WebElement nationalCode;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-"
			+ "list/div/div[2]/div[1]/div/employee-search/form/div[6]/button[1]")
	WebElement search;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-list/div/div[3]"
			+ "/employee-grid/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a")
	WebElement Expand;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-list/div"
			+ "/div[3]/employee-grid/div[2]/div/div/kendo-grid/div/kendo-grid-"
			+ "list/div/div[1]/table/tbody/tr[2]/td[2]/div/sub-grid/div/div/div/div/div/div/a[1]")
	WebElement Confirmation;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-list/div/div[3]/employee-grid/div[2]/div/div/kendo-grid/div/kendo-grid-li"
			+ "st/div/div[1]/table/tbody/tr[2]/td[2]/div/sub-grid/div/div/div[2]/div/button[1]")
	WebElement deactiveButton;
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[1]/div/input")
	WebElement username;
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[2]/div/input[2]")
	WebElement password;
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[3]/button")
	WebElement loginButton;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee"
			+ "-list/div/div[2]/div[1]/div/div/div[2]/span[2]")
	WebElement AdvancedSearch;
	
	
	
//	public void Deactive() throws InterruptedException {
//		
//		//driver.navigate().to("http://79.175.176.91:8007/employee/info");
//		Thread.sleep(12000);
//	}
	public void DeactiveUser (String coding ) throws InterruptedException {
		Thread.sleep(500);


		Thread.sleep(3000);
		Expand.click();

		
		deactiveButton.click();
		Thread.sleep(3000);
		
		Confirmation.click();
		Thread.sleep(3000);

	}
	
	public void loginDeactive(String user , String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
		
	}
	
	
	
	
//	public void Deactive(WebDriver driver) {
//		
//		
//	}
	 
}
