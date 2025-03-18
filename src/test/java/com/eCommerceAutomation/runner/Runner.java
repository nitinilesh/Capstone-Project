package com.eCommerceAutomation.runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features/",
		glue = {"com.eCommerceAutomation.stepDefinitions","com.eCommerceAutomation.hooks"},
//		tags = "@searchProductVerifyAfterLogin",
		plugin = {
		          "pretty",
		          "html:target/cucumber-reports.html",
		          "json:target/cucumber.json",
		          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		          "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		  },
		monochrome = true
		)

public class Runner extends AbstractTestNGCucumberTests {
	public static String browser;
	public static String url;
	@BeforeTest
	@Parameters({"browser","url"})
	public void setup(String browserParam,String urlParam) {
		System.out.println(browserParam +" "+urlParam);
		browser = browserParam;
		url = urlParam;
	}
}

