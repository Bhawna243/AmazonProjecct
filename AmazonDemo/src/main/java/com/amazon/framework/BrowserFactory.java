package com.amazon.framework;
import org.openqa.selenium.chrome.*;

import dataprovider.ConfigFileReader;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	static ConfigFileReader configfile;
	 
	public BrowserFactory()
	{
	 
	}
	
	public static WebDriver getDriver()
	{
	
	if(driver==null)
	{
	configfile=new ConfigFileReader();
	System.out.println("in chrome");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(configfile.getImplicitlyWait(), TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(configfile.getImplicitlyWait(), TimeUnit.SECONDS);
	}
	return driver;
	}
	 
	public static WebDriver getDriver(String browserName){
	if(driver==null)
	{
	if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("in chrome");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(configfile.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(configfile.getImplicitlyWait(), TimeUnit.SECONDS);
	    }
	
	}
	return driver;
	}
	}


