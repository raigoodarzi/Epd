package center.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCenter {
	
	@FindBy(id = "centerName")
	WebElement CenterName;
	
	@FindBy(xpath= "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-center/div/div/div/form/div[1]/div/button")
	WebElement search;
	
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-center/div/div/div/div/"
			+ "kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/a[2]")
	WebElement deleteicone;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container"
			+ "/app-delete-center-confirmation-dialog/div/div[2]/div/div/button[1]")
	WebElement confirm;
	
	
	public DeleteCenter(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	public void centerdelete(String name) throws InterruptedException {
		
		CenterName.sendKeys(name);
		search.click();
		Thread.sleep(2000);
		deleteicone.click();
		confirm.click();
	}
}
