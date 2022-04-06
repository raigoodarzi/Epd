package center.pageobjects;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Variable {
@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/app-aside-center-nav/div/div/a[3]")
WebElement Variables;   //متغیرها منوی

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable/div/div/div/div/kendo-grid/div"
		+ "/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/a")
WebElement AppsGroup;  //اصلی گروه


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable/div/div/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]"
		+ "/td[2]/div/app-variable-sub-grid/kendo-grid/kendo-grid-toolbar/a/i")
WebElement AddAppVariable;   //متغیرها لینک 



@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable"
		+ "/div/div/div/form/div[2]/div[2]/div/div[2]/input")
 
WebElement Variablename;    //متغیر نام 


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable"
		+ "/div/div/div/form/div[2]/div[2]/div/div[3]/input")
WebElement VariableEnname;   //متغیر انگلیسی نام 


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-"
		+ "variable/div/div/div/form/div[1]/div/button[1]")
WebElement save;


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable/div/div/div/div/kendo-grid/div/"
		+ "kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[1]/a")
WebElement CenterGroups;     //مرکز گروه 


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable/div/div/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[3]/td[2]/div/app-"
		+ "variable-sub-grid/kendo-grid/kendo-grid-toolbar/a")
WebElement AddCenterGroup;    // مرکز لینک


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable/div/div/div/div/kendo"
		+ "-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[3]/td[1]/a")
WebElement mahiyat;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-variable/div/div/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[4]/td[2]"
		+ "/div/app-variable-sub-grid/kendo-grid/kendo-grid-toolbar/a")
WebElement Addmahiyat;



public void AddVariable(WebDriver driver , String Appname , String AppEnname , String Groupename , String GroupEnname , String MahiyatName ,String MAhiyatEnName ) throws InterruptedException {

	

	Variables.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	
	AppsGroup.click();
	
	
	AddAppVariable.click();


	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	
	Variablename.click();
	

	Actions action = new Actions(driver);
	action.sendKeys(Variablename, Appname).perform();

	

	VariableEnname.sendKeys(AppEnname);
	
	

	save.click();         //Add AppsGroup
	
	AppsGroup.click();
	
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	
	CenterGroups.click();
	AddCenterGroup.click();
	
	Actions action1 = new Actions(driver);
	action1.sendKeys(Variablename, Groupename).perform();
	
	VariableEnname.sendKeys(GroupEnname);
	
	
	save.click();        //Add CenterGroup
	
	CenterGroups.click();
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	mahiyat.click();
	Addmahiyat.click();
	
	Actions action2 = new Actions(driver);
	action2.sendKeys(Variablename, MahiyatName).perform();
	VariableEnname.sendKeys(MAhiyatEnName);
	save.click();        //Add Mahiyat
	mahiyat.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}
}
