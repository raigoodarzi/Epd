package center.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCenter {
	
	@FindBy(id = "centerName")
	WebElement Search;
	
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-center/div/div/div/form/div[1]/div/button")
	WebElement SearchButton;
	
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div"
			+ "/app-center/div/div/div/div/kendo-grid/div/kendo"
			+ "-grid-list/div/div[1]/table/tbody/tr/td[7]/a[1]/i")
	WebElement EditButton;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[1]/kendo-combobox/span/span[2]/span")
	WebElement CenterGroups1;
	
	@FindBy(xpath = "//ul/li[text()='پلی کلینیک های خصوصی']")
	WebElement CenterGroups;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[2]"
			+ "/kendo-combobox/span/span[2]/span")
	WebElement mahiyat1;
	
	@FindBy(xpath = "//ul/li[text()='پلی کلینیک']")
	WebElement mahiyat;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[3]/input")
	WebElement hospitalName;
	
	@FindBy(id = "enName")
	WebElement HospitalEnName;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/"
			+ "form/div[1]/div[5]/kendo-numerictextbox/span/input")
	WebElement CentersCode;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-"
			+ "center/div/div[2]/div/form/div[1]/div[6]/input")
	WebElement NationalCode;
	
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/"
			+ "app-add-center/div/div[2]/div/form/div[1]/div[8]/div/a/i")
	WebElement Location;  //select ostan & city
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/mat-dialog-container/app-select-city/div/div[2]/div/div[1]"
			+ "/kendo-combobox/span/kendo-searchbar/input")
	WebElement Ostan;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/mat-dialog-container/app-select-city/div/div[2]/div/div[2]"
			+ "/kendo-combobox/span/kendo-searchbar/input")
	WebElement City;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/mat-dialog-container/app-select-city/div/div[2]/div/div[3]/button[1]")
	WebElement select;
	
	@FindBy(id = "address")
	WebElement  Address;
	
	@FindBy(id = "fileUploader")
	WebElement Logo;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form"
			+ "/div[2]/div[1]/kendo-grid/kendo-grid-toolbar/a/i")
	WebElement AddPhone;  //link telephone
	
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/"
			+ "div/div[1]/kendo-combobox/span/kendo-searchbar/input")
	WebElement Phone;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]"
			+ "/div/div/form/div/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement phone2;   //input phone
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/div/div[4]/button")
	WebElement AddPhone3;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[2]/div[3]/span/button")
	WebElement Save;
	
	public void edit(WebDriver driver ,String centername,String hospitalname, String hospitalEnName,String centerCode,String nationalCode,String ostan,String city,String address,String logo,String phone) throws InterruptedException {
		Thread.sleep(2000);
		
		Search.sendKeys(centername);
		SearchButton.click();
		Thread.sleep(1000);
		EditButton.click();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(3000);
		CenterGroups1.click();     //open dropdown
		Thread.sleep(500);
		CenterGroups.click(); 
		
		mahiyat1.click();   //open mahiyat dropdown
		mahiyat.click();
		
		hospitalName.clear();
		hospitalName.sendKeys(hospitalname);
		
		HospitalEnName.clear();
		HospitalEnName.sendKeys(hospitalEnName);
		
		CentersCode.clear();
		CentersCode.sendKeys(centerCode);
		
		NationalCode.clear();
		NationalCode.sendKeys(nationalCode);
		
		Location.click();
		Thread.sleep(500);
		
		Ostan.click();
		Ostan.sendKeys(ostan);
		Ostan.sendKeys(Keys.TAB);
		Thread.sleep(500);
		
		City.click();
		City.sendKeys(city);
		City.sendKeys(Keys.ENTER);
		
		Thread.sleep(500);
		select.click();
		
		Address.clear();
		Address.sendKeys(address);
		Thread.sleep(500);
		
		
		Logo.sendKeys(logo);
		Thread.sleep(500);
		
		AddPhone.click();
		

		Thread.sleep(2000);
		Phone.click();
		Phone.sendKeys(Keys.DOWN);
		Phone.sendKeys(Keys.DOWN);
		Phone.sendKeys(Keys.TAB);
		phone2.sendKeys(phone);
		
		AddPhone3.click();
	
		
		Save.click();
	}

}
