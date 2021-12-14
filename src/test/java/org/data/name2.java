package org.data;

import org.name.name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.sym.Name;

import io.github.bonigarcia.wdm.WebDriverManager;

public class name2 {
	@Test(dataProvider="t",dataProviderClass=name.class)
	private void test(String s2,String s3 ) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

WebElement findElement = driver.findElement(By.id("email"));
findElement.sendKeys(s2);
		
WebElement textpass = driver.findElement(By.id("pass"));
textpass.sendKeys(s3);
	}
}
