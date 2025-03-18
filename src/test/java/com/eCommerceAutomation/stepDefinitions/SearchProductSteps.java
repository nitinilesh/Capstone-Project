package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.SearchProductPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {
	WebDriver driver = Hooks.getWebDriver();
	SearchProductPage searchProduct = new SearchProductPage(driver);
	
	@When("User search product and click search button")
	public void user_search_product_and_click_search_button() {
		searchProduct.searchProduct("top");	
	}

	@When("User Verify SEARCHED PRODUCTS is visible")
	public void user_verify_searched_products_is_visible() {
		searchProduct.searchedProduct();
	}

	@Then("Verify all the products related to search are visible")
	public void verify_all_the_products_related_to_search_are_visible() {
	   String expectedPage = "https://automationexercise.com/products?search=top";
	   Assert.assertEquals(expectedPage, driver.getCurrentUrl());
	}
}
