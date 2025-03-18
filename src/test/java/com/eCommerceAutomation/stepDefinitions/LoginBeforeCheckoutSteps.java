package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.basePage.LoginBeforeCheckoutPage;
import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Then;

public class LoginBeforeCheckoutSteps {
	WebDriver driver = Hooks.getWebDriver();
	ScrollUtilites scroll = new ScrollUtilites();
	LoginBeforeCheckoutPage page = new LoginBeforeCheckoutPage(driver);
	
	@Then("User Scroll page by few pixels")
	public void user_scroll_page_by_few_pixels() throws InterruptedException {
		scroll.scrollDownByPixel("800");
		Thread.sleep(1000);
	}
	@Then("User click Add to cart of product")
	public void user_click_add_to_cart_of_product() {
	    page.addtocartProduct();
	}

	@Then("User click Continue Shopping  button")
	public void user_click_continue_shopping_button() {
	    page.continueButton();
	}
}
