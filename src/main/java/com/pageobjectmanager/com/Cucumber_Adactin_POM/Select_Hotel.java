package com.pageobjectmanager.com.Cucumber_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	public WebElement selectButton;
	
	@FindBy(id="continue")
	public WebElement continueToPage;
	
	public Select_Hotel(WebDriver driver1){
		this.driver=driver1;
		PageFactory.initElements(driver1, Select_Hotel.this);
	}

}
