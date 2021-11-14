package com.pageobjectmanager.com.Cucumber_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	public WebElement f_Name;
	
	@FindBy(id="last_name")
	public WebElement l_Name;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(id="cc_num")
	public WebElement card_No;
	
	@FindBy(id="cc_type")
	public WebElement cc_Type;
	
	@FindBy(id="cc_exp_month")
	public WebElement exp_Month;
	
	@FindBy(id="cc_exp_year")
	public WebElement exp_Year;
	
	@FindBy(id="cc_cvv")
	public WebElement cvv;
	
	@FindBy(id="book_now")
	public WebElement submit;
	
	
	public Book_Hotel(WebDriver driver1){
		
		this.driver = driver1;
		
		PageFactory.initElements(driver1, Book_Hotel.this);
		
	}
	
	
	
	

}
