package test.java.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.java.customfunction.SearchResultPage;
import test.java.stepdefinations.support.Hooks;


public class HealthCare {

	public WebDriver driver = Hooks.driver;

	@Given("Open Test application on the browser")
	public void open_Test_application_on_the_browser() throws InterruptedException {
		System.out.println("Test 1");
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String appTitle = driver.getTitle();
		System.out.println("Application Title is: " + appTitle);
	}

	@When("User click in make appointment")
	public void user_click_in_make_appointment() {
		System.out.println("Test 2");
		driver.findElement(By.id("btn-make-appointment")).click();

	}

	@When("User enter the username")
	public void user_enter_the_username() {
		System.out.println("Test 3");
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
	}

	@When("User Enter the password")
	public void user_Enter_the_password() {
		System.out.println("Test 4");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
	}

	@When("user enter Username as {string} and Password as {string}")
	public void user_enter_Username_as_and_Password_as(String username, String password) {
		driver.findElement(By.id("txt-username")).sendKeys(username);
		driver.findElement(By.id("txt-password")).sendKeys(password);
	}

	@When("User click on login")
	public void user_click_on_login() {
		System.out.println("Test 5");
		driver.findElement(By.id("btn-login")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Verify user should be login successfully")
	public void verify_user_should_be_login_successfully() {
		System.out.println("Test 6");
		String verifyLogin = driver.findElement(By.xpath(".//h2[text()='Make Appointment']")).getText();
		System.out.println("verify Login text is: " + verifyLogin);
	}

}