package humanresources.pageObjects;

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
	
	
	public void DeactiveUser () throws InterruptedException {
		Thread.sleep(500);


		Thread.sleep(3000);
		Expand.click();

		
		deactiveButton.click();
		Thread.sleep(3000);
		
		Confirmation.click();
		Thread.sleep(3000);

	}
	
	 
}
