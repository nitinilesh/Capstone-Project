package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.SignupPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {

	WebDriver driver = Hooks.getWebDriver();
	SignupPage registerPage = new SignupPage(driver);
	
	@When("User verifies that the home page is visible")
	public void user_verifies_that_the_home_page_is_visible() {
	   String expectedUrl = "https://automationexercise.com/";
	   Assert.assertEquals(expectedUrl,  driver.getCurrentUrl()); 
	}
	
	@When("User verifies {string} is visible")
	public void user_verifies_is_visible(String string) throws InterruptedException {
		registerPage.signupLoginHomepage();
		Thread.sleep(2000);
		String verifynewUserSignup = registerPage.newUserSignup();
		Assert.assertEquals(verifynewUserSignup, string);
	}
	
	@When("User enters {string}, {string}")
	public void user_enters(String string, String string2) {
		registerPage.signupInformation(string, string2);
		registerPage.signupButton();
	}
	@When("User verify {string} is visible")
	public void user_verify_is_visible(String string) {
		String infoPage = registerPage.enterAccountInfo();
		Assert.assertEquals(infoPage, string);
	}
	
	@When("User enters account information {string}, {string}, {string}, {string}")
	public void user_enters_account_information(String string, String string2, String string3, String string4) throws InterruptedException {
		registerPage.accountInformation(string, string2, string3, string4);
	}
	
	@When("User enters address information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters_address_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
		registerPage.addressInformation(string, string2, string3, string4, string5, string6, string7, string8, string9, string10);
	}
	
	@When("User submits the create account form")
	public void user_submits_the_create_account_form() {
		registerPage.createAccountButton();
	}
	
	@When("User verifies that {string} is visible")
	public void user_verifies_that_is_visible(String string) {
		String message = registerPage.accountCreatedMessage();
		Assert.assertEquals(message, string);
	}
	
	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
		registerPage.continueButton();
	}
	
	@When("User verifies that LoggedIn is visible")
	public void user_verifies_that_logged_in_is_visible() {
		boolean login = registerPage.loggedInAs();
		Assert.assertTrue(login);
	}
	
	@When("User clicks on the {string} button and continue")
	public void user_clicks_on_the_button_and_continue(String string) {
		registerPage.deleteAccountButton();
		registerPage.continueButton();
	}
	@Then("User should see home page is visible")
	public void user_should_see_home_page_is_visible() {
		String expectedUrl = "https://automationexercise.com/";
		Assert.assertEquals(expectedUrl,  driver.getCurrentUrl()); 
	}
	
		
}
