package center.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//WebDriver driver;
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[1]/div/input")
	WebElement username;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[2]/div/input[1]")
	WebElement password;
	

	@FindBy(xpath = "/html/body/div[2]/div[3]/div[1]/div/div/span/div[3]")
	WebElement RecaptchCheckBox;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[4]/button")
	WebElement loginButton;
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[3]/re-captcha/div/div/iframe")
	WebElement Frame;
	
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")
	WebElement Recaptchacheckbox;
	public void Login( WebDriver driver) {
		
		driver.get("http://79.175.176.91:4010");
		
		
	}
	public void loginepd(WebDriver driver ,String user , String pass) throws InterruptedException {
		
		Highliter HI = PageFactory.initElements(driver, Highliter.class);
		HI.highLighterMethod(driver, username);
		
		Thread.sleep(2000);
		username.sendKeys(user);
		
		HI.highLighterMethod(driver, password);
		password.sendKeys(pass);
		Thread.sleep(2000);

		HI.highLighterMethod(driver, Frame);
		driver.switchTo().frame(Frame);
		Thread.sleep(2000);
		
		
		HI.highLighterMethod(driver, Recaptchacheckbox);
		Recaptchacheckbox.click();
		Thread.sleep(30000);
		
		driver.switchTo().defaultContent();
		
		
		Actions action = new Actions(driver);
		HI.highLighterMethod(driver, loginButton);
		action.moveToElement(loginButton).click().perform();
		
		
		
	}
}
