package epd.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SerchUser {
	WebDriver driver;
	
	@FindBy(id = "FamilyName")
	WebElement FamilyName;
	
	@FindBy(id = "NationalCode")
	WebElement NationalCode;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/user-group-ass"
			+ "ignment/div/div[2]/div[1]/div/employee-search/form/div[6]/button[1]")
	WebElement SearchButton; //in  user-group-assignment page
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-employee-list/div"
			+ "/div[2]/div[1]/div/employee-search/form/div[6]/button[1]")
	WebElement SearchButton2;  // in app-employee-list
	


	public void SerchUser1(String Coding) throws InterruptedException {   // in security Page
		Thread.sleep(2000);
		FamilyName.click();
		Thread.sleep(500);
		
		FamilyName.sendKeys(Keys.TAB);
		FamilyName.sendKeys(Keys.TAB);


		NationalCode.sendKeys(Coding);
		Thread.sleep(3000);
		SearchButton.click();
	}
	
	public void Searchuser2(String Coding) throws InterruptedException {   //in app-employee list
		
		Thread.sleep(2000);
		FamilyName.click();
		Thread.sleep(500);
		FamilyName.sendKeys(Keys.TAB);
		FamilyName.sendKeys(Keys.TAB);
		
		NationalCode.sendKeys(Coding);
		Thread.sleep(3000);
		SearchButton2.click();
	}
}
