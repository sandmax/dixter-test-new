package com.dixter.test.regression;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.dixter.test.config.TestConfiguration;
import com.dixter.ui.repo.Search;

public class TestSearchU1 {
	WebDriver driver;
	Search ser;
	@BeforeMethod
	public void preCondition()
	{
		driver=TestConfiguration.getInstance();
		ser=new Search(driver);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	@Test
	public void testSearchjavaTC1()
	{
		//ser.waitForSearch();
		ser.getGoogleTextbox().sendKeys("java");
		
		ser.getGoogleSearchButton().click();
		
	}
	@Test
	public void testSearchjavafreeTC2()
	{
	//	ser.waitForSearch();
		ser.getGoogleTextbox().sendKeys("java");
		ser.getGoogleLuckyButton();
	}
	
	

}
