package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class CreateNewContact {
	
	WebDriver driver;
	
	@Then("user move to contact page")
	public void user_move_to_contact_page() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("Contact_Tab")).click();
	   
	}

	@Then("user create new contact")
	public void user_create_new_contact() {
		driver.findElement(By.xpath("//input[@name ='new']")).click();
		WebElement lastname = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		lastname.sendKeys("Peter");
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("BMW");
		driver.findElement(By.xpath("//input[@name ='save']")).click();
	   
	}


}
