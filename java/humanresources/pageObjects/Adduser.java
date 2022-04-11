package humanresources.pageObjects;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adduser {
	
	
@FindBy(id = "pName") WebElement name;

@FindBy(id = "pFamilyName") WebElement FamilyName;

@FindBy(id = "pFatherName") WebElement FatherName;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add"
		+ "-edit/div[2]/div[2]/div[1]/person/div/div/div/form/div[5]/div[1]"
		+ "/div/kendo-combobox/span/kendo-searchbar/input")
WebElement SEX;

@FindBy(id = "BirthDate") WebElement Birhdate;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]"
		+ "/div[2]/div[1]/person/div/div/div/form/div[5]/div[5]"
		+ "/div/div[2]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement PlaceOfBirth;

@FindBy(id = "inputNationalCode")
WebElement NationalCode;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edi"
		+ "t/div[2]/div[2]/div[1]/person/div/div/"
		+ "div/form/div[6]/div[2]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement  martialstaus;      // تاهل وضعیت


@FindBy(id = "Email")  WebElement Email;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]"
		+ "/div[2]/div[2]/div[1]/div/contact/form/div/div[1]/div[1]/"
		+ "div[1]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement Phone;

@FindBy(id = "TelNo")
WebElement TelNo;


@FindBy(id = "contantBtn") WebElement AddPhone;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/d"
		+ "iv[2]/div[2]/div[2]/div[2]/div/address/form/div/div[1]/"
		+ "div[1]/div[2]/div[2]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement city;


@FindBy(id = "MainAddress") WebElement Address;


@FindBy(id = "ZipCode")  WebElement zipcode;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/"
		+ "div[2]/div[2]/div[3]/div[1]/div/user"
		+ "-type/form/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement usertype;


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/d"
		+ "iv[2]/div[2]/div[2]/div[3]/div[2]/div/employee-information/form/"
		+ "div/div/div/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement Activity;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]"
		+ "/div[2]/div[2]/div[3]/div[2]/div/employee-information/form/div/"
		+ "div/div/div[5]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement Education;


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/"
		+ "app-add-edit/div[2]/div[2]/div[2]/div[3]/div[2]/div/employee"
		+ "-information/form/div/div/div/div[6]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement Onvan;

@FindBy(id = "StartDateE")  WebElement StartDate;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/"
		+ "app-add-edit/div[2]/div[2]/div[2]/div[4]/button")  WebElement Location;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[4]/div/location"
		+ "/form/div[1]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")  WebElement ActivityLocation;  //درمانی غیر


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[4]/div/location/"
		+ "form/div[1]/div[2]/div/kendo-combobox/span/kendo-searchbar/input")  
WebElement Group;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[4]/div/location/form/div[1]"
		+ "/div[3]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement aria;


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[4]/div/location/form/div[1]/"
		+ "div[4]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement Role;

@FindBy(id = "StartDateL")  WebElement StartDate2;


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]"
		+ "/div[4]/div/location/form/div[1]/div[7]/div/button")
WebElement AddLocation;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[1]/button[1]")
WebElement Save;



public void AddEmploye(String Name , String familyName , String fatherName , String sex ,String birhtDate ,
		String placeOfBirth , String Nationalcode , String status, String email,String tel ,String City,
		String address ,String ZipCode ,String UserType ,String education ,String startDate ,String group ,
		String Aria ,String role ,String startDate2 ,String education2 ,String Place ,String Duration ,String Unit) throws InterruptedException {
	Thread.sleep(3000);
	//Actions action = new Actions(driver);
	 WebDriver driver ;
	   
 	StringSelection selection = new StringSelection(Name);
 	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
 	clipboard.setContents(selection, null);
// 	Highliter H = PageFactory.initElements(driver, Highliter.class);
// 	H.highLighterMethod(driver, name);
 	name.sendKeys(Keys.CONTROL +"V");     //copypaste
	
	
	StringSelection selection2 = new StringSelection(familyName);
	clipboard.setContents(selection2, null);
	//H.highLighterMethod(driver, FamilyName);
	FamilyName.sendKeys(Keys.CONTROL + "V");
	
	

	StringSelection selection3 = new StringSelection(fatherName);
	clipboard.setContents(selection3, null);
	//H.highLighterMethod(driver, FatherName);
	FatherName.sendKeys(Keys.CONTROL +"V");
	
	StringSelection slection4 = new StringSelection(sex);
	clipboard.setContents(slection4, null);
	//H.highLighterMethod(driver, SEX);
	SEX.sendKeys(Keys.CONTROL + "V");
	
	StringSelection selection4 = new StringSelection(birhtDate);
	clipboard.setContents(selection4, null);
	//H.highLighterMethod(driver, Birhdate);
	Birhdate.sendKeys(Keys.CONTROL +"V");
	
	StringSelection selection5 = new StringSelection(placeOfBirth);
	clipboard.setContents(selection5, null);
	//H.highLighterMethod(driver, PlaceOfBirth);
	PlaceOfBirth.sendKeys(Keys.CONTROL + "V");
	
	
	StringSelection selection6 = new StringSelection(Nationalcode);
	clipboard.setContents(selection6, null);
	//H.highLighterMethod(driver, NationalCode);
	NationalCode.sendKeys(Keys.CONTROL + "V");
	NationalCode.sendKeys(Keys.TAB);
	Thread.sleep(500);

	martialstaus.sendKeys("مجرد");
	Thread.sleep(500);
	martialstaus.sendKeys(Keys.ENTER);
	
	StringSelection selection8 = new StringSelection(email);
	clipboard.setContents(selection8, null);
	//H.highLighterMethod(driver, Email);
	Email.sendKeys(Keys.CONTROL+"V");
	
	
	StringSelection slection9 = new StringSelection("همراه");
	clipboard.setContents(slection9, null);
	//H.highLighterMethod(driver, Phone);
	Phone.sendKeys(Keys.CONTROL +"V");
	Phone.sendKeys(Keys.ENTER);
	
	StringSelection selection10 =new StringSelection(tel);
	clipboard.setContents(selection10, null);
	//H.highLighterMethod(driver, TelNo);
	TelNo.sendKeys(Keys.CONTROL +"V");
	
	AddPhone.click();
	
	StringSelection slection11 = new StringSelection(City);
	clipboard.setContents(slection11, null);
	//H.highLighterMethod(driver, city);
	city.sendKeys(Keys.CONTROL +"V");
	
	
	StringSelection slection12 = new StringSelection(address);
	clipboard.setContents(slection12, null);
	//H.highLighterMethod(driver, Address);
	Address.sendKeys(Keys.CONTROL +"V");
	
	StringSelection slection13 = new StringSelection(ZipCode);
	clipboard.setContents(slection13, null);
	//H.highLighterMethod(driver, zipcode);
	zipcode.sendKeys(Keys.CONTROL +"V");
	
	StringSelection slection14 = new StringSelection(UserType);
	clipboard.setContents(slection14, null);
	//H.highLighterMethod(driver, usertype);
	usertype.sendKeys(Keys.CONTROL +"V");
	usertype.sendKeys(Keys.ENTER);
	
	StringSelection slection15 = new StringSelection("غیر درمانی");
	clipboard.setContents(slection15, null);
	//H.highLighterMethod(driver, Activity);
	Activity.sendKeys(Keys.CONTROL +"V");
	Activity.sendKeys(Keys.ENTER);
	
	
	StringSelection slection16 = new StringSelection(education);
	clipboard.setContents(slection16, null);
	//H.highLighterMethod(driver, Education);
	Education.sendKeys(Keys.CONTROL +"V");
	Education.sendKeys(Keys.DOWN);
	Education.sendKeys(Keys.DOWN);
	Education.sendKeys(Keys.ENTER);
	
	Onvan.sendKeys("سرکار");
	
	Onvan.sendKeys(Keys.ENTER);
	
	StringSelection slection17 = new StringSelection(startDate);
	clipboard.setContents(slection17, null);
	//H.highLighterMethod(driver, StartDate);
	StartDate.sendKeys(Keys.CONTROL +"V");
	
	
	Thread.sleep(2000);
	//driver.findElement(By.id("StartDateE")).sendKeys(Keys.PAGE_DOWN);
	
	//H.highLighterMethod(driver, Location);
	Location.click();      //استقرار محل اطلاعات
	
	
	StringSelection slection18 = new StringSelection("غیر درمانی");
	clipboard.setContents(slection18, null);
	//H.highLighterMethod(driver, ActivityLocation);
	ActivityLocation.sendKeys(Keys.CONTROL +"V");
	
	
	StringSelection slection19 = new StringSelection(group);
	clipboard.setContents(slection19, null);
	//H.highLighterMethod(driver,Group);
	Group.sendKeys(Keys.CONTROL +"V");
	Group.sendKeys(Keys.ENTER);
	Group.sendKeys(Keys.TAB);
	
	//bakhsh
	StringSelection slection20 = new StringSelection(Aria);
	clipboard.setContents(slection20, null);
	//H.highLighterMethod(driver,aria);
	aria.sendKeys(Keys.CONTROL +"V");
	aria.sendKeys(Keys.ENTER);
	
	
	StringSelection slection21 = new StringSelection(role);
	clipboard.setContents(slection21, null);
	//H.highLighterMethod(driver,Role);
	Role.sendKeys(Keys.CONTROL +"V");
	Role.sendKeys(Keys.ENTER);
	


	StartDate2.sendKeys(startDate2);
	
	
	//AddLocation.click();   //mahale esteghrar
	
	
	Save.click();
}





}
