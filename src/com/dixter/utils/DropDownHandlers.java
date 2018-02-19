package com.dixter.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlers {
	public static void selectDDLByIndex(WebElement ddl,int index)
	{
		Select slt = new Select(ddl);
		slt.selectByIndex(index);
	}
	public static void selectDDLByValue(WebElement ddl,String value)
	{
		Select slt = new Select(ddl);
		slt.selectByValue(value);
	}
	public static void selectDDLByVisibleText(WebElement ddl,String text)
	{
		Select slt = new Select(ddl);
		slt.selectByVisibleText(text);
	}
	public static void deselectDDLByIndex(WebElement ddl,int index)
	{
		Select slt = new Select(ddl);
		slt.deselectByIndex(index);
	}
	public static void deselectDDLByValue(WebElement ddl,String value)
	{
		Select slt = new Select(ddl);
		slt.deselectByValue(value);
	}
	public static void deselectDDLByVisibleText(WebElement ddl,String text)
	{
		Select slt = new Select(ddl);
		slt.deselectByVisibleText(text);
	}
	public static void deselectDDLAll(WebElement ddl)
	{
		Select slt = new Select(ddl);
		slt.deselectAll();
	}

}
