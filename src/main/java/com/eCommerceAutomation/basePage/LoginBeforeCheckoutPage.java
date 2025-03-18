package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class LoginBeforeCheckoutPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	public LoginBeforeCheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.js = (JavascriptExecutor)driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[@data-product-id='1'])[1]")
	WebElement addtocartProductWebElement;
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement continueButtonWebElement;
	
	public void addtocartProduct() {
		wait.until(ExpectedConditions.visibilityOf(addtocartProductWebElement));
		onClick(addtocartProductWebElement);
	}
	public void continueButton() {
		wait.until(ExpectedConditions.visibilityOf(continueButtonWebElement));
		onClick(continueButtonWebElement);
		js.executeScript("window.scrollBy(0,0);");
	}
}
