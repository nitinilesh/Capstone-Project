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

public class SignupPage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js; 
	public SignupPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.js = (JavascriptExecutor)driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[contains(text(),'Signup')]")
	WebElement signupLoginWebElement;
	@FindBy(xpath = "//h2[text()='New User Signup!']")
	WebElement newUserSignupWebElement;
	
	@FindBy(xpath = "//input[@data-qa='signup-name']")
	WebElement nameWebElement;
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement emailWebElement;
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	WebElement signupButtonWebElement;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement titleWebElement;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordWebElement;
	@FindBy(xpath = "//select[@id='days']")
	WebElement dateWebElement;
	@FindBy(xpath = "//select[@id='months']")
	WebElement monthWebElement;
	@FindBy(xpath = "//select[@id='years']")
	WebElement yearsWebElement;
	@FindBy(id = "newsletter")
	WebElement newsletterWebElement;
	@FindBy(xpath = "//input[@id='optin']")
	WebElement getOfferWebElement;
	@FindBy(xpath = "//b[text()='Enter Account Information']")
	WebElement enterAccountInfomationWebElement;
	//signup page1
	public void signupLoginHomepage() {
		wait.until(ExpectedConditions.elementToBeClickable(signupLoginWebElement));
		onClick(signupLoginWebElement);
	}
	public String newUserSignup() {
		wait.until(ExpectedConditions.visibilityOf(newUserSignupWebElement));
		return newUserSignupWebElement.getText();
	}
	
	public void signupInformation(String firstName,String email) {
		wait.until(ExpectedConditions.visibilityOf(nameWebElement));
		enterText(nameWebElement, firstName);
		wait.until(ExpectedConditions.visibilityOf(emailWebElement));
		enterText(emailWebElement, email);
	}
	public void signupButton() {
		wait.until(ExpectedConditions.elementToBeClickable(signupButtonWebElement));
		onClick(signupButtonWebElement);
	}
	public String enterAccountInfo() {
		return enterAccountInfomationWebElement.getText();
	}
	
	//account information
	
	public void accountInformation(String password, String days,String month,String years) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(passwordWebElement));
		enterText(passwordWebElement,password);
		handleSelect(dateWebElement,days);
		handleSelect(monthWebElement,month);
		handleSelect(yearsWebElement,years);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", newsletterWebElement);
		js.executeScript("arguments[0].click();", getOfferWebElement);
	}
	//address information
	@FindBy(xpath = "//input[@data-qa='first_name']")
	WebElement firstNameWebElement;
	@FindBy(xpath = "//input[@data-qa='last_name']")
	WebElement lastNameWebElement;
	@FindBy(xpath = "//input[@data-qa='company']")
	WebElement companyWebElement;
	@FindBy(xpath = "//input[@data-qa='address']")
	WebElement addressWebElement;
	@FindBy(xpath = "//input[@data-qa='address2']")
	WebElement address2WebElement;
	@FindBy(xpath = "//select[@data-qa='country']")
	WebElement countryWebElement;
	@FindBy(xpath = "//input[@data-qa='state']")
	WebElement stateWebElement;
	@FindBy(xpath = "//input[@data-qa='city']")
	WebElement cityWebElement;
	@FindBy(xpath = "//input[@data-qa='zipcode']")
	WebElement zipcodeWebElement;
	@FindBy(xpath = "//input[@data-qa='mobile_number']")
	WebElement mobileNumberWebElement;
	@FindBy(xpath = "//button[text()='Create Account']")
	WebElement createAccountWebElement;
	
	public void addressInformation(String firstName,String lastName,String company,String address,String address2,String country,String state,String city,String zipcode,String mobileNumber) {
		enterText(firstNameWebElement,firstName);
		enterText(lastNameWebElement,lastName);
		enterText(companyWebElement,company);
		enterText(addressWebElement,address);
		enterText(address2WebElement,address2);
		handleSelect(countryWebElement,country);
		enterText(stateWebElement,state);
		enterText(cityWebElement,city);
		enterText(zipcodeWebElement,zipcode);
		enterText(mobileNumberWebElement,mobileNumber);
	}
	public void createAccountButton() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		wait.until(ExpectedConditions.elementToBeClickable(createAccountWebElement));
		onClick(createAccountWebElement);
	}
	
	@FindBy(xpath = "//b[text()='Account Created!']")
	WebElement successMessageWebElement;
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement continueButtonWebElement;
	@FindBy(xpath = "//a[contains(text(),' Logged in as')]")
	WebElement loggedInAsWebElement;
	@FindBy(xpath = "//a[(text()=' Delete Account')]")
	WebElement deleteAccountWebElement;
	@FindBy(xpath = "//b[(text()='Account Deleted!')]")
	WebElement deleteMessageWebElement;
	
	public String accountCreatedMessage() {
		return successMessageWebElement.getText();
	}
	public void continueButton() {
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonWebElement));
		onClick(continueButtonWebElement);
	}
	public boolean loggedInAs() {
		wait.until(ExpectedConditions.visibilityOf(loggedInAsWebElement));
		return loggedInAsWebElement.isDisplayed();
	}
	public void deleteAccountButton() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteAccountWebElement));
		onClick(deleteAccountWebElement);
	}
	public String AaccountDeleteMessage() {
		wait.until(ExpectedConditions.visibilityOf(deleteMessageWebElement));
		return deleteMessageWebElement.getText();
	}
	
}
