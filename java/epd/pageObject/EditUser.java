package epd.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUser {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee"
			+ "-list/div/div[3]/employee-grid/div[2]"
			+ "/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[13]")
	WebElement EditButton;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/"
			+ "div[1]/div/contact/form/div/div[1]/div[2]"
			+ "/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[5]/button[1]")
	WebElement EditButton2; //phone table
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2"
			+ "]/div[1]/div/contact/form/div/div[1]/div[1]/div[2]/div/input")
	WebElement phone;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/"
			+ "div[2]/div[2]/div[2]/div[1]/div/contact/form/div/div[2]/div/button")
	WebElement Add;
	
	@FindBy(xpath= "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[1]/button[1]")
	WebElement Save;
	
	public void EditUser() {
		
	}
	
	public void Edit(String coding,String tell) throws InterruptedException {
//		SerchUser su = PageFactory.initElements(driver, SerchUser.class);
//		su.Searchuser2(coding);
		EditButton.click();
		Thread.sleep(3000);
		EditButton2.click();
		phone.clear();
		Thread.sleep(2000);
		phone.sendKeys(tell);
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(500);
		Save.click();
	}
}
