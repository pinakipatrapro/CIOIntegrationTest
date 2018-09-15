package com.ey.CIODashboard;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenUrlTest {
	@Test
	public void loginToScp() {
		String testUrl = "https://flpnwc-bb0651249.dispatcher.us1.hana.ondemand.com/sites/CIOAdmin#allocation-maintain"; 
		System.out.println("Starting Test");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pinaki.patra\\Documents\\Project Documents\\Tools\\geckodriver-v0.21.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(testUrl);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@Placeholder=\"Password\"]")));

		driver.findElement(By.xpath("//input[@Placeholder=\"Password\"]")).sendKeys("Scp1234@");
		driver.findElement(By.xpath("//input[@Placeholder=\"E-mail, ID, or User Name\"]")).sendKeys("S0018211704");
		driver.findElement(By.xpath("//button[contains(., 'Log On')]")).click();
		assert testUrl.equals(driver.getCurrentUrl());
		
		if(testUrl.equals(driver.getCurrentUrl())){
			System.out.println("Successfully Logged In");
		}else {
			System.out.println("Error Logging In");
		} 
		
		driver.close();
		
	}
}
