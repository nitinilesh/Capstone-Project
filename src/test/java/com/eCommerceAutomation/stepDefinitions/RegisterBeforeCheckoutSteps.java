package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.basePage.RegisterBeforeCheckoutPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Given;

public class RegisterBeforeCheckoutSteps {
	WebDriver driver = Hooks.getWebDriver();
	RegisterBeforeCheckoutPage page = new RegisterBeforeCheckoutPage(driver);
	
	@Given("User Click on Register\\/login button of navbar")
	public void user_click_on_register_login_button_of_navbar() {
		page.signupLoginHomepage();
	}


}
