package com.qa.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	
	public WebDriver driver;

	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is: "+ browser);
		
		
		if(browser.equalsIgnoreCase("chrome")) {
	/////HeadlessMode Chrome/////////////////
			
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless");
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability(ChromeOptions.CAPABILITY, options);
//			options.merge(cap);
//			tlDriver.set(new ChromeDriver(options));
			
			
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("firefox")) {
//			FirefoxOptions options = new FirefoxOptions();
//			options.addArguments("--headless");
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
//			options.merge(cap);
//			tlDriver.set(new FirefoxDriver(options));
			
			tlDriver.set(new FirefoxDriver());
		}
		else if(browser.equalsIgnoreCase("Edge")) {
//			EdgeOptions options = new EdgeOptions();
//			options.addArguments("--headless");
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability(EdgeOptions.CAPABILITY, options);
//			options.merge(cap);
//			tlDriver.set(new EdgeDriver(options));
			
			
			tlDriver.set(new EdgeDriver());
		}
		else {
			System.out.println("Please pass the Correct Value of the Browser : "+ browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
