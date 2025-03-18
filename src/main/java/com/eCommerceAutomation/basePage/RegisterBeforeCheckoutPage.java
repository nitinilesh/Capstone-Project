package com.eCommerceAutomation.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCommerceAutomation.base.BasePage;

public class RegisterBeforeCheckoutPage extends BasePage {
	WebDriver driver;
	public RegisterBeforeCheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[contains(text(),'Signup')]")
	WebElement signupLoginWebElement;
	
	public void signupLoginHomepage() {
		onClick(signupLoginWebElement);
	}

}
