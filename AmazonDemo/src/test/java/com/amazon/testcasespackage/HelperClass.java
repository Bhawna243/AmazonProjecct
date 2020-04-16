package com.amazon.testcasespackage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.apache.commons.io.FileUtils;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.framework.BrowserFactory;

import dataprovider.ConfigFileReader;

public class HelperClass {
	
	public static WebDriver driver;
	BrowserFactory obj;
	ConfigFileReader configFile;
	
	public HelperClass() {
		
	}
	
	@BeforeSuite(alwaysRun=true)
	public void open()
	{
		configFile=new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", configFile.getDriverPath());
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	 
	// Here will compare if test is failing then only it will enter into this
	if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	// method to capture screenshot
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
	 
	System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
	 
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	 
	 
	 
	}
	
	}
	 
	 @AfterSuite
	public void close() {
		driver.quit();
	}

}
