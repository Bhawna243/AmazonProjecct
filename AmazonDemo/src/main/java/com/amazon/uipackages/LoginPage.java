package com.amazon.uipackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import dataprovider.ExcelConfig;

public class LoginPage {
		ExcelConfig excel;
		WebDriver driver;
		//Instantiating constructor
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		
		}
		//Page object Model where all the elements of login Page is placed 
	@FindBy(how=How.XPATH,using="//a[@class='nav-line-1' and contains(text(), 'Sign')]")
		WebElement SignInBtn;
	@FindBy(how=How.NAME,using="email")
		WebElement username;
	@FindBy(how=How.ID,using="continue")
		WebElement ContinueBtn;
	@FindBy(how=How.NAME,using="password")
		WebElement password;
	@FindBy(how=How.ID,using="signInSubmit")
		WebElement SignIn;
	
	public void loginAmazon()
	{
		try {
			SignInBtn.click();
			Thread.sleep(2000);
			username.sendKeys(excel.getExcelData(0, 0, 1));
			Thread.sleep(1000);
			ContinueBtn.click();
			password.sendKeys(excel.getExcelData(0, 1, 1));
			Thread.sleep(2000);
			SignIn.click();
			
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
