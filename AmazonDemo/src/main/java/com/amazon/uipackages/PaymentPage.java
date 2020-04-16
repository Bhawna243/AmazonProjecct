package com.amazon.uipackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {
	

	WebDriver driver;
	public PaymentPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	@FindBy(how=How.XPATH, using="//div[text(),contains('Proceed to pay')]")
		WebElement ProceedtoPayBtn;
	
	public void proceedtopay() {
		ProceedtoPayBtn.click();
	}
	

}
