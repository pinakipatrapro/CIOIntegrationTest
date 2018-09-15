package com.ey.CIODashboard;
import util.helper;
import util.loadWebdriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class OpenUrlTest {
	helper hlpr = new helper();
	loadWebdriver loadDriver = new loadWebdriver();
	
	@Test
	public void loginToScp() {
		String testUrl = "https://flpnwc-bb0651249.dispatcher.us1.hana.ondemand.com/sites/CIOAdmin#Shell-home"; 
		System.out.println("Starting Test");

		WebDriver driver = loadDriver.getDriver();
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
	}
	@Test
	public void generateData() {
		WebDriver driver = loadDriver.getDriver();
		driver.get("https://flpnwc-bb0651249.dispatcher.us1.hana.ondemand.com/sites/CIOAdmin#New_App-Display&/GenerateData");
		hlpr.pressButtonOnVisible("//button[contains(.,'Generate Data')]", driver);

		hlpr.sendKeysOnVisible("Auto Generated - Records - Jenkins", "//*[@id=\"__input25-inner\"]", driver);
		hlpr.pressButtonOnVisible("//button[.='Generate']", driver);
		hlpr.pressButtonOnVisible("//button[contains(.,'Ok')]", driver);
		System.out.println("Successfully generated records");
		assert true;
	}
}
