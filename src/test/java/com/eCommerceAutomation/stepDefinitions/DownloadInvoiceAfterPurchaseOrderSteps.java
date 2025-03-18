package com.eCommerceAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.basePage.DownloadInvoiceAfterPurchaseOrderPage;
import com.eCommerceAutomation.hooks.Hooks;

import io.cucumber.java.en.Given;

public class DownloadInvoiceAfterPurchaseOrderSteps {
	WebDriver driver = Hooks.getWebDriver();
	DownloadInvoiceAfterPurchaseOrderPage page = new DownloadInvoiceAfterPurchaseOrderPage(driver);
	
	@Given("User Click on Register\\/login button of popup")
	public void user_click_on_register_login_button_of_popup() {
	    page.signup();
	}
	@Given("Click Download Invoice button and verify invoice is downloaded successfully")
	public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
	    page.downloadInvoice();
	}

	@Given("Click Continue button")
	public void click_continue_button() {
	    page.continueButton();
	}
	
	
}
