package test.java.stepdefinations.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import test.java.stepdefinations.support.Hooks;

public class HomePage {
	
	
	public WebDriver driver = Hooks.driver;
	
	String Home_Page_URL="https://www.google.";
	
	@Given("A user navigates to HomePage {string}")
	public void a_user_navigates_to_home_page(String country) throws InterruptedException {
		driver.manage().window().maximize();
	    driver.get(Home_Page_URL + country);
	    Thread.sleep(2000);
	}

	@Then("Google logo is displayed")
	public void google_logo_is_displayed() throws InterruptedException {
	    driver.findElement(By.xpath(".//img[@class='lnXdpd']")).isDisplayed();
	    Thread.sleep(1000);
	}

	@Then("search bar is displayed")
	public void search_bar_is_displayed() throws InterruptedException {
		driver.findElement(By.cssSelector("div.SDkEP")).isDisplayed();
		Thread.sleep(1000);
}

	@Then("page title is {string}")
	public void page_title_is(String title) throws InterruptedException {
		String displayedTitle = driver.getTitle();
		Assert.assertTrue("Displayed Title is: "+displayedTitle + "instead of "+title, title.equals(displayedTitle));
		Thread.sleep(1000);
	   
	}


}
