package com.eCommerceAutomation.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCommerceAutomation.base.BasePage;

public class SubscriptionCartpagePage extends BasePage{
	WebDriver driver;
	public SubscriptionCartpagePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()=' Cart']")
	WebElement cartButtonWebElement;
	
	public void cartButton() {
		onClick(cartButtonWebElement);
	}

}
