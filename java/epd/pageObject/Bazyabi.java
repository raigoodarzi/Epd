package epd.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bazyabi {
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-list/div/div[3]/employee-grid/div[2]/div/div/kendo-grid/"
			+ "div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a")
	WebElement Expand;
	
	@FindBy(id = "restPassBtn")
	WebElement resetButton;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-list/div/div[3]/employee-"
			+ "grid/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/di"
			+ "v[1]/table/tbody/tr[2]/td[2]/div/sub-grid/div/div/div/div/div/div/a[1]")
	WebElement Confirm;
	
	public void Bazyabi() throws InterruptedException {
		Thread.sleep(3000);
		Expand.click();
		resetButton.click();
		Thread.sleep(3000);
		Confirm.click();
		
	}
}
