package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.RegisterWhileCheckoutPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.When;

public class RegisterWhileCheckoutSteps {
	WebDriver driver = Hooks.getWebDriver();
	RegisterWhileCheckoutPage checkoutPage = new RegisterWhileCheckoutPage(driver);
	
//	@When("Click Continue Shopping")
//	public void click_continue_shopping() {
//	    
//	}
	@When("Click Proceed To Checkout")
	public void click_proceed_to_checkout() {
		checkoutPage.proceedCheckout();
	}
	@When("Click on Register\\/login button")
	public void click_on_register_login_button() {
		checkoutPage.registerLogin();
	}

	@When("User Click on Cart button")
	public void user_click_on_cart_button() {
		checkoutPage.cartButton();
	}

	@When("Verify Address Details and Review Your Order")
	public void verify_address_details_and_review_your_order() {
	    boolean expectedResult = checkoutPage.productInCart();
	    Assert.assertTrue(expectedResult);
	    boolean deliveryAddressAndReview = checkoutPage.addressReview();
		Assert.assertTrue(deliveryAddressAndReview);
	}

	@When("Enter description in comment text area and click Place Order")
	public void enter_description_in_comment_text_area_and_click_place_order() {
		checkoutPage.descriptionAndPlaceOrder("Product should be deliver before weekend.");
	}

	@When("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
	public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
		checkoutPage.CardCredential("Nilesh Patel","878565458454","254","05","2030");
	}
	@When("Click Pay and Confirm Order button")
	public void click_pay_and_confirm_order_button() {
		checkoutPage.PayAndConfirmOrderButton();
	}
}
