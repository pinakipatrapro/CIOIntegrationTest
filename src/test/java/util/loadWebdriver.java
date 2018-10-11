package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class loadWebdriver {
	static WebDriver driver;
	public WebDriver getDriver() {
		if (driver == null){
			
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("network.proxy.http", "localhost");
			profile.setPreference("network.proxy.http", "localhost");
			
			
			
			System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe"); 
			driver = new FirefoxDriver();
			return driver;
		}else{
			return driver;
		}
	}
}
