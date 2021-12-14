package org.data;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	
	
	
//@Parameters({"username","passwor"})
@Test
public void tc1() throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/blog/interview-questions/selenium-interview-questions-answers/");
		WebDriverWait w=new WebDriverWait(driver,60);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='title'])[2]")));
		WebElement findElement = driver.findElement(By.xpath("(//button[@class='close'])[3]"));
		findElement.click();
		

		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='blog-title-details']"));

		File screenshotAs = findElement2.getScreenshotAs(OutputType.FILE);
		File s=new File("C:\\Users\\Deepan\\Pictures\\New folder//s.png");
		FileUtils.copyFile(screenshotAs, s);
		
}

	
	
}
