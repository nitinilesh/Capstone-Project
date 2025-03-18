package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class ContactUsFormPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	public ContactUsFormPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()=' Contact us']")
	WebElement ContactUsWebElement;
	@FindBy(xpath = "//h2[contains(text(),'Touch')]")
	WebElement GetInTouchWebElement;
	@FindBy(xpath = "//input[@name='name']")
	WebElement nameWebElement;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailWebElement;
	@FindBy(xpath = "//input[@name='subject']")
	WebElement subjectWebElement;
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement descriptionWebElement;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submitButtonWebElement;
	@FindBy(xpath = "//div[@class='status alert alert-success']")
	WebElement contactusSuccessMessageWebElement;
	@FindBy(xpath = "//span[text()=' Home']")
	WebElement homeContactUsWebElement;
	
	
	public void ContactUs() {
		onClick(ContactUsWebElement);
	}
	public boolean GetInTouch() {
		return GetInTouchWebElement.isDisplayed();
	}
	public void contactFormInformation(String name,String email,String subject,String message) {
		enterText(nameWebElement,name);
		enterText(emailWebElement,email);
		enterText(subjectWebElement,subject);
		enterText(descriptionWebElement,message);	
	}
	public void submitButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitButtonWebElement);
//		onClick(submitButtonWebElement);
	}
	public void handleContactUsAlert() {
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public String contactUsSuccessMessage() {
		return contactusSuccessMessageWebElement.getText();
	}
	public void homeContactUsButton() {
		wait.until(ExpectedConditions.elementToBeClickable(homeContactUsWebElement));
		onClick(homeContactUsWebElement);
	}
	

}
