package humanresources.pageObjects;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUser {

	@FindBy(id = "pName")  WebElement lastName;
	
	@FindBy(id = "pFamilyName")   WebElement FamilyName;
	
	@FindBy(id= "pFatherName")   WebElement FatherName;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add"
			+ "-edit/div[2]/div[2]/div[1]/person/div/div/div"
			+ "/form/div[5]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")  WebElement Sex;
	
	@FindBy(id = "BirthDate") WebElement birthDate;   //تاریخ تولد
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/"
			+ "app-add-edit/div[2]/div[2]/div[1]/person/div/div/div/"
			+ "form/div[5]/div[5]/div/div[2]/div/kendo-combobox/span/kendo-searchbar/input")   WebElement PlaceOfBirth;   // محل تولد
	
	
@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/"
		+ "div/app-add-edit/div[2]/div[2]/div[1]/person/"
		+ "div/div/div/form/div[6]/div[2]/div/kendo-combobox/span/kendo-searchbar/input")  WebElement Tahol;   //وضعیت تاهل

@FindBy(id = "Email") WebElement email;


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add"
		+ "-edit/div[2]/div[2]/div[2]/div[1]/div/contact/form/div/div[1]/div[2]/div/"
		+ "kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[5]/button[1]")   WebElement EditPhoneButton;   

@FindBy(id = "TelNo") WebElement Phone;    //Phone number

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/d"
		+ "iv[2]/div[2]/div[1]/div/contact/form/div/div[2]/div/button")   WebElement Edit;   //دکمه ویرایش

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add"
		+ "-edit/div[2]/div[2]/div[2]/div[2]/div/address/form/div/div[1]"
		+ "/div[1]/div[2]/div[2]/div/kendo-combobox/span/kendo-searchbar/input")   WebElement City;


@FindBy(id = "MainAddress")   WebElement Address;

@FindBy(id = "ZipCode")  WebElement zipCode;


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit"
		+ "/div[2]/div[2]/div[2]/div[3]/div[2]/div/employee-information"
		+ "/form/div/div/div/div[5]/div/kendo-combobox/span/kendo-searchbar/input")  WebElement Education ;    //اخرین مدرک تحصیلی


@FindBy(id = "StartDateE")  WebElement startDate;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app"
		+ "-add-edit/div[2]/div[2]/div[2]/div[5]/button") WebElement Tahsilat;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit"
		+ "/div[2]/div[2]/div[2]/div[5]/div/education/form/div[2]/div/kendo"
		+ "-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[10]/button[1]")  WebElement EditTahsilat;


@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit"
		+ "/div[2]/div[2]/div[2]/div[5]/div/education"
		+ "/form/div[1]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")   WebElement Education2;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]"
		+ "/div[2]/div[5]/div/education/form/div[1]"
		+ "/div[2]/div/kendo-combobox/span/kendo-searchbar/input")
WebElement Gerayesh;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]"
		+ "/div[2]/div[2]/div[5]/div/education/form/div[1]/div[5]/div[7]/button")   WebElement Edit2;

@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[1]/button[1]")
WebElement FinalSave;


public void EditEmployee(String lastname ,String familyName , String fatherName ,String sex,
		String BirthDate, String PBirth ,String Email, String tell,String city , String address ,
		String zipcode , String education ,String StartDate , String education2) throws InterruptedException {
	
	Thread.sleep(2000);
	lastName.clear();
	StringSelection stringSelection = new StringSelection(lastname);
	Clipboard clipboard1  = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard1.setContents(stringSelection, null);
	lastName.sendKeys(Keys.CONTROL +"V");
	
	FamilyName.clear();
	StringSelection stringSelection2 = new StringSelection(familyName);
	Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard2.setContents(stringSelection2, null);
	FamilyName.sendKeys(Keys.CONTROL + "V");
	
	FatherName.clear();
	StringSelection stringSelection3 = new StringSelection(fatherName);
	Clipboard clipboard3 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard3.setContents(stringSelection3, null);
	FatherName.sendKeys(Keys.CONTROL + "V");
	

	Sex.clear();
	StringSelection stringSelection4 = new StringSelection(sex);
	Clipboard clipboard4 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard4.setContents(stringSelection4, null);
	Sex.sendKeys(Keys.CONTROL + "V");
	Sex.sendKeys(Keys.ENTER);
	
	
	birthDate.clear();
	StringSelection stringSelection5 = new StringSelection(BirthDate);
	Clipboard clipboard5 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard5.setContents(stringSelection5, null);
	birthDate.sendKeys(Keys.CONTROL + "V");
	
	
	PlaceOfBirth.clear();
	StringSelection stringSelection6 = new StringSelection(PBirth);
	Clipboard clipboard6 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard6.setContents(stringSelection6, null);
	PlaceOfBirth.sendKeys(Keys.CONTROL + "V");
	
	Tahol.clear();
	Tahol.sendKeys(Keys.DOWN);
	
	email.clear();
	StringSelection stringSelection7 = new StringSelection(Email);
	Clipboard clipboard7 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard7.setContents(stringSelection7, null);
	email.sendKeys(Keys.CONTROL + "V");
	
	EditPhoneButton.click();
	
	Phone.clear();
	StringSelection stringSelection8 = new StringSelection(tell);
	Clipboard clipboard8 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard8.setContents(stringSelection8, null);
	
	Edit.click();
	
	City.clear();
	StringSelection stringselection9 = new StringSelection(city);
	Clipboard clipboard9 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard9.setContents(stringselection9, null);
	City.sendKeys(Keys.CONTROL + "V");
	
	Address.clear();
	StringSelection stringselection10 = new StringSelection(address);
	Clipboard clipboard10 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard10.setContents(stringselection10, null);
	Address.sendKeys(Keys.CONTROL +"V");
	
	zipCode.clear();
	StringSelection stringselection11 = new StringSelection(zipcode);
	Clipboard clipboard11 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard11.setContents(stringselection11, null);
	zipCode.sendKeys(Keys.CONTROL + "V");
	
	
	Education.clear();                                           //virayesh akharin madrak tahsili
	StringSelection stringSelection12 =  new StringSelection(education);
	Clipboard clipboard12 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard12.setContents(stringSelection12, null);
	Education.sendKeys(Keys.CONTROL + "V");	
	Education.sendKeys(Keys.DOWN);
	Education.sendKeys(Keys.DOWN);
	Education.sendKeys(Keys.ENTER);
	
	startDate.clear();														//tarike shoro be kar
	StringSelection stringselection13 = new StringSelection(StartDate);
	Clipboard clipboard13 = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard13.setContents(stringselection13, null);
	startDate.sendKeys(Keys.CONTROL + "V");
	
	Thread.sleep(500);
	//Tahsilat.click();      //click  on tahsilat and dorehaye takhasosi
	
	
	//EditTahsilat.click();   //click on editbtn
	
//	Education2.clear();
//	StringSelection stringselection14 = new StringSelection(education2);
//	Clipboard clipboard14 = Toolkit.getDefaultToolkit().getSystemClipboard();
//	clipboard14.setContents(stringselection14, null);
//	Education2.sendKeys(Keys.CONTROL+"V");
//	Education2.sendKeys(Keys.DOWN);
//	Education2.sendKeys(Keys.DOWN);
//	Education2.sendKeys(Keys.ENTER);
//	
//	Gerayesh.sendKeys(Keys.DOWN);
//	Gerayesh.sendKeys(Keys.DOWN);
//	
//	Edit2.click();
	
	FinalSave.click();
	
}




 

  


	
 	
}
