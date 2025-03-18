package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerceAutomation.basePage.TestCasesPagePage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCasesPageSteps {
	WebDriver driver = Hooks.getWebDriver();
	TestCasesPagePage testcases = new TestCasesPagePage(driver);
			
	
	@When("User clicks on test cases button")
	public void user_clicks_on_test_cases_button() {
		testcases.testCasesButton();
	}

	@Then("Verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() {
	   String ExpectedUrl = "https://automationexercise.com/test_cases";
	   Assert.assertEquals(ExpectedUrl, driver.getCurrentUrl());
	}
}
