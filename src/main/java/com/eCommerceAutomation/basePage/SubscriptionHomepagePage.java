package com.eCommerceAutomation.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCommerceAutomation.base.BasePage;

public class SubscriptionHomepagePage extends BasePage {
	WebDriver driver;
	public SubscriptionHomepagePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h2[text()='Subscription']")
	WebElement SubscriptionTextWebElement;
	@FindBy(id = "susbscribe_email")
	WebElement emailWebElement;
	@FindBy(id="subscribe")
	WebElement subscribeButtonWebElement;
	@FindBy(xpath = "//div[contains(text(),'subscribed!')]")
	WebElement subscribedMessageWebElement;
	
	public boolean Subscription() {
		return displaying(SubscriptionTextWebElement);
	}
	public void enterEmail(String email) {
		enterText(emailWebElement,email);
	}
	public void subscribeButton() {
		onClick(subscribeButtonWebElement);
	}
	public String subscribedMessage() {
		return getMessage(subscribedMessageWebElement);
	}
}
