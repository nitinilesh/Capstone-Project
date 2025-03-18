package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class ProductQuantityInCartPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public ProductQuantityInCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[@href=\"/product_details/1\"]")
	WebElement viewProductWebElement;
	@FindBy(xpath = "//input[@id='quantity']")
	WebElement quantityWebElement;
	@FindBy(xpath = "//input[@id='quantity']")
	WebElement verifyQuantityWebElement;
	@FindBy(xpath = "//button[@class='btn btn-default cart']")
	WebElement addToCartButtonWebElement;

	
	public void viewProduct(){
		wait.until(ExpectedConditions.elementToBeClickable(viewProductWebElement));
		onClick(viewProductWebElement);
	}
	public void increaseQuantity(String quantity) {
		wait.until(ExpectedConditions.visibilityOf(quantityWebElement));
		clearValue(quantityWebElement);
		enterText(quantityWebElement,quantity);
	}
    public void addToCartButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonWebElement));
		onClick(addToCartButtonWebElement);
	}
    @SuppressWarnings("deprecation")
	public String verifyQuantity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(verifyQuantityWebElement));
        return verifyQuantityWebElement.getAttribute("value").trim();  
    }


}
