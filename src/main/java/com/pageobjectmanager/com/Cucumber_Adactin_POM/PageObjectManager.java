package com.pageobjectmanager.com.Cucumber_Adactin_POM;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public static WebDriver driver;
	
	
	private LogIn_Page lp;
	private Search_Hotel sh;
	private Select_Hotel sl;
	private Book_Hotel bh;
	private Confirmation c;
	
	public LogIn_Page login() {
		lp = new LogIn_Page( driver) ;
		return lp;	
	}
	
	public Search_Hotel hotel_Search() {
		sh = new Search_Hotel(driver);
		return sh;
		
	}
	
	public Select_Hotel hotel_Select() {
		sl= new Select_Hotel(driver);
		return sl;
		
	}
	
	public Book_Hotel hotel_Book() {
		bh = new Book_Hotel(driver);
		return bh;
		
	}

	public Confirmation confirm() {
		c= new Confirmation(driver);
		return c;
	}
	

	public PageObjectManager(WebDriver driver2) {
	
		this.driver=driver2;
	
		
	}
	
	

}
