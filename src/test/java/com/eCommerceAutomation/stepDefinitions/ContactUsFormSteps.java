package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.ContactUsFormPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsFormSteps {
	WebDriver driver = Hooks.getWebDriver();
	ContactUsFormPage contact = new ContactUsFormPage(driver);
	
	@When("User Click on Contact us button")
	public void user_click_on_contact_us_button() {
		contact.ContactUs();
	}

	@When("User verify GET IN TOUCH is visible")
	public void user_verify_get_in_touch_is_visible() {
		boolean visible= contact.GetInTouch();
	    Assert.assertTrue(visible);
	}

	@When("User enters {string} {string} {string} {string}")
	public void user_enters(String string, String string2, String string3, String string4) {
	   contact.contactFormInformation(string, string2, string3, string4);
	}

	@When("User click on submit button of contact us form")
	public void user_click_on_submit_button_of_contact_us_form() {
	   contact.submitButton();
	}

	@When("User accept alert pop up window")
	public void user_accept_alert_pop_up_window() {
	    contact.handleContactUsAlert();
	}

	@When("Verify success message {string} is visible")
	public void verify_success_message_is_visible(String string) {
	    String Actualmessage = contact.contactUsSuccessMessage();
	    Assert.assertEquals(Actualmessage, string);
	}

	@Then("User Click on Home button")
	public void user_click_on_home_button() {
	   contact.homeContactUsButton();
	   String expectedUrl = "https://automationexercise.com/";
	   Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
	}


}
