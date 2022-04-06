package epd.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EntesabKarmand {
	WebDriver driver;
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/app-menu/div/nav/ul/li[2]/a")
	WebElement SecurityPanel;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/app-menu/div/nav/ul/li[2]/ul/li[2]")
	WebElement ActivityGroup;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/user-group"
			+ "-assignment/div/div[3]/employee-grid/div[2]/div/div/kendo"
			+ "-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a")
	WebElement Expand;
	
	
	@FindBy(xpath = "//div/form/div/div/div/kendo-combobox/span/span")
	WebElement Roles;
	
	@FindBy(xpath = "//li[contains(.,'منابع انسانی')]")
	
//	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/user-group-assignment/div/div[3]/employee"
//			+ "-grid/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]"
//			+ "/td[2]/div/sub-grid/div/div/div/div/form/div/div[2]/div/kendo-multiselect/div")
	
	WebElement Roles2;
	
	@FindBy(tagName = "kendo-popup")
	WebElement test;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/user-group-assignment/d"
			+ "iv/div[3]/employee-grid/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table"
			+ "/tbody/tr[2]/td[2]/div/sub-grid/div/div/div/div/form/div/div[3]/a")
	WebElement save;
	
	@FindBy(xpath = "//li[contains(.,'مسئول پشتیبان گروه 1')]")
	WebElement karbar;
	
	public void EntesabKarmand() throws InterruptedException {
		Thread.sleep(3000);
		SecurityPanel.click();
		ActivityGroup.click();
	}
	
	public void EntesabKarmand2() throws InterruptedException, AWTException {
		

		Thread.sleep(2000);
		Expand.click();
		Thread.sleep(500);
		Roles.click();
		
		Roles.click();
//		Roles.sendKeys(Keys.DOWN);
//		Roles.sendKeys(Keys.DOWN);
//		Roles.sendKeys(Keys.DOWN);
//		Roles.sendKeys(Keys.DOWN);
//		Roles.sendKeys(Keys.DOWN);
//		Roles.sendKeys(Keys.DOWN);
//		Roles.sendKeys(Keys.DOWN);
//		Roles.sendKeys(Keys.ENTER);
		//Roles.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		Roles2.click();
		Thread.sleep(500);
	
		test.click();
		

//		Roles2.sendKeys(Keys.DOWN);
		
		
		Thread.sleep(500);
		save.click();
	
		
	
		
		Thread.sleep(3000);
	



		
	}
}
