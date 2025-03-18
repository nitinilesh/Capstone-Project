package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class RemoveProductFromCartPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public RemoveProductFromCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement removeProductFromCartButton;
	@FindBy(xpath = "(//a[@data-product-id=\"1\"])[1]")
	WebElement productFromCartButton;
	
	public void removeProductButton() {
		wait.until(ExpectedConditions.visibilityOf(removeProductFromCartButton));
		onClick(removeProductFromCartButton);
	}
	public void productButton() {
		wait.until(ExpectedConditions.visibilityOf(productFromCartButton));
		onClick(productFromCartButton);
	}
}

