package center.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChangeLanquage {
	
	public WebDriver getDriver(String local){   
	    System.setProperty("webdriver.chrome.driver", "D:\\webDriver-goudarzi\\chromedriver_win32 (2)//chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--lang=" + local);
	    return new ChromeDriver(options);
	}

}
