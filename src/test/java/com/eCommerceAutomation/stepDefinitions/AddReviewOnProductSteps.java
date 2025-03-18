package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.AddReviewOnProductPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReviewOnProductSteps {
	WebDriver driver = Hooks.getWebDriver();
	AddReviewOnProductPage page = new AddReviewOnProductPage(driver);
	
	@When("User Click on View Product")
	public void user_click_on_view_product() {
	   page.viewProduct();
	}
	@When("User Verify {string} is visible")
	public void user_verify_is_visible(String string) {
	   String actualText =  page.review();
	   Assert.assertEquals(actualText, string);
	}

	@When("User enter {string} {string} and {string}")
	public void user_enter_and(String string, String string2, String string3) {
	   page.reviewInfomation(string, string2, string3);
	}

	@When("User click Submit button")
	public void user_click_submit_button() {
	   page.submitReview();
	}
	@Then("Verify message after review {string}")
	public void verify_message_after_review(String string) {
	  page.successMessage();
	}
}
