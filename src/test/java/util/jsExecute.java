package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class jsExecute {
	public void executeJS(WebDriver driver,String scriptText){
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript(scriptText);
	}
}
