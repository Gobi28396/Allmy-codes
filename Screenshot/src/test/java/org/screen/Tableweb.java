package org.screen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableweb {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		WebElement link = driver.findElement(By.id(""));
		link.click();

		Set<String> all = driver.getWindowHandles();
		for (String s : all) {
			driver.switchTo().window(s);
			try {
				WebElement e = driver.findElement(By.id("submit"));
				e.click();
			} 
			catch (NoSuchElementException e) {
				System.out.println("Element not present");
			}

		}
		List<WebElement> e = driver.findElements(By.id("a"));
		for (int i = 0; i < 8; i++) {
			Set<String> s = driver.getWindowHandles();
			ArrayList<String> al = new ArrayList<String>();
			al.addAll(s);
			driver.switchTo().window(al.get(i));
			
			
		}

	}

}
