package com.eCommerceAutomation.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.eCommerceAutomation.hooks.Hooks;

public class ScrollUtilites {
	WebDriver driver = Hooks.getWebDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public void scrollToButtom() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public void scrollDownByPixel(String pixel) {
		js.executeScript("window.scrollBy(0, arguments[0])",pixel);
	}
	public void scrollTopOfPage() {
		js.executeScript("window.scrollTo(0,0)");
	}
}
