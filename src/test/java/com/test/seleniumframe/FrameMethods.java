package com.test.seleniumframe;

import org.openqa.selenium.WebElement;

public class FrameMethods extends BrowserMethods {

	public void switchFrame(String frameNameorId)
	{
		driver.switchTo().frame(frameNameorId);
	}
	public void switchFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void switchToParentFrame()
	{
		driver.switchTo().parentFrame();
	}
	public void comeOutOfFrame()
	{
		driver.switchTo().defaultContent();
	}
}
