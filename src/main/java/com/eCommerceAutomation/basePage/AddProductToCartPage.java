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

public class AddProductToCartPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	public AddProductToCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.js = (JavascriptExecutor)driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//a[text()=' Products']")
	WebElement productButtonWebElement;
	
	@FindBy(xpath = "(//div[@class='productinfo text-center'])[1]")
	WebElement productinfo1WebElement;
	@FindBy(xpath = "(//a[@data-product-id='1'])[1]")
	WebElement firstProductWebElement;
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement continueShoppingButtonWebElement;
	@FindBy(xpath = "(//div[@class='productinfo text-center'])[2]")
	WebElement productinfo2WebElement;
	@FindBy(xpath = "(//a[@data-product-id='2'])[1]")
	WebElement secondProductWebElement;
	
	
	@FindBy(xpath = "//a[text()=' Cart']")
	WebElement viewCartWebElement;
	
	@FindBy(xpath = "//a[text()='Blue Top']")
	WebElement blueTopWebElement;
	@FindBy(xpath = "//a[text()='Men Tshirt']")
	WebElement menShirtWebElement;
	
	@FindBy(xpath = "(//p[contains(text(),'500')])[1]")
	WebElement topPriceWebElement;
	@FindBy(xpath = "(//p[contains(text(),'400')])[1]")
	WebElement shirtPriceWebElement;
	@FindBy(xpath = "(//button[text()='1'])[1]")
	WebElement topQuantityWebElement;
	@FindBy(xpath = "(//button[text()='1'])[2]")
	WebElement shirtQuantityWebElement;
	@FindBy(xpath = "(//p[contains(text(),'500')])[2]")
	WebElement topTotalPriceWebElement;
	@FindBy(xpath = "(//p[contains(text(),'400')])[2]")
	WebElement shirtTotalPriceWebElement;
	
	
	public void productButton() {
		onClick(productButtonWebElement);
	}
	public void HoverAndClickFirstProduct() {
		wait.until(ExpectedConditions.visibilityOf(productinfo1WebElement));
		HoverAndClickProduct(productinfo1WebElement,firstProductWebElement);
	}
	public void HoverAndClickSecondProduct() {
		wait.until(ExpectedConditions.visibilityOf(productinfo2WebElement));
		HoverAndClickProduct(productinfo2WebElement,secondProductWebElement);
	}
	public void continueShoppingButton() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButtonWebElement));
		onClick(continueShoppingButtonWebElement);
	}
	public void viewCart() {
		wait.until(ExpectedConditions.elementToBeClickable(viewCartWebElement));
		onClick(viewCartWebElement);
	}
	public boolean verifyProductInCart() {
		if(!displaying(blueTopWebElement)) return false;
		else if(!displaying(menShirtWebElement)) return false;
		return true;
	}
	public boolean verifyPriceQuantityTotalPrice() {
		if(topPriceWebElement != topTotalPriceWebElement) return false;
		else if(shirtPriceWebElement != shirtTotalPriceWebElement) return false;
		else if(topQuantityWebElement != shirtQuantityWebElement) return false;
		return true;
	}

}
