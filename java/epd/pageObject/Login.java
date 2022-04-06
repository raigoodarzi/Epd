package epd.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[1]/div/input")
	WebElement username;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[2]/div/input[2]")
	WebElement password;
	
	@FindBy(xpath = "/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[3]/button")
	WebElement loginButton;
	
	public void Login(WebDriver driver) {
		
		driver.get("http://79.175.176.91:8013/home");
		
		
	}
	public void loginepd(String user , String pass) throws InterruptedException {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
		Thread.sleep(3000);
		
	}
}
