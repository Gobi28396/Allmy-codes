package org.broswer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	  WebElement a = driver.findElement(By.id("loginbutton"));
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  j.executeScript("arguments[0].click", a);
	
}
}