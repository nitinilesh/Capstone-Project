package com.eCommerceAutomation.basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class LoginPage extends BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    private WebElement signupLoginWebElement;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement loginYourAccountWebElement;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement emailWebElement;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement passwordWebElement;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButtonWebElement;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    private WebElement loggedInAsWebElement;

    @FindBy(xpath = "//p[contains(text(),'incorrect')]")
    private WebElement notLoginMessageWebElement;

 
    public void signupLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(signupLoginWebElement));
        onClick(signupLoginWebElement);
    }


    public String logintoYourAccount() {
        wait.until(ExpectedConditions.visibilityOf(loginYourAccountWebElement));
        return loginYourAccountWebElement.getText();
    }

    public void enterEmailPassword(String email, String password) {
        wait.until(ExpectedConditions.visibilityOf(emailWebElement));
        enterText(emailWebElement, email);
        wait.until(ExpectedConditions.visibilityOf(passwordWebElement));
        enterText(passwordWebElement, password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonWebElement));
        onClick(loginButtonWebElement);
    }

    public boolean isLoggedIn() {
        try {
            wait.until(ExpectedConditions.visibilityOf(loggedInAsWebElement));
            return loggedInAsWebElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getNotLoginMessage() {
        wait.until(ExpectedConditions.visibilityOf(notLoginMessageWebElement));
        return notLoginMessageWebElement.getText();
    }
}
