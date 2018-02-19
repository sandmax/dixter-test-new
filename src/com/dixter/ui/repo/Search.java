package com.dixter.ui.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	WebDriver driver;
	public Search(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getGoogleTextbox()
	{
		WebElement element = driver.findElement(By.id("lst-ib"));
		return element;
	}
	public WebElement getGoogleSearchButton()
	{
		return driver.findElement(By.name("btnK"));
	}
	public WebElement getGoogleLuckyButton()
	{
		return driver.findElement(By.name("btnI"));
	}
	public void waitForSearch()
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("btnK")));
		
	}
	

}
