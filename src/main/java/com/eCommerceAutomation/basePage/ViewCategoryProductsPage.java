package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class ViewCategoryProductsPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public ViewCategoryProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h2[text()='Category']")
	WebElement categoryWebElement;
	@FindBy(xpath = "(//a[@data-toggle=\"collapse\"])[1]")
	WebElement womenCategoryWebElement;
	@FindBy(xpath = "(//a[text()='Dress '])[1]")
	WebElement dressFromWomenWebElement;
	@FindBy(xpath = "(//p[contains(text(),'Sleev')])[1]")
	WebElement dressNameWebElement;
	@FindBy(xpath = "(//a[@data-toggle=\"collapse\"])[2]")
	WebElement menCategoryWebElement;
	@FindBy(xpath = "//a[text()='Jeans ']")
	WebElement jeanFromMenWebElement;

	public boolean categoryVisible() {
		return displaying(categoryWebElement);
	}
	public void womenCategoryButton() {
		onClick(womenCategoryWebElement);
	}
	public void dressFromWomenButton() {
		wait.until(ExpectedConditions.visibilityOf(dressFromWomenWebElement));
		onClick(dressFromWomenWebElement);
	}
	public String dressName() {
		return getMessage(dressNameWebElement);
	}
	public void menCategory() {
		onClick(menCategoryWebElement);
	}
	public void jeanFromMen() {
		wait.until(ExpectedConditions.visibilityOf(jeanFromMenWebElement));
		onClick(jeanFromMenWebElement);
	}
	
}
