package com.test.seleniumframe;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods extends BrowserMethods{
	
	public void clickElement(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.click(element).build().perform();
	}
	public void doubleClick(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.doubleClick(element).build().perform();
	}
	public void rightClick(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	public void mouseToEleement(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	public void dragAndDropElement(WebElement fromElement,WebElement toElement)
	{
		Actions actions=new Actions(driver);
		actions.dragAndDrop(fromElement, toElement);
	}
	public void keyPress(WebElement element,Keys key)
	{
		Actions action=new Actions(driver);
		action.keyDown(element,key);
		
	}
	public void keyRelease(WebElement element,Keys key)
	{
		Actions action=new Actions(driver);
		action.keyUp(element,key);
	}
	
	public void enterValue(WebElement element,String value)
	{
		Actions action=new Actions(driver);
		action.sendKeys(element,value);
	}

}
