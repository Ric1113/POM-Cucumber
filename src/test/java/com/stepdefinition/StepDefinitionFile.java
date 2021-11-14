package com.stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.testrunner.Test_Runner;
import com.pageobjectmanager.com.Cucumber_Adactin_POM.BaseClass;
import com.pageobjectmanager.com.Cucumber_Adactin_POM.Book_Hotel;
import com.pageobjectmanager.com.Cucumber_Adactin_POM.Confirmation;
import com.pageobjectmanager.com.Cucumber_Adactin_POM.LogIn_Page;
import com.pageobjectmanager.com.Cucumber_Adactin_POM.PageObjectManager;
import com.pageobjectmanager.com.Cucumber_Adactin_POM.Search_Hotel;
import com.pageobjectmanager.com.Cucumber_Adactin_POM.Select_Hotel;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitionFile extends BaseClass  {

	public static PageObjectManager pom;
	
//	LogIn_Page lp = new LogIn_Page(driver);
//	Search_Hotel sp = new Search_Hotel(driver);
//	Select_Hotel sh = new Select_Hotel(driver);
//	Book_Hotel bh = new Book_Hotel(driver);
//	Confirmation c = new Confirmation(driver);
	
	@Given("^user launchs the browser$")
	public void user_launchs_the_browser() {
		
		driver = browseLaunch("CHROME");
		launchURL("http://adactinhotelapp.com/");
		max();
		pom = new PageObjectManager(driver);
	}

	@Then("^user has a valid username and enters it \"([^\"]*)\"$")
	public void user_has_a_valid_username_and_enters_it(String username) {
//		pom = new PageObjectManager(driver);
		inputValue(pom.login().user, username);
		
	}

	@Then("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) {
//		pom = new PageObjectManager(driver);
		inputValue(pom.login().pass, password);
	}

	@Then("^clicks the login button$")
	public void clicks_the_login_button() {
//		pom = new PageObjectManager(driver);
		click(pom.login().login);
	}
   
	@Given("^User enters his desired location$")
	public void user_enter_his_desired_location() {
		i_Wait(20);
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Search().location, "New York");
	}

	@Then("^Enters hotel name$")
	public void enters_hotel_name() {
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Search().hotels, "Hotel Sunshine");
	}

	@Then("^Selects room type$")
	public void selects_room_type() {
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Search().roomType, "Super Deluxe");
	}

	@Then("^Selects number of rooms$")
	public void selects_number_of_rooms() {
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Search().noRooms, "1");
	}

	@Then("^Specifies number of persons$")
	public void specifies_number_of_persons() {
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Search().peopleCount, "1");
	}
	@Then("^Then clicks submit$")
	public void then_clicks_submit() {
//		pom = new PageObjectManager(driver);
		click(pom.hotel_Search().submit);
	}

	@Given("^He clicks on the select button$")
	public void he_clicks_on_the_select_button() {
//		pom = new PageObjectManager(driver);
		click(pom.hotel_Select().selectButton);
	}

	@Given("^continues to the next page$")
	public void continues_to_the_next_page() {
//		pom = new PageObjectManager(driver);
		click(pom.hotel_Select().continueToPage);
	}

	@Given("^Enters his firstname$")
	public void enters_his_firstname() {
//		pom = new PageObjectManager(driver);
		inputValue(pom.hotel_Book().f_Name, "Richard");
	}

	@Then("^Enters last name$")
	public void enters_last_name() {
//		pom = new PageObjectManager(driver);
		inputValue(pom.hotel_Book().l_Name, "Kingsly");
	}

	@Then("^Enters his residencial address$")
	public void enters_residencial_address() {
//		pom = new PageObjectManager(driver);
		inputValue(pom.hotel_Book().address, "23,Wall street,New York");
	}

	@Then("^Enters Credit card number$")
	public void enters_Credit_card_number() {
//		pom = new PageObjectManager(driver);
		inputValue(pom.hotel_Book().card_No, "1234567898765432");
	}

	@Then("^Selects credit card type$")
	public void selects_credit_card_type() {
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Book().cc_Type, "VISA");
	}

	@Then("^Selects Expiry month$")
	public void selects_Expiry_month() {
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Book().exp_Month, "7");
	}

	@Then("^Expiry year$")
	public void expiry_year() {
//		pom = new PageObjectManager(driver);
		toSelectByValue(pom.hotel_Book().exp_Year, "2017");
	}

	@Then("^Enters cvv number$")
	
	public void enters_cvv_number() {
//		pom = new PageObjectManager(driver);
		inputValue(pom.hotel_Book().cvv, "123");
	}

	@Then("^clicks book now$")
	public void clicks_book_now() {
//		pom = new PageObjectManager(driver);
		click(pom.hotel_Book().submit);
		i_Wait(20);
	}

	@Given("^User logs out of the site$")
	public void user_logs_out_of_the_site() {
//		pom = new PageObjectManager(driver);
		click(pom.confirm().log_Out);
		quit();
	}

}
