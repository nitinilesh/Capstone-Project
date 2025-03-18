package com.eCommerceAutomation.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCommerceAutomation.base.BasePage;

public class LogoutPage extends BasePage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()=' Logout']")
	WebElement logoutButtonWebElement;
	
	public void logoutButton() {
		onClick(logoutButtonWebElement);
	}
}
