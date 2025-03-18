package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.hooks.Hooks;
import com.eCommerceAutomation.utilities.ScrollUtilites;

import io.cucumber.java.en.Given;

public class ScrollUpWithoutUsingArrowButtonSteps {
	WebDriver driver = Hooks.getWebDriver();
	ScrollUtilites scroll = new ScrollUtilites();
	@Given("User scroll up without arrow button")
	public void user_scroll_up_without_arrow_button() {
	    scroll.scrollTopOfPage();
	}
}
