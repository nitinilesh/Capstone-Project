package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.ViewBrandProductPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewBrandProductSteps {
	WebDriver driver = Hooks.getWebDriver();
	ViewBrandProductPage page = new ViewBrandProductPage(driver);
	@When("User verify Brands are visible")
	public void user_verify_brands_are_visible() {
		Assert.assertTrue(page.brandSection());
	}

	@When("User click on any brand")
	public void user_click_on_any_brand() {
	    page.brandName();
	}

	@When("User confirms navigation to brand page.")
	public void user_confirms_navigation_to_brand_page() {
		String ExpectedUrl = "https://automationexercise.com/brand_products/Polo";
	   Assert.assertEquals(ExpectedUrl, driver.getCurrentUrl());
	}

	@When("User click on any product link")
	public void user_click_on_any_product_link() {
		page.viewProduct();
	}

	@Then("User confirms navigated to product page")
	public void user_confirms_navigated_to_product_page() {
		String ExpectedUrl = "https://automationexercise.com/product_details/8";
		Assert.assertEquals(ExpectedUrl, driver.getCurrentUrl());
	}
	
}