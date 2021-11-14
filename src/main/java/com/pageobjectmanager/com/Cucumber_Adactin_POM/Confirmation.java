package com.pageobjectmanager.com.Cucumber_Adactin_POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	
	public static WebDriver driver;

	@FindBy(id="logout")
	public WebElement log_Out;
	
	public Confirmation(WebDriver driver1){
		
		this.driver = driver1;
		
		PageFactory.initElements(driver1,Confirmation.this);
		
	}
	
	
}
