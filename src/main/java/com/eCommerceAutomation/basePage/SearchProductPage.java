package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class SearchProductPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public SearchProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement searchProductBarWebElement;
	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement searchProductButtonWebElement;
	@FindBy(xpath = "//div[@class='product-image-wrapper']")
	WebElement SearchedProductListWebElement;
	
	public void searchProduct(String productName) {
		enterText(searchProductBarWebElement,productName);
		wait.until(ExpectedConditions.elementToBeClickable(searchProductButtonWebElement));
		onClick(searchProductButtonWebElement);
	}
	public boolean searchedProduct() {
		return SearchedProductListWebElement.isDisplayed();
	}

}
