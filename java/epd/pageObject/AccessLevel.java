package epd.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessLevel {
	WebDriver driver;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/app-menu/div/nav/ul/li[2]/a")
WebElement Security;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/app-menu/div/nav/ul/li[2]/ul/li[1]/a")
WebElement Access;


@FindBy(xpath ="/html/body/app-root/div/app-hr-layout/div/div/div/app-security/form/d"
		+ "iv[1]/div[1]/div/div/div/div/div/kendo-combobox/span/kendo-searchbar/input")
WebElement Kendo;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-security/form/div[3]/div/div/div/div/div/div[1]/input")
WebElement CheckBox;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-security/form/div[3]/"
		+ "div/div/div/div/div/div[2]/div[3]/div/div/section/div/div[7]/input")
WebElement CheckBox2; // active employee

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-security/form"
		+ "/div[3]/div/div/div/div/div/div[2]/div[3]/div/div/section/div/div[1]/input")
WebElement ChechBox3; // Edit employee ;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-security/form/div[1]/div[2]/div/button[1]")
WebElement save;


public void AccessLevel() throws InterruptedException {
	
	
	
	Security.click();
	Access.click();
	Thread.sleep(3000);
	//Expand.click();
	 Kendo.click();
	 Kendo.sendKeys(Keys.ARROW_DOWN);
	 Thread.sleep(1000);
	 CheckBox.click();
	 CheckBox2.click();
	 ChechBox3.click();
	 save.click();
}
}
