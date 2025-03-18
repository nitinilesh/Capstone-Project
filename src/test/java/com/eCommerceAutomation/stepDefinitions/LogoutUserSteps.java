package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.When;

public class LogoutUserSteps {
	WebDriver driver = Hooks.getWebDriver();
	@When("User click on logout button")
	public void user_click_on_logout_button() {
	    
	}
}
