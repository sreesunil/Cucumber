package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

	WebDriver driver;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {

		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
	}

	@When("User enter valid Username and Password")
	public void user_enter_valid_username_and_password() {

		driver.findElement(By.name("username")).sendKeys("sreeedamana@qa.com");
		driver.findElement(By.name("pw")).sendKeys("asksree530");
	}

	@When("user click on Login")
	public void user_click_on_login() throws InterruptedException {

		driver.findElement(By.id("Login")).click();

		
	}

	@Then("User on Home page")
	public void user_on_home_page() {

		String Actual = driver.findElement(By.id("home_Tab")).getText();
		Assert.assertEquals("Home", Actual);
	}

	@When("User enter wrong username and password")
	public void user_enter_wrong_username_and_password() {

		driver.findElement(By.name("username")).sendKeys("123@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("123");

	}

	@Then("user get error message")
	public void user_get_error_message() {

		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actual = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(expected, actual);

	}
	
	@When("User enter username")
	public void user_enter_username() {
		
		driver.findElement(By.name("username")).sendKeys("sreeedamana@qa.com");
	    
	}
	
	@When("user click on forgot password")
	public void user_click_on_forgot_password() {
		
		driver.findElement(By.linkText("Forgot Your Password?")).click();
	   
	}


	@Then("user provide gmail id")
	public void user_provide_gmail_id() {
		driver.findElement(By.id("un")).sendKeys("ammuedamana@gmail.com");
	}

	@Then("click on continue")
	public void click_on_continue() {
		driver.findElement(By.id("continue")).click();
		
	}

	@Then("user should get password setting message")
	public void user_should_get_password_setting_message() {
		
		String Expected = "We’ve sent you an email with a link to finish resetting your password.";
		String Actual = driver.findElement(By.xpath("//*[@id=\"forgotPassForm\"]/div/p[1]")).getText();
		Assert.assertEquals(Expected, Actual);
	  
	}




}
