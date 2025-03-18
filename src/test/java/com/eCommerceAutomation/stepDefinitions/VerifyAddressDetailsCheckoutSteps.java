package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.basePage.VerifyAddressDetailsCheckoutPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.When;

public class VerifyAddressDetailsCheckoutSteps {
	WebDriver driver = Hooks.getWebDriver();
	VerifyAddressDetailsCheckoutPage page = new VerifyAddressDetailsCheckoutPage(driver);
	@When("User verify billing address and delivery address are same")
	public void user_verify_billing_address_and_delivery_address_are_same() {
	    page.deliveryAndBillingAddress();
	}
}
