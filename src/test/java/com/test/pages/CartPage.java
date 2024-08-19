package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.jiomart.BaseClass;

public class CartPage extends BaseClass{

	
	public By productText = By.xpath("//div[@class='j-text product-name cursor-pointer j-text-body-xs ng-star-inserted']");
	public By emptyCart = By.xpath("//div[text()='Your Cart is Empty!']");
	
	
	
	
	public void retrieveProductText()
	{
		
		com.getText(productText);
	}
	
	
	public void validateEmptyCart()
	{
		
		com.validateGetText(emptyCart, "empty");
		
	}
}
