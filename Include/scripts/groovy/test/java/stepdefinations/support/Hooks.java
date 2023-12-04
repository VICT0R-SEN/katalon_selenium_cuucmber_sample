package test.java.stepdefinations.support;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.kms.katalon.core.webui.driver.DriverFactory;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;

import cucumber.api.java.After;
import cucumber.api.java.Before;




public class Hooks {

	public static WebDriver driver;
	String browser = "chrome";

	@Before
	public void beforScenarios() throws InterruptedException {
		System.out.println("Before Test");

		WebUiBuiltInKeywords.openBrowser("");
		WebUiBuiltInKeywords.maximizeWindow();
		driver = DriverFactory.getWebDriver();
		/*
		switch (browser) {
		case "chrome": {
			System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//WebDriver//chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("In before Case");
			break;
		}
		
		case "firefox": {
			System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//WebDriver//geckodriver.exe");
			driver = new ChromeDriver();
			System.out.println("In before Case");
			break;
		}

		}
		*/
		
	}

	@After
	public void afterScenarios() {
		System.out.println("After Test");
		WebUiBuiltInKeywords.closeBrowser();
		//driver.quit();
	}

}