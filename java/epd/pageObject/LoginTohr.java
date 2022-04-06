package epd.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTohr {
	WebDriver driver;
	@FindBy(xpath = "/html/body/app-root/div/app-layout/div/div/his-home/div[1]/div/div[1]/nav/ul/li[2]")
	WebElement hr;


	public void Logintohr(WebDriver driver,String user , String pass) throws InterruptedException {
		Login lohr = PageFactory.initElements(driver, Login.class);
		
		lohr.loginepd(user, pass);
		Thread.sleep(8000);
		Actions action = new Actions(driver);
		action.moveToElement(hr).click().perform();
		
	}
}
