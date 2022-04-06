package center.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchApp {
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/app-aside-center-nav/div/div/a[2]/span")
	WebElement DefineApp;
	
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application"
			+ "/div[1]/div[1]/div/form/div/div[1]/kendo-combobox/span/span/span")
	WebElement AppGroup;
	
	@FindBy(xpath = "//ul/li[text()='HIS Windows Base']")
	WebElement app;
	
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application/div[1]/"
			+ "div[1]/div/form/div/div[2]/kendo-combobox/span/span/span")
	WebElement subapp;
	
	@FindBy(xpath = "//ul/li[text() = 'طب تصویری']")
	WebElement subapp1;
	
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application/"
			+ "div[1]/div[1]/div/form/div/div[3]/a[1]")
	WebElement search;
	
	
	public void searchingapp(WebDriver driver) {
		
		Highliter HI = PageFactory.initElements(driver, Highliter.class); 
		HI.highLighterMethod(driver, DefineApp);
		DefineApp.click();
		
		HI.highLighterMethod(driver, AppGroup);
		AppGroup.click();
		
		HI.highLighterMethod(driver, app);
		app.click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		HI.highLighterMethod(driver, subapp);
		subapp.click();
		
		HI.highLighterMethod(driver, subapp1);
		subapp1.click();
		
		HI.highLighterMethod(driver, search);
		search.click();
	}
	

}
