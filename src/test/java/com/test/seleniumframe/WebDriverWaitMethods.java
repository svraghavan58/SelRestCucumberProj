package com.test.seleniumframe;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitMethods extends BrowserMethods{

	public void waitForPageTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public void waitforPageTitleContains(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.titleContains(title));
	}

}
