package com.stepdefenition.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Pom_Manager;

import io.cucumber.java.en.*;

public class Step_Defenition {
	
	public static WebDriver driver;
	public static Pom_Manager pom = new Pom_Manager();

@Given("Application launched successfuly")
public void application_launched_successfuly() {
   System.setProperty("webdriver.chrome.driver", ""
   		+ "C:\\Users\\91989\\eclipse-workspace\\Anish eclipse\\Anish_Maven_Cucumber\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
}

@When("user enter the username in the usernname field")
public void user_enter_the_username_in_the_usernname_field() {
    
	pom.getlp().setUsername("AnishRaja");
}

@When("user enter the password in the password field")
public void user_enter_the_password_in_the_password_field() {
    
	pom.getlp().setUsername("123");
}

@Then("user click on Login Button")
public void user_click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Login sucessful")
public void login_sucessful() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("search open page opens sucessfuly")
public void search_open_page_opens_sucessfuly() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select a location from location dropdown")
public void user_select_a_location_from_location_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select a hotel from Hotels dropdown")
public void user_select_a_hotel_from_hotels_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select a type of room from Room Type dropdown")
public void user_select_a_type_of_room_from_room_type_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select a no. of rooms from Number of Rooms dropdown")
public void user_select_a_no_of_rooms_from_number_of_rooms_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter the checkIn date in Check In Date field")
public void user_enter_the_check_in_date_in_check_in_date_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter the chekOut date in Check Out Date field")
public void user_enter_the_chek_out_date_in_check_out_date_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select  no. of adults from Adults per Room dropdown")
public void user_select_no_of_adults_from_adults_per_room_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select  no. of child from Children per Room field")
public void user_select_no_of_child_from_children_per_room_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user click the search button")
public void user_click_the_search_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("All the details about Hotel is choosen")
public void all_the_details_about_hotel_is_choosen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user click select hotel Radio button")
public void user_click_select_hotel_radio_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user click continue button")
public void user_click_continue_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Hotel is selected")
public void hotel_is_selected() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter thier firstName in First Name field")
public void user_enter_thier_first_name_in_first_name_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter thier lastName in Last Name field")
public void user_enter_thier_last_name_in_last_name_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter thier address in Address field")
public void user_enter_thier_address_in_address_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter thier card no. in Credit Card Number field")
public void user_enter_thier_card_no_in_credit_card_number_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select type of card from Credit Card Type field")
public void user_select_type_of_card_from_credit_card_type_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select expiryMonth from Expiry Month field")
public void user_select_expiry_month_from_expiry_month_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select expiryYear from  Expiry Year  field")
public void user_select_expiry_year_from_expiry_year_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter CVV number")
public void user_enter_cvv_number() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user click Book Now button")
public void user_click_book_now_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Hotel is successfuly booked")
public void hotel_is_successfuly_booked() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user click on my itinerary button")
public void user_click_on_my_itinerary_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Booked iternary page is lauched")
public void booked_iternary_page_is_lauched() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user click on logout button")
public void user_click_on_logout_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
