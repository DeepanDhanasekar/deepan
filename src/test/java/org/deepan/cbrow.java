package org.deepan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cbrow {
	@Test
	private void test() {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
	}
	@Test
	private void test2() {
System.setProperty("webdriver.gecko.driver","F:\\eclipse\\Taskes\\driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");

	}
@Test
private void test3() {
System.setProperty("webdriver.ie.driver", "F:\\eclipse\\Taskes\\driver\\IEDriverServer.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("https://www.facebook.com/");
}
	
}