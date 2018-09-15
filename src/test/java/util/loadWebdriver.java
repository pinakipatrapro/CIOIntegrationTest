package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loadWebdriver {
	static WebDriver driver;
	public WebDriver getDriver() {
		if (driver == null){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\pinaki.patra\\Documents\\Project Documents\\Tools\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		}else{
			return driver;
		}
	}
}
