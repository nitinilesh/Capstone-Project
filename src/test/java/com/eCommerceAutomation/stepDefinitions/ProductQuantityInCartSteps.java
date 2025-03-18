package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.ProductQuantityInCartPage;
import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductQuantityInCartSteps {
	WebDriver driver = Hooks.getWebDriver();
	ProductQuantityInCartPage quantityInCart = new ProductQuantityInCartPage(driver);
	ScrollUtilites scroll = new ScrollUtilites();
	@When("User click on view product")
	public void user_click_on_view_product() {
		scroll.scrollDownByPixel("500");
		quantityInCart.viewProduct();
	}
	
	@When("User increase quantity to {string}")
	public void user_increase_quantity_to(String string) {
		quantityInCart.increaseQuantity(string);
	}
	
	@When("Click add to cart button")
	public void click_add_to_cart_button() {
		quantityInCart.addToCartButton();
	}
	@Then("Verify product quantity in cart")
	public void verify_product_quantity_in_cart() throws InterruptedException {
		Thread.sleep(1000);
		String actualQuantity = quantityInCart.verifyQuantity();
		String expectedQuantity = "4";
		Assert.assertEquals(actualQuantity, expectedQuantity);
	}
}
