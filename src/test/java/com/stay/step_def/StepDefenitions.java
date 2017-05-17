package com.stay.step_def;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefenitions {
	public WebDriver driver;
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
	 
	}

	@Then("^I am searching$")
	public void i_am_searching() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
