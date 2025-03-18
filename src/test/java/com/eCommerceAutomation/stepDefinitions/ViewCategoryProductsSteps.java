package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.ViewCategoryProductsPage;
import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewCategoryProductsSteps {
	WebDriver driver = Hooks.getWebDriver();
	ViewCategoryProductsPage page = new ViewCategoryProductsPage(driver);
	ScrollUtilites scroll = new ScrollUtilites();
	@When("User verify that categories are visible on left side bar")
	public void user_verify_that_categories_are_visible_on_left_side_bar() {
	    Assert.assertTrue(page.categoryVisible());
	}
	
	@When("User click on Women category")
	public void user_click_on_women_category() {
		scroll.scrollDownByPixel("400");
		page.womenCategoryButton();
	}

	@When("User click on Dress link under Women category")
	public void user_click_on_dress_link_under_women_category() {
	   page.dressFromWomenButton();
	}

	@When("User verify that category page is displayed")
	public void user_verify_that_category_page_is_displayed() {
	    String expectedUrl = "https://automationexercise.com/category_products/1";
	    String actualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl, actualUrl);
	}

	@When("User confirm text {string}")
	public void user_confirm_text(String string) {
	    String actualName= page.dressName();
	    Assert.assertEquals(actualName, string);
	}

	@When("User click on any sub-category link of Men category")
	public void user_click_on_any_sub_category_link_of_men_category() {
	    page.menCategory();
	    page.jeanFromMen();
	}

	@Then("Verify that user is navigated to that category page")
	public void verify_that_user_is_navigated_to_that_category_page() {
	    String expectedUrl = "https://automationexercise.com/category_products/6";
	    String actualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl, actualUrl);
	}



}
