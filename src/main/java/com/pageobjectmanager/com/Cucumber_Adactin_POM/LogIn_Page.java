package com.pageobjectmanager.com.Cucumber_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {
	public static WebDriver driver;
	
	@FindBy(id="username")
	public WebElement user;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(id="login")
	public WebElement login;
	
	public LogIn_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, LogIn_Page.this);
		
	}
	

}
