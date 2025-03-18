package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.LoginPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	WebDriver driver = Hooks.getWebDriver();
	LoginPage loginpage = new LoginPage(driver);
	
	@Given("User is on homePage of eCommerce site")
	public void user_is_on_home_page_of_e_commerce_site() {
		String expectedUrl = "https://automationexercise.com/";
		Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
	}

	@Then("User verify Login to your account is visible")
	public void user_verify_login_to_your_account_is_visible() {
	    String expectedMessaage = "Login to your account";
	    String actualMessage = loginpage.logintoYourAccount();
	    Assert.assertEquals(expectedMessaage, actualMessage);
	}
	
	@Given("User is on login\\/signup page of eCommerce site")
	public void user_is_on_login_signup_page_of_e_commerce_site() {
		loginpage.signupLogin();
	}

	@When("User enter valid {string} and {string};")
	public void user_enter_valid_and(String string, String string2) {
		loginpage.enterEmailPassword(string, string2);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginpage.clickLoginButton();
	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
		boolean loggedInAs= loginpage.isLoggedIn();
		Assert.assertTrue(loggedInAs);
	}

	@When("User enter invalid {string} and {string};")
	public void user_enter_invalid_and(String string, String string2) {
		loginpage.enterEmailPassword(string, string2);
	}

	@Then("Verify error message {string}")
	public void verify_error_message(String string) {
		String message = loginpage.getNotLoginMessage();
		Assert.assertEquals(message, string);
	}



}
