package com.test.jiomart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.test.pages.CartPage;
import com.test.pages.HomePage;
import com.test.pages.ProductPage;
import com.test.utility.Common;
import com.test.utility.ExcelRead;
import com.test.utility.ExcelRead_Array;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	

public static	HomePage hmpg = new HomePage();
	
public static	ProductPage prdpg = new ProductPage();

public static CartPage cartpg = new CartPage();

public static Common com = new Common();

public static HashMap<String, String> map = new HashMap<String, String>();

public static DataFormatter format = new DataFormatter();

public static ExcelRead excel = new ExcelRead();

public static ExcelRead_Array excell = new ExcelRead_Array();

public static ExtentReports extent ;

public static ExtentSparkReporter spark;

public static ExtentTest logger;

    @BeforeTest
	public void generateReport()
	{
	 extent = new ExtentReports();
	 spark = new ExtentSparkReporter("target/JioMart.html");
	 extent.attachReporter(spark);
	}
	
	
	@BeforeMethod
	public void OpenApplication() throws IOException
	{
		
		File f = new File("C:\\neworkspace\\DataDrivenJuly\\src\\test\\java\\com\\test\\config\\ApplicationDetails.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String url = prop.getProperty("URL");
		
		
		String browser = prop.getProperty("Browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterTest
	public void endreport()
	{
		extent.flush();
	}
	
	public String getData(String key) throws IOException
	{
		return excel.getMapValue(key);
	}

}
