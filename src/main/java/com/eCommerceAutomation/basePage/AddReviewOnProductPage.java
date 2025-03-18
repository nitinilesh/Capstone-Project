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

public class AddReviewOnProductPage extends BasePage{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	public AddReviewOnProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.js = (JavascriptExecutor)driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath = "(//a[text()='View Product'])[3]")
	WebElement productWebElement;
	@FindBy(xpath = "//a[text()='Write Your Review']")
	WebElement reviewWebElement;
	@FindBy(id = "name")
	WebElement nameWebElement;
	@FindBy(id = "email")
	WebElement emailWebElement;
	@FindBy(id = "review")
	WebElement addReviewWebElement;
	@FindBy(id = "button-review")
	WebElement submitReviewWebElement;
	
	@FindBy(xpath = "//span[text()='Thank you for your review.']")
	WebElement successMessageWebElement;
	
	public void viewProduct() {
		js.executeScript("arguments[0].scrollIntoView(true);", productWebElement);
		wait.until(ExpectedConditions.elementToBeClickable(productWebElement));
		onClick(productWebElement);
	}
	
	public String review() {
		js.executeScript("arguments[0].scrollIntoView(true);", reviewWebElement);
		return getMessage(reviewWebElement);
	}
	public void reviewInfomation(String name,String email,String addReview) {
		wait.until(ExpectedConditions.visibilityOf(nameWebElement));
		enterText(nameWebElement,name);
		enterText(emailWebElement,email);
		enterText(addReviewWebElement,addReview);
	}
	public void submitReview() {
		wait.until(ExpectedConditions.elementToBeClickable(submitReviewWebElement));
		onClick(submitReviewWebElement);
	}
	public String successMessage() {
		wait.until(ExpectedConditions.visibilityOf(successMessageWebElement));
		return getMessage(successMessageWebElement);
	}
	
	
	

}
