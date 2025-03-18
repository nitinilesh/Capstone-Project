package com.eCommerceAutomation.basePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCommerceAutomation.base.BasePage;

public class ProductDetailsPage extends BasePage{
	WebDriver driver;
	JavascriptExecutor js;
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.js = (JavascriptExecutor)driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[contains(text(),'Products')]")
	WebElement productButtonWebElement;
	@FindBy(xpath = "//div[@class=\"col-sm-4\"]")
	WebElement productIsVisibleWebElement;
	@FindBy(xpath = "//a[@href='/product_details/1']")
	WebElement viewProductWebElement;
	
	public void productButton() {
		onClick(productButtonWebElement);
	} 
	public boolean productIsVisible() {
		return productIsVisibleWebElement.isDisplayed();
	}
	public void viewProductButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", viewProductWebElement);
	}
	
	@FindBy(xpath = "//h2[text()='Blue Top']")
	WebElement productNameWebElement;
	@FindBy(xpath = "//P[contains(text(),'Category')]")
	WebElement productCategoryWebElement;
	@FindBy(xpath = "//span[contains(text(),'Rs')]")
	WebElement productPriceWebElement;
	@FindBy(xpath = "//b[contains(text(),'Availability')]")
	WebElement productAvailabilityWebElement;
	@FindBy(xpath = "//b[contains(text(),'Condition')]")
	WebElement productConditionWebElement;
	@FindBy(xpath = "//b[contains(text(),'Brand')]")
	WebElement productBrandWebElement;
	
	public boolean detailIsVisible() {
		if(!productNameWebElement.isDisplayed()) return false;
		else if(!productCategoryWebElement.isDisplayed()) return false;
		else if(!productPriceWebElement.isDisplayed()) return false;
		else if(!productAvailabilityWebElement.isDisplayed()) return false;
		else if(!productConditionWebElement.isDisplayed()) return false;
		else if(!productBrandWebElement.isDisplayed()) return false;
		else return true;	
	}
	
	

}
