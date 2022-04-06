package center.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DefineCenter {

	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/app-aside-center-nav/div/div/a[1]/span")
	WebElement defineCenter ;
	
	@FindBy(xpath = "/html/body/app-root/app-center-layout/div[1]/div/div/div/app-center"
			+ "/div/div/div/div/kendo-grid/kendo-grid-toolbar/a")
	WebElement afzudan; 
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]"
			+ "/div/form/div[1]/div[1]/kendo-combobox/span/kendo-searchbar/input")
	WebElement CenterGroup;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]"
			+ "/div/form/div[1]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	WebElement Mahiyat;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[3]/input")
	WebElement Center;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[4]/input")
	WebElement EnglishTitle;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/"
			+ "div/form/div[1]/div[5]/kendo-numerictextbox/span/input")
	WebElement CenterCode;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[6]/input")
	WebElement NationalCode;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[7]/input")
	WebElement EconomiceCode;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[8]/div/a/i")
	WebElement city1;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-select-city/div/div[2]/div/div[1]/kendo-combobox/span/kendo-searchbar/input")
	WebElement Ostan;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-select-city/div/div[2]/div/div[2]/kendo-combobox/span/kendo-searchbar/input")
	WebElement city2;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-select-city/div/div[2]/div/div[3]/button[1]")
	WebElement  Save;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[9]/input")
	WebElement  CloudUrl;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[10]/input")
	WebElement  HisLandingUrl;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[11]/input")
	WebElement  CodePosti;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[12]/textarea")
	WebElement  Address;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[2]/div[1]/kendo-grid/kendo-grid-toolbar/a")
	WebElement  addtell;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/div/div[1]/kendo-combobox/span/kendo-searchbar/input")
	WebElement  telType;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement  Tell;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/"
			+ "div/div[2]/div/div/form/div/div[4]/button")
	WebElement  Afzudan;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[2]/div[3]/span/button")
	WebElement  Save2;
	
	@FindBy(xpath = "/html/body/div/div[4]/div/mat-dialog-container/app-select-city/div/div[2]/div/div[1]/kendo-combobox/span/span")
	WebElement  mosalas;
	
	public void Define ( String Centername, String EnName , String centercode, String nationalcode
			, String ecCode,String ostan,String city, String cloudUrl , String HisUrl, String codeposti, String address , String tell) throws InterruptedException {
		
		defineCenter.click();
		Thread.sleep(4000);
		afzudan.click();
		CenterGroup.sendKeys(Keys.DOWN);
		CenterGroup.sendKeys(Keys.TAB);
		Mahiyat.sendKeys(Keys.DOWN);
		Center.sendKeys(Centername);
		EnglishTitle.sendKeys(EnName);
		CenterCode.sendKeys(centercode);
		NationalCode.sendKeys(nationalcode);
		EconomiceCode.sendKeys(ecCode);
		city1.click();
		Thread.sleep(500);
		Ostan.click();
		Ostan.sendKeys(ostan);
		Ostan.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		Ostan.sendKeys(Keys.TAB);
		
		city2.sendKeys(city);
		city2.sendKeys(Keys.ENTER);
		Save.click();
		Thread.sleep(500);
		CloudUrl.sendKeys(cloudUrl);
		HisLandingUrl.sendKeys(HisUrl);
		CodePosti.sendKeys(codeposti);
		Address.sendKeys(address);
		addtell.click();
		telType.sendKeys(Keys.DOWN);
		telType.sendKeys(Keys.DOWN);
		Tell.sendKeys(tell);
		Afzudan.click();
		Save2.click();
		
	}
	
}
