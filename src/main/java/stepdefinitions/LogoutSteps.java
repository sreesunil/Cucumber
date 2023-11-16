package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;

public class LogoutSteps {
	
	
	  WebDriver driver;
	  
	  
	  
	  @Then("user select profile name") public void user_select_profile_name()
	  throws InterruptedException { Thread.sleep(3000);
	  
	  driver.findElement(By.id("userNavLabel")).click();
	  
	  }
	  
	  @Then("User click on Logout") public void user_click_on_logout() {
	  
	  driver.findElement(By.linkText("Logout")).click();
	  
	  }
	 
}
