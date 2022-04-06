package center.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CenterActivity {
	WebDriver driver;
@FindBy(id= "centerName")
WebElement cneterName;

@FindBy(xpath= "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-center/div/div/div/form/div[1]/div/button")
WebElement search;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-center"
		+ "/div/div/div/div/kendo-grid"
		+ "/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/a[3]")
WebElement takhsis;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-activity-to-center/div/div[1]"
		+ "/form/div[1]/div[2]/kendo-combobox/span/kendo-searchbar/input")
WebElement AppsGroup;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/"
		+ "app-add-activity-to-center/div/div[1]/"
		+ "form/div[1]/div[3]/kendo-combobox/span/kendo-searchbar/input")
WebElement SubGroup;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-activity-to-center/div/"
		+ "div[1]/form/div[1]/div[2]/kendo-combobox/span/span/span")
WebElement SubGroup2;

@FindBy(xpath = "//ul/li[text()='HIS Windows Base']")
WebElement app;

@FindBy(xpath = "//ul/li[text()='طب تصویری']")
WebElement sub;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-activity"
		+ "-to-center/div/div[1]/form/div[1]/div[3]/kendo-combobox/span/span")
WebElement sub1;   //open dropdown

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-activity"
		+ "-to-center/div/div[1]/form/div[1]/div[4]/mat-form-field/div/"
		+ "div[1]/div[2]/mat-datepicker-toggle/button")
WebElement tarikh;

@FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar"
		+ "/div/mat-month-view/table/tbody/tr[4]/td[4]")

//@FindBy(xpath = "//td[role = 'gridcell']")
WebElement tarikh2;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app"
		+ "-add-activity-to-center/div/div[2]/kendo-grid/div/kendo-grid-list"
		+ "/div/div[1]/table/tbody/tr[5]/td[1]/input")
WebElement moayene;

@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add"
		+ "-activity-to-center/div/div[2]/kendo-grid/div/"
		+ "kendo-grid-list/div/div[1]/table/tbody/tr[8]/td[1]/input")
WebElement physiotropi;


@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-activity"
		+ "-to-center/div/div[1]/form/div[2]/div/button[1]")
WebElement Save;

public CenterActivity(WebDriver driver) {
	
}


public void centeractivity(String CenterName ) throws InterruptedException {

    Thread.sleep(1000);
	cneterName.sendKeys(CenterName);
	search.click();
//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	Thread.sleep(3000);
	takhsis.click();    //open center/activity page
	Thread.sleep(500);
	
	SubGroup2.click();  //open appsgroup
	Thread.sleep(500);
	
	app.click();      //click  on apptype

	sub1.click();      //open subroups
	Thread.sleep(500);
	sub.click();       //click on app
	
	Thread.sleep(1000);
	tarikh.click();
	tarikh2.click();
	Thread.sleep(500);
	moayene.click();
	physiotropi.click();
	
	Save.click();
}
}


