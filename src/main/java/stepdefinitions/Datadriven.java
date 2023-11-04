package stepdefinitions;

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
	public void user_enter_and(String string, String string2) {
	    
	}




	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("Login")).click();

	}

	@When("user enter {int}@gmail.com and hellojava")
	public void user_enter_gmail_com_and_hellojava(Integer int1) {
	   
	}
	
	@Then("user gets error message")
	public void user_gets_error_message() {
	   
	}




}
