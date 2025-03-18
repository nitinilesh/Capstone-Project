package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.SearchProductAndVerifyCartAfterLoginPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductAndVerifyCartAfterLoginSteps {
	WebDriver driver = Hooks.getWebDriver();
	SearchProductAndVerifyCartAfterLoginPage page = new SearchProductAndVerifyCartAfterLoginPage(driver);
	
	@When("Add all those products to cart also click Continue button")
	public void add_all_those_products_to_cart_also_click_continue_button() {
	    page.addProductToCart();
	}

	@When("Click Cart button and verify that products are visible in cart")
	public void click_cart_button_and_verify_that_products_are_visible_in_cart() {
		page.cartButton();
	   
	}
	@When("User verify that products are visible in cart")
	public void user_verify_that_products_are_visible_in_cart() {
		Assert.assertTrue( page.visibilityOfProduct());
	}
	@When("Remove all products that have been added")
	public void remove_all_products_that_have_been_added() {
	   page.removeProductToCart();
	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String string) {
	   Assert.assertEquals(page.successMessage(), string);
	}

}
