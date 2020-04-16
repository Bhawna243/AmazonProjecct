package com.amazon.uipackages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import dataprovider.ExcelConfig;

public class SearchPage {
	ExcelConfig excel;
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	//Page object Model where all the elements of Search Page is placed 
	@FindBy(how=How.ID,using="twotabsearchtextbox")
		WebElement SearchTextBox;
	@FindBy(how=How.CLASS_NAME,using="nav-input")
		WebElement SearchBtn;
	@FindBy(how=How.XPATH,using="//div[text(),contains('s-search-result')")
		List<WebElement> allproducts;
	@FindBy(how=How.ID,using="add-to-cart-button-submit" )
		WebElement AddtoCart;
	
	//Input some value in Search-box and Search the same product
	
	public void SearchAnItem()
	{
		try {
			
			SearchTextBox.sendKeys(excel.getExcelData(0,2,1));
			Thread.sleep(1000);
			SearchBtn.click();
			allproducts.get(0).click();
			Thread.sleep(2000);
			AddtoCart.click();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}


	}
	
	//Random product selection method
	public void SelectRandomProduct() {
		driver.navigate().back();
		Random rand = new Random();
	    int randomProduct = rand.nextInt(allproducts.size());
	    allproducts.get(randomProduct).click();
	    AddtoCart.click();
	}
}
	
	
