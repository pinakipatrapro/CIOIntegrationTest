package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helper {
	public void sendKeysOnVisible(String text,String xPath,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println("Waiting for element to be visible by XPath"+xPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
		
		System.out.println("Writing - "+text);
		driver.findElement(By.xpath(xPath)).sendKeys(text);
		
	}
}
