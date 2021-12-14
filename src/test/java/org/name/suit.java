package org.name;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class suit {
	WebDriver driver;
	@BeforeClass
	private void bero() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@BeforeMethod
	private void beformethod() {
		Date d=new Date();
		System.out.println(d);
	}

@Parameters("username")
@Test
private void test3(String s) {
WebElement text = driver.findElement(By.id("email"));	
text.sendKeys(s);

}
@Parameters("userpass")
@Test
private void test2(String s2) {
WebElement test4 = driver.findElement(By.id("pass"));
	test4.sendKeys(s2);
	
}

@AfterMethod

private void afeter() {
	Date d=new Date();
	System.out.println(d);

}@AfterClass
private void arterclass() {

}

}
