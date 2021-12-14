package org.assert1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement java = driver.findElement(By.name("q"));
		java.sendKeys("java",Keys.ENTER);
	    WebElement linked = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[2]"));
		linked.click();
		
		
}
}