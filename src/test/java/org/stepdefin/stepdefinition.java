package org.stepdefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition {
	WebDriver driver;

	@Given("i am going launch facebook application on chrome browser")
	public void i_am_going_launch_facebook_application_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@When("i am entering in correct user name and incorrect password")
	public void i_am_entering_in_correct_user_name_and_incorrect_password() {
		driver.findElement(By.id("email")).sendKeys("ertyui");
		driver.findElement(By.id("pass")).sendKeys("ertghjk");
	}
	@When("i am clicking login button")
	public void i_am_clicking_login_button() {
		driver.findElement(By.id("login")).click();

	}

	@Then("i going to verfiy the error message")
	public void i_going_to_verfiy_the_error_message() {

		System.out.println("invalid");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("valid");

	}

}
