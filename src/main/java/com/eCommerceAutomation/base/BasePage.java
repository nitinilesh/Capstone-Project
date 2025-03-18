package com.eCommerceAutomation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void onClick(WebElement element) {
		element.click();
	}
	public void enterText(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public void handleSelect(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public boolean displaying(WebElement element) {
		return element.isDisplayed();
	}
	public String getMessage(WebElement element) {
		return element.getText();
	}
	public void HoverAndClickProduct(WebElement element,WebElement element2) {
		Actions action = new Actions(driver);
		action.moveToElement(element)
		.moveToElement(element2)
		.click()
		.build()
		.perform();
	}
	public void clearValue(WebElement element) {
		element.clear();
	}
	
}
