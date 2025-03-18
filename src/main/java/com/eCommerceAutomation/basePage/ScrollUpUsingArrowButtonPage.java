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

public class ScrollUpUsingArrowButtonPage extends BasePage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    public ScrollUpUsingArrowButtonPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    WebElement arrowButtonWebElement;

    @FindBy(xpath = "//a[text()=' Home']")
    WebElement topOfPageWebElement;

    public void scrollUsingArrowButton() {
        wait.until(ExpectedConditions.elementToBeClickable(arrowButtonWebElement));
        js.executeScript("arguments[0].click();", arrowButtonWebElement);
    }

    public boolean topOfPage() {
        wait.until(ExpectedConditions.visibilityOfAllElements(topOfPageWebElement)); 
        return displaying(topOfPageWebElement);
    }
}
