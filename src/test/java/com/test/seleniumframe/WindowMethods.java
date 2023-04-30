package com.test.seleniumframe;

import java.util.Set;

public class WindowMethods extends BrowserMethods {

	public String getWindow()
	{
		return driver.getWindowHandle();
	}
	public Set<String> getAllWindows()
	{
		return driver.getWindowHandles();
	}
	public void swicthWindow(String windowName)
	{
		driver.switchTo().window(windowName);
	}
}
