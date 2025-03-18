package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.ScrollUpUsingArrowButtonPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollUpUsingArrowButtonSteps {
	WebDriver driver = Hooks.getWebDriver();
	ScrollUpUsingArrowButtonPage page = new ScrollUpUsingArrowButtonPage(driver);
	@When("User Click on arrow at bottom")
	public void user_click_on_arrow_at_bottom() {
	    page.scrollUsingArrowButton();
	}
	@Then("User verify Full-Fledged practice website for Automation Engineers is visible")
	public void user_verify_full_fledged_practice_website_for_automation_engineers_is_visible() {
	  Assert.assertTrue(page.topOfPage());
	}
}