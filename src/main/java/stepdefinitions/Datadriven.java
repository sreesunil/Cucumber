package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datadriven {
	
	WebDriver driver;
	
	
	@Given("user on login page")
	public void user_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pw")).sendKeys(password);
	    
	}




	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("Login")).click();

	}

	@Then("user gets error message")
	public void user_gets_error_message() {

		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actual = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(expected, actual);

	}



}
