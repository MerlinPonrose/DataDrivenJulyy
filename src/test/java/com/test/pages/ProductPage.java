package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.jiomart.BaseClass;

public class ProductPage extends BaseClass{
	
	public By addToCartbutton= By.xpath("(//button[text()='Add to Cart'])[1]");
	
	
	public void clickAddToCart()
	{
		com.clickElement(prdpg.addToCartbutton, "Add To Cart Button");
		
	}

}
