package com.amazon.uipackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddtoCartPage {
	

	WebDriver driver;
	public AddtoCartPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	@FindBy(how=How.ID,using="nav-cart-count")
			WebElement AddtoCartIcon;
	
	//This method clicks on Addtocart present on the home-page and continue to proceed for the payment
	public void ContinueToPay()
	{
		AddtoCartIcon.click();
	}

}
