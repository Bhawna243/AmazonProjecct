package com.amazon.uipackages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class OrderConfirmationPage {
	
	WebDriver driver;
	public OrderConfirmationPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	@FindBy(how=How.XPATH,using="//div[text(),contains('Thank you')]")
	WebElement OrderConfirmation;
	
	public void orderconfirm()
	{
		Assert.assertEquals("Thank you",OrderConfirmation.getText());
	}

}
