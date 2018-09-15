package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helper {
	public void sendKeysOnVisible(String text,String xPath,WebDriver driver) {
		this.waitUntilElementVisible(xPath, driver);
		
		System.out.println("Writing - "+text);
		driver.findElement(By.xpath(xPath)).sendKeys(text);
		
	}
	public void pressButtonOnVisible(String xPath,WebDriver driver) {
		this.waitUntilElementVisible(xPath, driver);
		System.out.println("Clicking");
		driver.findElement(By.xpath(xPath)).click();
		
	}
	public void waitUntilElementVisible(String xPath,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		System.out.println("Waiting for element to be visible by XPath"+xPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
	}
}
