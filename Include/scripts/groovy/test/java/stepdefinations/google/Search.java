package test.java.stepdefinations.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.java.customfunction.SearchResultPage;
import test.java.stepdefinations.support.Hooks;

public class Search {
	
	public WebDriver driver = Hooks.driver;
	
	@When("a user searches for {string}")
	public void a_user_searches_for(String searchText) throws InterruptedException {
		driver.findElement(By.xpath(".//textarea[@name='q']")).sendKeys(searchText);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//textarea[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("{string} is displayed in the first {string} results")
	public void is_displayed_in_the_first_results(String string, String string2) {
		
		SearchResultPage objPage = new SearchResultPage();
		objPage.isInResults(driver, string2, 10);
	    
	}

}
