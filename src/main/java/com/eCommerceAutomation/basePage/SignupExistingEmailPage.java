package com.eCommerceAutomation.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCommerceAutomation.base.BasePage;

public class SignupExistingEmailPage extends BasePage {
	WebDriver driver;
	public SignupExistingEmailPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//p[contains(text(),'already exist')]")
	WebElement signupErrorMessageWebElement;
	
	public String signupErrorMessage() {
		return signupErrorMessageWebElement.getText();
	}
	
}
