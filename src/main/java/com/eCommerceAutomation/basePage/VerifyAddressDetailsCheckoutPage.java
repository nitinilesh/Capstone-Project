package com.eCommerceAutomation.basePage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eCommerceAutomation.base.BasePage;

public class VerifyAddressDetailsCheckoutPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;
	public VerifyAddressDetailsCheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[position()<=3]")
	List<WebElement> deliveryAddress1WebElement;
	@FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[position()>3]")
	List<WebElement> billingAddress1WebElement;
	@FindBy(xpath = "(//li[@class=\"address_firstname address_lastname\"])[1]")
	WebElement deliveyNameWebElement;
	@FindBy(xpath = "(//li[@class=\"address_firstname address_lastname\"])[2]")
	WebElement billingNameWebElement;
	
	@FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
	WebElement deliveryCityStatePinWebElement;
	@FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[2]")
	WebElement billingCityStatePinWebElement;
	
	@FindBy(xpath = "(//li[@class='address_country_name'])[1]")
	WebElement deliveyCountryWebElement;
	@FindBy(xpath = "(//li[@class='address_country_name'])[2]")
	WebElement billingCountryWebElement;
	
	
	@FindBy(xpath = "(//li[@class='address_phone'])[2]")
	WebElement billingMobileWebElement;
	@FindBy(xpath = "(//li[@class='address_phone'])[1]")
	WebElement deliveyMobileWebElement;
	
	public boolean deliveryAndBillingAddress() {
		for(int i=0;i<deliveryAddress1WebElement.size();i++) {
			if(!deliveryAddress1WebElement.get(i).getText().equalsIgnoreCase(billingAddress1WebElement.get(i).getText())) return false;
		}
		if(!deliveyNameWebElement.getText().equalsIgnoreCase(billingNameWebElement.getText())) return false;
		if(!deliveryCityStatePinWebElement.getText().equalsIgnoreCase(billingCityStatePinWebElement.getText())) return false;
		if(!deliveyCountryWebElement.getText().equalsIgnoreCase(billingCountryWebElement.getText())) return false;
		if(!billingMobileWebElement.getText().equalsIgnoreCase(deliveyMobileWebElement.getText())) return false;
		else return true;
	}

}
