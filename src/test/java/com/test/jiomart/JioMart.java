package com.test.jiomart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.test.pages.HomePage;
import com.test.pages.ProductPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JioMart extends BaseClass{
	
	
	@Test(dataProvider="getData")
	public void jioMartt(String product) throws InterruptedException, IOException
	{
		
		logger = extent.createTest("JioMart Search Product");
	//	hmpg.searchProduct();
	
	
	
		logger.log(Status.INFO, "Test case started ");
		hmpg.searchProductt(product);
		Thread.sleep(5000);
	
		hmpg.clickFirstProduct();
		
		prdpg.clickAddToCart();
		
	
		Thread.sleep(6000);
	
		hmpg.clickMiniCartIcon();
			
		Thread.sleep(7000);
		
		cartpg.retrieveProductText();
		
		logger.log(Status.INFO, "Test case completed ");
	}
	
	@Test
	public void test()
	{
		logger = extent.createTest("Test case 2");

		logger.log(Status.INFO, "Test case started ");
		logger.log(Status.PASS, "Test case passed ");
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		return excell.excellread();
	}

}
