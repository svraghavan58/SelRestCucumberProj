package com.test.seleniumframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.test.utilities.XMLReader;

public class WebElementMethods extends BrowserMethods {

	public WebElement getElement(String fileName,String elementName)
	{
		WebElement element=null;
		XMLReader xr=new XMLReader();
		String xmlValue=xr.getXMLValues(fileName, elementName);
		String xmlArray[]=xmlValue.split("~");
		String locatorType=xmlArray[0];
		String locatoValue=xmlArray[1];
		switch(locatorType)
		{
		case "id":
		{
			element=driver.findElement(By.id(locatoValue));
			break;
		}
		case "name":
		{
			element=driver.findElement(By.name(locatoValue));
			break;
		}
		case "className":
		{
			element=driver.findElement(By.className(locatoValue));
			break;
		}
		case "tagName":
		{
			element=driver.findElement(By.tagName(locatoValue));
			break;
		}
		case "linkText":
		{
			element=driver.findElement(By.linkText(locatoValue));
			break;
		}
		case "partialLinkText":
		{
			element=driver.findElement(By.partialLinkText(locatoValue));
			break;
		}
		case "xpath":
		{
			element=driver.findElement(By.xpath(locatoValue));
			break;
		}
		case "cssSelector":
		{
			element=driver.findElement(By.cssSelector(locatoValue));
			break;
		}
		}
		return element;
	}
	public String getInnerText(WebElement element)
	{
		return element.getText();
	}
	public String getAttributeValue(WebElement element,String attribute)
	{
		return element.getAttribute(attribute);
	}
	public String getCssPropValue(WebElement element,String property)
	{
		return element.getCssValue(property);
	}
	public void clickElement(WebElement element)
	{
		element.click();
	}
	public void clearElement(WebElement element)
	{
		element.clear();
	}
	public void submitElement(WebElement element)
	{
		element.submit();
	}
	public void enterValues(WebElement element,String values)
	{
		element.sendKeys(values);
	}
	public void enterValues(WebElement element,Keys key)
	{
		element.sendKeys(key);
	}
	public boolean verifyDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	public boolean verifyEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	public boolean verifySelected(WebElement element)
	{
		return element.isSelected();
	}
	public int getElementHeight(WebElement element)
	{
		Dimension d=element.getSize();
		return d.getHeight();
	}
	public int getElementWidth(WebElement element)
	{
		Dimension d=element.getSize();
		return d.getWidth();
	}
	public int getElementtX(WebElement element)
	{
		Point p=element.getLocation();
		return p.getX();
	}
	public int getElementY(WebElement element)
	{
		Point p=element.getLocation();
		return p.getY();
				
	}
}
