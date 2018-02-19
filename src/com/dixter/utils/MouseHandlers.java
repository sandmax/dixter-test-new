package com.dixter.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHandlers {
public static void mouseHoverOnElement(WebDriver driver , WebElement element)
{
	Actions act = new Actions (driver);
	act.moveToElement(element);
	
}
public static void DragandDrop(WebDriver driver , WebElement src , WebElement tar)
{
	Actions act = new Actions (driver);
	act.dragAndDrop(src, tar);
	
}
public static void DoubleClick(WebDriver driver , WebElement element)
{
	Actions act = new Actions (driver);
	act.doubleClick(element);
	
}

}
