package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.SubscriptionHomepagePage;
import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscriptionHomePageSteps {
	WebDriver driver = Hooks.getWebDriver();
	ScrollUtilites scroll = new ScrollUtilites();
	SubscriptionHomepagePage subscriptionHomepage = new SubscriptionHomepagePage(driver);
	@When("User Scroll down to footer")
	public void user_scroll_down_to_footer() {
		scroll.scrollToButtom();
	}

	@When("User Verify text SUBSCRIPTION")
	public void user_verify_text_subscription() {
		boolean expected =  subscriptionHomepage.Subscription();
		Assert.assertTrue(expected);
	}

	@When("User enter {string} and click arrow button")
	public void user_enter_and_click_arrow_button(String string) {
		subscriptionHomepage.enterEmail(string);
		subscriptionHomepage.subscribeButton();
	}

	@Then("Verify success message {string}")
	public void verify_success_message(String string) {
		subscriptionHomepage.subscribedMessage();
	}
}
