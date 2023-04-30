package com.test.seleniumframe;

import org.openqa.selenium.Alert;

public class AlertMethods extends BrowserMethods{
	
	public Alert switchAlert()
	{
		Alert alert=driver.switchTo().alert();
		return alert;
	}
	
	public void accceptAlert()
	{
		switchAlert().accept();
	}
	public void cancelAlert()
	{
		switchAlert().dismiss();
	}
	public String getAlertText()
	{
		return switchAlert().getText();
	}
	public void sendValues(String value)
	{
		switchAlert().sendKeys(value);
	}

}
