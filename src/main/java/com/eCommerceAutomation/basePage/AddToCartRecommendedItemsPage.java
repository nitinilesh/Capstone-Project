package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.eCommerceAutomation.base.BasePage;

public class AddToCartRecommendedItemsPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public AddToCartRecommendedItemsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h2[text()='recommended items']")
	WebElement recommendeditemsWebElement;
	@FindBy(xpath = "(//a[@data-product-id=\"6\"])[3]")
	WebElement productAddToCartWebElement;
	@FindBy(xpath = "//u[text()='View Cart']")
	WebElement viewCartWebElement;
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	WebElement itemAvailableInCartWebElement;

	public String recommendeditems() {
		wait.until(ExpectedConditions.visibilityOf(recommendeditemsWebElement));
		return getMessage(recommendeditemsWebElement);
	}
	public void productAddToCart() {
		wait.until(ExpectedConditions.visibilityOf(productAddToCartWebElement));
		onClick(productAddToCartWebElement);
	}
	public void viewCart() {
		wait.until(ExpectedConditions.visibilityOf(viewCartWebElement));
		onClick(viewCartWebElement);
	}
	public boolean itemAvailableInCart() {
		return displaying(itemAvailableInCartWebElement);
	}
	
}
