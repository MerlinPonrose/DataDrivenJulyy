package com.test.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import com.test.jiomart.BaseClass;

public class Common extends BaseClass{
	
	
	public void clickElement(By locator,String elementName)
	{
		try
		{
			WebElement ele = driver.findElement(locator);
			ele.click();
			System.out.println(elementName+"is clicked successfully");
			logger.log(Status.PASS,elementName+"is clicked successfully");
		}
		catch(Exception e) {
			System.out.println(elementName+"is not clicked successfully");
			logger.log(Status.FAIL, elementName+"is not clicked successfully");
			
		}
	}
	
	public void enterValue(By loc,String value, String element)
	{
		try
		{
			WebElement ele = driver.findElement(loc);
			ele.click();
			ele.clear();
			ele.sendKeys(value);
			System.out.println("value entered successfully in "+element);
			logger.log(Status.PASS, "value entered successfully in "+element);
		}
		catch(Exception e)
		{
			System.out.println("Value not enetered in "+element);
			logger.log(Status.FAIL, "Value not enetered in "+element);
		}
	}
	
	public void getText(By locator)
	{
		try
		{
			WebElement ele = driver.findElement(locator);
			String text = ele.getText();
			System.out.println(text);
		}
		catch(Exception e)
		{
			System.out.println("Text is not retrieved");
		}
	}
	
	public void validateGetText(By locator,String expectedValue)
	{
		String text = driver.findElement(locator).getText();
		
		if(text.contains(expectedValue)) {
			System.out.println("cart empty text is present");
		}
		else
		{
			System.out.println("empty cart text is not present");
		}
	}

}
