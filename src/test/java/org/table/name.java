package org.table;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class name {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/BookedItinerary.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Suriya1711");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Suriya151");
		WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
		System.out.println(forgot.isDisplayed());
		System.out.println(forgot.isEnabled());
		System.out.println(forgot.isSelected());
		if (forgot.isDisplayed()&&forgot.isEnabled()) {
			driver.findElement(By.name("login")).click();
		}
		/*driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Booked Itinerary")).click();
		WebElement table = driver.findElement(By.xpath("//table[@cellpadding='5']"));
		WebElement tbody = table.findElement(By.xpath("//table[@cellpadding='5']/tbody"));
		List<WebElement> trow = tbody.findElements(By.xpath("//table[@cellpadding='5']/tbody/tr[@align='center']"));
	for (int i = 0; i < trow.size(); i++) {
		WebElement trow2 = trow.get(i);
		String text = trow2.getText();
		System.out.println(text);	
		
		}*/
	/*List<WebElement> firtcolum = tbody.findElements(By.xpath("//table[@cellpadding='5']/tbody/tr"));
	for (int j = 0; j < firtcolum.size(); j++) {
		WebElement text1 = firtcolum.get(j);
		List<WebElement> tdata = text1.findElements(By.xpath("//tr[@align='center']/following-sibling::tr/td/input[@type='checkbox']"));
		for (int k = 0; k < tdata.size(); k++) {
			String attribute = tdata.get(k).getAttribute("value");
			System.out.println(attribute);
		}
			}}*/
	}
	
	}
