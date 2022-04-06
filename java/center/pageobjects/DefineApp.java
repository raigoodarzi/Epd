package center.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefineApp {
	WebDriver driver;
@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/app-aside-center-nav/div/div/a[2]")
WebElement Defineapp;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application/ul/li[2]/a")
WebElement sabtebarname;


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add"
		+ "-application/div[1]/div[2]/div/form/div/div[1]/div[1]/"
		+ "div[1]/kendo-combobox/span/kendo-searchbar/input")
WebElement AppGroup;



@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application"
		+ "/div[1]/div[2]/div/form/div/div[1]/div[1]/d"
		+ "iv[2]/kendo-combobox/span/kendo-searchbar/input")
WebElement subGroup;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add"
		+ "-application/div[1]/div[2]/div/form/div/div[1]/div[1]/div[3]/input")
WebElement AppName;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application/div[1]/"
		+ "div[2]/div/form/div/div[1]/div[1]/div[4]/input")
WebElement AppEnName;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application"
		+ "/div[1]/div[2]/div/form/div/div[1]/div[1]"
		+ "/div[5]/kendo-combobox/span/kendo-searchbar/input")
WebElement useType;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application"
		+ "/div[1]/div[2]/div/form/div/div[1]/div[1]/div[6]/input")
WebElement Code;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application/div[1]/div[2]/"
		+ "div/form/div/div[1]/div[2]/div[1]/div/div[1]/input")
WebElement Address;

@FindBy(id = "fileUploader")
WebElement Upload;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add"
		+ "-application/div[1]/div[2]/div/form/div/div[2]/button")
WebElement Save;

public void defineapp( WebDriver driver, String Appname , String AppEnname, String code,String logo) throws InterruptedException {
	
	Highliter  Hi =  PageFactory.initElements(driver, Highliter.class);
	
	
	Thread.sleep(2000);
	Hi.highLighterMethod(driver, Defineapp);
	Defineapp.click();
	
	Hi.highLighterMethod(driver, sabtebarname);
	sabtebarname.click();
	
	Hi.highLighterMethod(driver, AppGroup);
	AppGroup.click();
	
	AppGroup.sendKeys(Keys.ARROW_DOWN);
	AppGroup.sendKeys(Keys.ARROW_DOWN);
	AppGroup.sendKeys(Keys.ARROW_DOWN);
	AppGroup.sendKeys(Keys.ARROW_DOWN);
	AppGroup.sendKeys(Keys.TAB);
	
	//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Hi.highLighterMethod(driver, subGroup);

	subGroup.click();
	subGroup.sendKeys(Keys.DOWN);
	subGroup.sendKeys(Keys.ENTER);
	
	
	Hi.highLighterMethod(driver, AppName);
	AppName.sendKeys(Appname);
	
	Hi.highLighterMethod(driver, AppEnName);
	AppEnName.sendKeys(AppEnname);
	
	
	Hi.highLighterMethod(driver, useType);
	useType.sendKeys(Keys.DOWN);
	useType.sendKeys(Keys.DOWN);
	
	Hi.highLighterMethod(driver, Code);
	Code.sendKeys(code);
	
	Hi.highLighterMethod(driver, Upload);
	Upload.sendKeys(logo);
	
	Hi.highLighterMethod(driver, Save);
	Save.click();
	
	
}
}
