package com.test.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.jiomart.BaseClass;

public class HomePage extends BaseClass{
	
//	public String searchTextBox = "//input[@enterkeyhint='search']";
	
	public By searchBox = By.xpath("//input[@enterkeyhint='search']");
	
	public By frstProduct = By.xpath("(//img[@class='lazyautosizes lazyloaded'])[1]");
	
	public By miniCarticon = By.id("btn_minicart");
	
	
	
	public void searchProduct() throws IOException
	{
		com.enterValue(hmpg.searchBox, getData("Product1"), "SearchBox");
	}
	
	public void searchProductt(String product)
	{
		com.enterValue(hmpg.searchBox, product, "Searchbox");
	}
	
	public void clickFirstProduct()
	{
		com.clickElement(hmpg.frstProduct, "First Product");
	}
	

	
	public void clickMiniCartIcon()
	{
		com.clickElement(hmpg.miniCarticon, "Mini Cart");
	
	}

}
