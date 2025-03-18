package com.eCommerceAutomation.basePage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import com.eCommerceAutomation.base.BasePage;

public class SearchProductAndVerifyCartAfterLoginPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	public SearchProductAndVerifyCartAfterLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.js = (JavascriptExecutor)driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "(//a[text()='Add to cart'])[position() mod 2 = 1]")
	List<WebElement> addToCartListWebElement;
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement continueButtonWebElement;
	@FindBy(xpath = "//a[text()=' Cart']")
	WebElement cartButtonWebElement;
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	WebElement productVisibleWebElement;
	
	@FindBy(xpath = "//i[@class=\"fa fa-times\"]")
	List<WebElement> removeFromCartWebElement;
	@FindBy(xpath = "(//p[@class=\"text-center\"])[3]")
	WebElement suceesMessageWebElement;
	
	
	public void addProductToCart() {
		for(WebElement addToCart : addToCartListWebElement) {
			js.executeScript("window.scrollBy(0,arguments[0])", 500);
			wait.until(ExpectedConditions.elementToBeClickable(addToCart));
			onClick(addToCart);
			wait.until(ExpectedConditions.elementToBeClickable(continueButtonWebElement));
			onClick(continueButtonWebElement);
		}
		js.executeScript("window.scrollTo(0,0)");
	}
	public void cartButton() {
		onClick(cartButtonWebElement);
	}
	public boolean visibilityOfProduct() {
		return displaying(productVisibleWebElement);
	}
	public void removeProductToCart() {
		for(WebElement removeToCart : removeFromCartWebElement) {
			wait.until(ExpectedConditions.visibilityOf(removeToCart));
			onClick(removeToCart);
			js.executeScript("window.scrollBy(0,arguments[0])", 100);
			
		}
	}
	public String successMessage() {
		wait.until(ExpectedConditions.visibilityOf(suceesMessageWebElement));
		return getMessage(suceesMessageWebElement);
	}
	
}
