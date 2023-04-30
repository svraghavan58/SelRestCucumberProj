package com.test.seleniumframe;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethods {

	public Select getSelect(WebElement element)
	{
		Select select=new Select(element);
		return select;
	}
	public void selectDeselectValue(WebElement element,String selectDeselect,String value)
	{
		switch(selectDeselect)
		{
		case "selectByValue":
		{
			getSelect(element).selectByValue(value);
			break;
		}
		case "selectByVisibleText":
		{
			getSelect(element).selectByVisibleText(value);
			break;
		}
		case "selectByIndex":
		{
			int val=Integer.parseInt(value);
			getSelect(element).selectByIndex(val);
			break;
		}
		case "deselectByValue":
		{
			getSelect(element).deselectByValue(value);
			break;
		}
		case "deselectByVisibleText":
		{
			getSelect(element).deselectByVisibleText(value);
			break;
		}
		case "deselectByIndex":
		{
			int val=Integer.parseInt(value);
			getSelect(element).deselectByIndex(val);
			break;
		}
		}
	}
	public List<WebElement> getAllOptions(WebElement element)
	{
		return getSelect(element).getOptions();
	}
	
	public List<WebElement> getSelectedOptions(WebElement element)
	{
		return getSelect(element).getAllSelectedOptions();
	}
	public WebElement getSelectedOption(WebElement element)
	{
		return getSelect(element).getFirstSelectedOption();
	}
	public void deselectAllValues(WebElement element)
	{
		getSelect(element).deselectAll();
	}
	
	
}
