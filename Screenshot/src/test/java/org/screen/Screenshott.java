package org.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshott {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
    TakesScreenshot scrShot =((TakesScreenshot)driver);


            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);


            File DestFile=new File("D:\\Aravind\\img.jpg");


            FileUtils.copyFile(SrcFile, DestFile);

}
}