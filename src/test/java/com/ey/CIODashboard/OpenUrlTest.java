package com.ey.CIODashboard;
import util.helper;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenUrlTest {
	helper hlpr = new helper();
	@Test
	public void loginToScp() {
		String testUrl = "https://flpnwc-bb0651249.dispatcher.us1.hana.ondemand.com/sites/CIOAdmin#allocation-maintain"; 
		System.out.println("Starting Test");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pinaki.patra\\Documents\\Project Documents\\Tools\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(testUrl);
		
		hlpr.sendKeysOnVisible("Scp1234@", "//input[@Placeholder=\"Password\"]", driver);
		hlpr.sendKeysOnVisible("S0018211704", "//input[@Placeholder=\"E-mail, ID, or User Name\"]", driver);
		hlpr.pressButtonOnVisible("//button[contains(., 'Log On')]", driver);
		
		assert testUrl.equals(driver.getCurrentUrl());
		
		if(testUrl.equals(driver.getCurrentUrl())){
			System.out.println("Successfully Logged In");
		}else {
			System.out.println("Error Logging In");
		} 
		
		driver.close();
		
	}
}
