package org.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class name {
	@DataProvider(name="t")
	private Object[][] getDatafroDataprovider() {
		return new Object[][] {
		
		//	{"name","name2"},{"java","java2"}
			{"iphone"},
			
			
		};
		
	}
	

	@Test(dataProvider="t")
	public void test(String uName) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	    WebElement Username = driver.findElement(By.name("q"));
		Username.sendKeys(uName);
//		
		//WebElement Userpassword = driver.findElement(By.xpath("");
		//Userpassword.click();
		
	   
	
}
		
		
		
		
	
}
