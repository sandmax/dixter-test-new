package com.dixter.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenShot {
	public static void takeScreenShot()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
		EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
		File src=edriver.getScreenshotAs(OutputType.FILE);
		File tar=new File("C:\results\test.jpg");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
