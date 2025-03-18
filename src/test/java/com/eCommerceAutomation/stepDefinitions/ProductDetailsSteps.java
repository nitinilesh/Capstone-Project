package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.ProductDetailsPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailsSteps {
	WebDriver driver = Hooks.getWebDriver();
	ProductDetailsPage productdetails = new ProductDetailsPage(driver);
	
	@When("User click on Products button")
	public void user_click_on_products_button() {
		productdetails.productButton();
	}

	@When("User is navigated to ALL PRODUCTS page successfully")
	public void user_is_navigated_to_all_products_page_successfully() {
	    String expectedUrl = "https://automationexercise.com/products";
	    Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
	}

	@When("User Click on View Product of first product")
	public void user_click_on_view_product_of_first_product() {
		productdetails.viewProductButton();
	}
	@When("User verify product page is visible")
	public void user_verify_product_page_is_visible() {
		String ExpectedUrl = "https://automationexercise.com/products";
		Assert.assertEquals(ExpectedUrl, driver.getCurrentUrl());
	}
	@Then("Verify detail is visible: product name, category, price, availability, condition, brand")
	public void verify_detail_is_visible_product_name_category_price_availability_condition_brand() {
	   boolean verifyDetailsIsVisible = productdetails.productIsVisible();
	   Assert.assertTrue(verifyDetailsIsVisible);
	}
}
