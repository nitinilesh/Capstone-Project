package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.basePage.SubscriptionCartpagePage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.When;

public class SubscriptionCartPageSteps {
	WebDriver driver = Hooks.getWebDriver();
	SubscriptionCartpagePage cartpage = new SubscriptionCartpagePage(driver);
	
	@When("User click Cart button")
	public void user_click_cart_button() {
		cartpage.cartButton();
	}
}
