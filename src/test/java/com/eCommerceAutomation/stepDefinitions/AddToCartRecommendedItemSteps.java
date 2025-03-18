package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.AddToCartRecommendedItemsPage;
import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartRecommendedItemSteps {
	WebDriver driver = Hooks.getWebDriver();
	AddToCartRecommendedItemsPage page = new AddToCartRecommendedItemsPage(driver);
	ScrollUtilites scroll = new ScrollUtilites();
	

@When("User scroll to bottom of page")
public void user_scroll_to_bottom_of_page() {
	 scroll.scrollToButtom();
}

@When("User verify {string} are visible")
public void user_verify_are_visible(String string) {
	String expectedText = page.recommendeditems();
    Assert.assertEquals(expectedText, string);
}

@When("User click on Add to cart recommended item")
public void user_click_on_add_to_cart_recommended_item() {
	page.productAddToCart();
}

@When("Click View Cart button from popup")
public void click_view_cart_button_from_popup() {
	page.viewCart();
}

@Then("Verify that product is displayed in cart page")
public void verify_that_product_is_displayed_in_cart_page() {
	Assert.assertTrue(page.itemAvailableInCart());
}
}
