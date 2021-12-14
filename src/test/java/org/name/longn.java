package org.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class longn {
	
@Test
private void name(String email) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
 driver.findElement(By.id(email));
 
}
}
