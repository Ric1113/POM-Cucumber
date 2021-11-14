package com.pageobjectmanager.com.Cucumber_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	public WebElement location;
	
	@FindBy(id="hotels")
	public WebElement hotels;
	
	@FindBy(id="room_type")
	public WebElement roomType;
	
	@FindBy(id="room_nos")
	public WebElement noRooms;
	
	@FindBy(id="datepick_in")
	public WebElement checkIn;
	
	@FindBy(id="datepick_out")
	public WebElement checkOut;

	@FindBy(id="adult_room")
	public WebElement peopleCount;
	
	@FindBy(id="child_room")
	public WebElement childCount;
	
	@FindBy(id="Submit")
	public WebElement submit;
	
	public Search_Hotel(WebDriver driver1){
		this.driver = driver1;
		PageFactory.initElements(driver1, Search_Hotel.this);
		
	}
}
