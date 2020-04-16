package com.amazon.testcasespackage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazon.uipackages.AddtoCartPage;
import com.amazon.uipackages.LoginPage;
import com.amazon.uipackages.OrderConfirmationPage;
import com.amazon.uipackages.PaymentPage;
import com.amazon.uipackages.SearchPage;

import dataprovider.ConfigFileReader;

@Listeners(testlistner.TestResult.class)
public class TestBaseClass extends HelperClass {
	
	 ConfigFileReader configFileReader;

	public TestBaseClass()
	{
		
	}
@Test(priority=0)
public void LoginTestCase()
{
	try {
		System.out.println("Item purchase started");
		configFileReader=new ConfigFileReader();
		driver.get(configFileReader.getApplicationUrl());
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginAmazon();
		System.out.println("Login Pass");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}

@Test(priority=1)
public void SearchItemTestCase() {
	
	try {
		SearchPage searchpage =PageFactory.initElements(driver, SearchPage.class);
		searchpage.SearchAnItem();
		searchpage.SelectRandomProduct();
		System.out.println(" Test Case Searching an item :Pass");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}



@Test(priority=2)
public void AddtoCartTestCase() {
	try {
		AddtoCartPage addtocartpage=PageFactory.initElements(driver, AddtoCartPage.class);
		addtocartpage.ContinueToPay();
		System.out.println("Testcase Add to Cart:Pass");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
@Test(priority=3)
public void PaymentTestCase() {
	try {
		PaymentPage paymentpage=PageFactory.initElements(driver, PaymentPage.class);
		paymentpage.proceedtopay();
		System.out.println("Testcase Payment:Pass");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
@Test(priority=4)
public void OrderConfirmTestCase() {
	try {
		OrderConfirmationPage orderconfirmPage=PageFactory.initElements(driver, OrderConfirmationPage.class);
		orderconfirmPage.orderconfirm();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

