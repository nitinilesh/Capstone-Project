package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class RegisterWhileCheckoutPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public RegisterWhileCheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	WebElement proceedCheckoutWebElement;
	@FindBy(xpath = "//u[text()='Register / Login']")
	WebElement registerLoginWebElement;
	@FindBy(xpath = "//a[text()=' Cart']")
	WebElement cartButtonWebElement;
	@FindBy(xpath = "//a[text()='Blue Top']")
	WebElement productInCartWebElement;
	
	@FindBy(xpath = "//h3[contains(text(),'delivery')]")
	WebElement deliverAddressWebElement;
	@FindBy(xpath = "//h2[contains(text(),'Review')]")
	WebElement reviewYourWebElement;
	
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement descriptionWebElement;
	@FindBy(xpath = "//a[text()='Place Order']")
	WebElement placeOrderWebElement;
	
	@FindBy(xpath = "//input[@name='name_on_card']")
	WebElement nameOnCardWebElement;
	@FindBy(xpath = "//input[@name='card_number']")
	WebElement cardNumberWebElement;
	@FindBy(xpath = "//input[@name='cvc']")
	WebElement cvvWebElement;
	@FindBy(xpath = "//input[@name='expiry_month']")
	WebElement expiryMonthWebElement;
	@FindBy(xpath = "//input[@name='expiry_year']")
	WebElement expiryYearWebElement;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitWebElement;
//	@FindBy(xpath = "")
//	WebElement continueWebElement;
	
	public void proceedCheckout() {
		onClick(proceedCheckoutWebElement);
	}
	public void registerLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(registerLoginWebElement));
		onClick(registerLoginWebElement);
	}
	public void cartButton() {
		wait.until(ExpectedConditions.visibilityOf(cartButtonWebElement));
		onClick(cartButtonWebElement);
	}
	public boolean productInCart() {
		wait.until(ExpectedConditions.visibilityOf(productInCartWebElement));
		return displaying(productInCartWebElement);
	}
	public boolean addressReview() {
		if(!displaying(deliverAddressWebElement)) return false;
		else if(!displaying(reviewYourWebElement)) return false;
		else return true;
	}
	public void descriptionAndPlaceOrder(String description) {
		enterText(descriptionWebElement, description);
		onClick(placeOrderWebElement);
	}
	public void CardCredential(String name,String cardNumer,String cvv,String month,String year) {
		enterText(nameOnCardWebElement,name);
		enterText(cardNumberWebElement,cardNumer);
		enterText(cvvWebElement,cvv);
		enterText(expiryMonthWebElement,month);
		enterText(expiryYearWebElement,year);
	}
	public void PayAndConfirmOrderButton() {
		wait.until(ExpectedConditions.elementToBeClickable(submitWebElement));
		onClick(submitWebElement);
	}

}
