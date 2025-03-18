package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class DownloadInvoiceAfterPurchaseOrderPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public DownloadInvoiceAfterPurchaseOrderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//u[text()='Register / Login']")
	WebElement signupWebElement;
	@FindBy(xpath = "//a[text()='Download Invoice']")
	WebElement downloadInvoiceWebElement;
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement continueButtonWebElement;
	
	public void downloadInvoice() {
		wait.until(ExpectedConditions.visibilityOf(downloadInvoiceWebElement));
		onClick(downloadInvoiceWebElement);
	}
	public void continueButton() {
		wait.until(ExpectedConditions.visibilityOf(continueButtonWebElement));
		onClick(continueButtonWebElement);
	}
	public void signup() {
		wait.until(ExpectedConditions.visibilityOf(signupWebElement));
		onClick(signupWebElement);
	}
	
}
