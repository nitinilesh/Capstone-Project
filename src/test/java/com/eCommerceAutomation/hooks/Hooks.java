package com.eCommerceAutomation.hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.eCommerceAutomation.runner.Runner;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void setup () throws InterruptedException{
		String browser = Runner.browser;
		String url = Runner.url;

		switch(browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException("Invalid browser name: "+browser);
		}
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(browser+" launch with url : "+url);
	}
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		if(scenario.isFailed()) {
			captureScreenshot(scenario);
		}
		if(driver != null) {
			driver.quit();
			System.out.println("closing browser..");
			Thread.sleep(5000);
		}
	}
	public static WebDriver getWebDriver() {
		return driver;
	}
	private void captureScreenshot(Scenario scenario) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile= ts.getScreenshotAs(OutputType.FILE);
			String screenshotName = "screenshot_"+scenario.getName().replace(" ","_")+".png";
			File destFile = new File("./screenshot"+screenshotName);
			FileUtils.copyFile(srcFile,destFile);
            System.out.println("Screenshot captured for failed scenario: " + scenario.getName());
            
            byte[] screenshotBytes = FileUtils.readFileToByteArray(destFile);
            scenario.attach(screenshotBytes, "image.png", screenshotName);
		}
		catch(IOException e) {
			System.out.println("Error capuring screenshot:"+e.getMessage());
		}
	}
	@AfterStep
	public void runOneByOne() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	
}
