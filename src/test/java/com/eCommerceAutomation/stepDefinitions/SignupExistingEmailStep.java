package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.SignupExistingEmailPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;

public class SignupExistingEmailStep {
	WebDriver driver = Hooks.getWebDriver();
	SignupExistingEmailPage existingemail = new SignupExistingEmailPage(driver);
	@Then("User verify error message")
	public void user_verify_error_message() {
		String expectedMessage = "Email Address already exist!";
		String actualMessage = existingemail.signupErrorMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		
	}
	
}
