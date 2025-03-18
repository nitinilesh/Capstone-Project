package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.basePage.AddProductToCartPage;
import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddProductToCartSteps {
	WebDriver driver = Hooks.getWebDriver();
	ScrollUtilites scroll = new ScrollUtilites();
	AddProductToCartPage addToCart = new AddProductToCartPage(driver);
	@When("User Click on Product button")
	public void user_click_on_product_button() {
		addToCart.productButton();
	}

	@When("Hover over first product and click Add to cart")
	public void hover_over_first_product_and_click_add_to_cart() {
		scroll.scrollDownByPixel("500");
		addToCart.HoverAndClickFirstProduct();
	}

	@When("Click Continue Shopping  button")
	public void click_continue_shopping_button() throws InterruptedException {
		addToCart.continueShoppingButton();
	}

	@When("Hover over second product and click Add to cart")
	public void hover_over_second_product_and_click_add_to_cart() {
		addToCart.HoverAndClickSecondProduct();
	}

	@When("Click View Cart button")
	public void click_view_cart_button() {
		addToCart.viewCart();
	}

	@When("Verify both products are added to Cart")
	public void verify_both_products_are_added_to_cart() {
		addToCart.verifyProductInCart();
	}

	@Then("Verify their prices, quantity and total price")
	public void verify_their_prices_quantity_and_total_price() {
		addToCart.verifyPriceQuantityTotalPrice();
	}


}
