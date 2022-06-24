package com.amazon.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver=null;
	private static final Logger logger=Logger.getLogger(BaseTest.class);
	

	public WebDriver getWebDriver() {
		logger.info("getWebDriver method started");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		try {
			Thread.sleep(2000);
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("getWebDriver method sends");
		return driver;
		
	}
}
