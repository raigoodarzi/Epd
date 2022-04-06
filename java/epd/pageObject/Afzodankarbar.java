package epd.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Afzodankarbar {

	
	@FindBy( xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/person/div/div/div/form/div[2]/div[1]/input")
	WebElement name;  //firstname
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-e"
			+ "dit/div[2]/div[2]/div[1]/person/div/div/div/form/div[3]/div/input")
	WebElement familyName; //lastname
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/person/div/"
			+ "div/div/form/div[5]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement Sex;  //jensiat
	
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit"
			+ "/div[2]/div[2]/div[1]/person/div/div/div/form/div[4]/div/input")
	WebElement FatherName;  //fhathername
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/"
			+ "person/div/div/div/form/div[5]/div[2]/mat-form-field/div/div[1]/div[1]/input")
	WebElement Birth1;  //fildetavalod
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-datepicker-content/"
			+ "mat-calendar/mat-calendar-header/div/div/button[1]/div[1]")
	WebElement Year; //sale tavalod
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-datepicker-content/mat"
			+ "-calendar/div/mat-multi-year-view/table/tbody/tr[3]/td[2]/div[1]")
	WebElement Year1; //sale daghigh
 	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-datepicker-content/"
			+ "mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[2]/div[1]")
	WebElement Month;  //mah
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-datepicker-content/mat"
			+ "-calendar/div/mat-month-view/table/tbody/tr[3]/td[5]/div[1]")
	WebElement Day;  //ruz
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/"
			+ "div[1]/person/div/div/div/form/div[5]/div[2]/mat-form-field/div/div[1]/div[1]/input")
	WebElement Nationality;

	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/person/div/div/div/"
			+ "form/div[5]/div[5]/div/div[2]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement Bplace;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-"
			+ "edit/div[2]/div[2]/div[1]/person/div/div/div/form/div[6]/div[1]/div/input[1]")
	WebElement NationalCode;  //codemelli
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/person/div/div/di"
			+ "v/form/div[6]/div[2]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement maritalstatus;  //vazyatTaahol
	
	@FindBy(id = "Email")
	WebElement email;  //vazyatTaahol
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[1]/div/contact/"
			+ "form/div/div[1]/div[1]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement phone;  //choose phone
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]"
			+ "/div[2]/div[1]/div/contact/form/div/div[1]/div[1]/div[2]/div/input")
	WebElement phoneNumber;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/"
			+ "div[2]/div[1]/div/contact/form/div/div[2]/div/button")
	WebElement AddPhone;
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]"
			+ "/div[2]/div[2]/div/address/form/div/div[1]"
			+ "/div[1]/div[2]/div[2]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement city;
	

	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/"
			+ "div[2]/div/address/form/div/div[2]/kendo-textbox-container/textarea")
	WebElement Address;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[3]/div[1]/div/"
			+ "user-type/form/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement karbartype;
	
	@FindBy(xpath="/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[3]/div[2]/div/employee-information"
			+ "/form/div/div/div/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement Activity;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit"
			+ "/div[2]/div[2]/div[2]/div[3]/div[2]/div/employee-information/form/div/"
			+ "div/div/div[6]/div/kendo-combobox/span/kendo-searchbar/input")
	
	WebElement Madrak;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[3]/div[2]/div/employee"
			+ "-information/form/div/div/div/div[8]/mat-form-field/div/div[1]/div[1]/input")
	WebElement StartDate;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[2]/div[3]/div[2]/div/employee-information/"
			+ "form/div/div/div/div[7]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement Onvan;
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[1]/button[1]")
	WebElement Save;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/person/div/div/div"
			+ "/form/div[5]/div[3]/div/kendo-combobox/span/kendo-searchbar/input")
	WebElement Nationality1;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/"
			+ "person/div/div/div/form/div[5]/div[4]/div/input")
	WebElement City1;
	
	@FindBy(xpath = "/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/"
			+ "div[1]/person/div/div/div/form/div[6]/div[1]/div/input[2]")
	WebElement Pass;
	

	
	public  void Afzodan(WebDriver driver, String coding ) throws AWTException, InterruptedException {
		
		WebDriverWait driverwait = new WebDriverWait(driver, 20);
		driverwait.until(ExpectedConditions.visibilityOf(name));
		
		

		System.out.println(driver.getCurrentUrl());
		Actions action = new Actions(driver);
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]"
				+ "/div[2]/div[1]/person/div/div/div/form/div[2]/div[1]/input")).getLocation());

		
		// click on save Button 
		action.moveToElement(driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/"
				+ "div/div/div/app-add-edit/div[2]/div[1]/button[1]"))).click().perform();
		
		Thread.sleep(2000);  
		 //click on error message
		action.moveToElement(driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]"
				+ "/div[1]/person/div/div/div/form/div[2]/div[1]/app-control-messages/mat-error"))).click().perform();
		

		driver.findElement(By.xpath("//*[@id=\"add-employee\"]/div[2]/div[1]/person/div/div/div/f"
				+ "orm/div[1]/div/button")).sendKeys(Keys.TAB);

	    StringSelection stringSelection= new StringSelection("رضا");
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, null);
	    name.sendKeys(Keys.CONTROL +"v");
	    name.sendKeys(Keys.TAB);
	    name.sendKeys(Keys.TAB);
	    
	    StringSelection stringSelection1 = new StringSelection("صدر");
	    Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard1.setContents(stringSelection1, null);
		familyName.sendKeys(Keys.CONTROL +"v");
		familyName.sendKeys(Keys.TAB);
		
		
		StringSelection stringSelection2 = new StringSelection("محمد");
		Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard2.setContents(stringSelection2, null);
		FatherName.sendKeys(Keys.CONTROL+"v");
		FatherName.sendKeys(Keys.TAB);
		
		 
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/div/div/app-add-edit/div[2]/div[2]/div[1]/person"
				+ "/div/div/div/form/div[5]/div[1]/div/app-control-messages/mat-error")).click();  //click on error button
		
		Sex.sendKeys("مرد");
		Sex.sendKeys(Keys.ENTER);
		
		Birth1.sendKeys("1362/01/01");
		Thread.sleep(1000);
		Birth1.sendKeys(Keys.TAB);
		Birth1.sendKeys(Keys.TAB);
		
		// Meliyt gheyr irani
		
//		Actions action2 = new Actions(driver);
//		Nationality1.sendKeys(Keys.ARROW_DOWN);
//		Nationality1.sendKeys(Keys.ARROW_DOWN);
//		Nationality1.sendKeys(Keys.TAB);
//		City1.sendKeys("Istanbul");
//		City1.sendKeys(Keys.TAB);
//		Pass.sendKeys("T9652341");
//		Pass.sendKeys(Keys.TAB);
		
		
	
		
		Bplace.sendKeys("مشهد");
		Bplace.sendKeys(Keys.TAB);
		System.out.println("45");
		NationalCode.sendKeys(coding);
		System.out.println("12");
	    NationalCode.sendKeys(Keys.TAB);
		maritalstatus.sendKeys("مجرد");
		maritalstatus.sendKeys(Keys.TAB);
		
		email.sendKeys("epdqc1398@gmail.com");
		email.sendKeys(Keys.TAB);
		phone.click();
		phone.sendKeys(Keys.DOWN);
		phone.sendKeys(Keys.ENTER);
		phoneNumber.sendKeys("09123652142");
		AddPhone.click();
		city.sendKeys("تهران");
		Address.sendKeys("تهران ، میدان فردوسی");
		Address.sendKeys(Keys.TAB);
		karbartype.click();
		karbartype.sendKeys(Keys.DOWN);
		karbartype.sendKeys(Keys.DOWN);
		karbartype.sendKeys(Keys.DOWN);
		Activity.click();
		Activity.sendKeys(Keys.DOWN);
		Activity.sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("/html/body/app-root/div/app-hr-layout/div/d"
				+ "iv/div/app-add-edit/div[2]/div[2]/div[2]/"
				+ "div[3]/div[2]/div/employee-information/form/div/div/div/div[2]/div/input")).sendKeys(Keys.TAB);
		
		Madrak.click();
		Madrak.sendKeys(" کارشناسی ");
		Madrak.sendKeys(Keys.ENTER);
		Thread.sleep(50);
		Onvan.click();
		Onvan.sendKeys(Keys.DOWN);
		Thread.sleep(50);

		StartDate.sendKeys("1400/01/01");
		
		Save.click();
	}
}
