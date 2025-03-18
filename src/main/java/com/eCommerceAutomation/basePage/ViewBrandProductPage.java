package com.eCommerceAutomation.basePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eCommerceAutomation.base.BasePage;

public class ViewBrandProductPage extends BasePage {
	WebDriver driver;
	JavascriptExecutor js;
	public ViewBrandProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h2[text()='Brands']")
	WebElement brandSectionWebElement;
	@FindBy(xpath = "//a[text()='Polo']")
	WebElement brandNameWebElement;
	@FindBy(xpath = "(//a[text()='View Product'])[2]")
	WebElement viewProductWebElement;
	
	public boolean brandSection() {
		js.executeScript("window.scrollBy(0,arguments[0])", 500);
		return displaying(brandSectionWebElement);
	}
	public void brandName() {
		js.executeScript("window.scrollBy(0,arguments[0])", 500);
		onClick(brandNameWebElement);
	}
	public void viewProduct() {
		js.executeScript("window.scrollBy(0,arguments[0])", 500);
		onClick(viewProductWebElement);
	}

	
}
