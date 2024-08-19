package com.test.jiomart;

import javax.annotation.meta.Exhaustive;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.test.pages.HomePage;

public class AddToCart extends BaseClass{
	
	
	@Test
	public void validateEmptyCart() throws InterruptedException
	{
		hmpg.clickMiniCartIcon();
		
		cartpg.validateEmptyCart();
	}

}
