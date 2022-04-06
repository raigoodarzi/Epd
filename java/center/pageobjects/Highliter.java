package center.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highliter {
	
	public void highLighterMethod(WebDriver driver , WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid yellow;');", element);
		
	}

}
