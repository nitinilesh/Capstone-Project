package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.basePage.RemoveProductFromCartPage;
import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RemoveProductFromCartSteps {
	WebDriver driver = Hooks.getWebDriver();
	ScrollUtilites scroll = new ScrollUtilites();
	RemoveProductFromCartPage page = new RemoveProductFromCartPage(driver);
	
	@Given("User Scroll page down by few pixels")
	public void user_scroll_page_down_by_few_pixels() {
		scroll.scrollDownByPixel("600");
	}
	@Given("User click Add to cart a product")
	public void user_click_add_to_cart_a_product() {
	   page.productButton();
	}
	@Then("User remove product from cart")
	public void user_remove_product_from_cart() {
		page.removeProductButton();
	}
}
