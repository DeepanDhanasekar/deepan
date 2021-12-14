package org.data;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class Baseclass   {
@Test(dataProvider="Excledata",dataProviderClass=provider.class)
private void test(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10
			,String s11,String s12,String s13,String s14,String s15,String s16,
			String s17) {
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
WebElement textusername = driver.findElement(By.id("username"));
	textusername.sendKeys(s);
	WebElement textpassword = driver.findElement(By.id("password"));
	textpassword.sendKeys(s1);	
	WebElement textlogin = driver.findElement(By.id("login"));
	textlogin.click();
	
	WebElement text = driver.findElement(By.id("location"));
	Select select=new Select(text);
	int parseInt = Integer.parseInt(s2);
	select.selectByIndex(parseInt);
	
	WebElement text1 = driver.findElement(By.id("hotels"));
	Select select2=new Select(text1);
	int parseInt2 = Integer.parseInt(s3);
	select2.selectByIndex(parseInt2);
	
	WebElement text3 = driver.findElement(By.id("room_type"));
	Select select3=new Select(text3);
	int parseInt3 = Integer.parseInt(s4);
	select3.selectByIndex(parseInt3);
	
	WebElement text4 = driver.findElement(By.id("room_nos"));
	Select select4=new Select(text4);
	int parseInt4 = Integer.parseInt(s5);
	select4.selectByIndex(parseInt4);
	
   WebElement textclear = driver.findElement(By.id("datepick_in"));
	textclear.clear();
	
	
	WebElement text5 = driver.findElement(By.id("datepick_in"));
	
	text5.sendKeys(s6);

	WebElement textclear2 = driver.findElement(By.id("datepick_out"));
	textclear2.clear();
	
	WebElement text6 = driver.findElement(By.id("datepick_out"));
	text6.sendKeys(s7);
	
	WebElement text7 = driver.findElement(By.id("adult_room"));
	Select select7=new Select(text7);
	int parseInt7 = Integer.parseInt(s8);
	select7.selectByIndex(parseInt7);
	
	WebElement text8 = driver.findElement(By.id("child_room"));
	Select select8=new Select(text8);
	int parseInt8 = Integer.parseInt(s9);
	select8.selectByIndex(parseInt8);
	
WebElement text9 = driver.findElement(By.id("Submit"));	
	text9.click();
	
	WebElement text0 = driver.findElement(By.id("radiobutton_0"));
	text0.click();
	
	WebElement text02 = driver.findElement(By.id("continue"));
	text02.click();
	
	WebElement text03 = driver.findElement(By.name("first_name"));
	text03.sendKeys(s10);
	
	WebElement text04 = driver.findElement(By.name("last_name"));
	text04.sendKeys(s11);
	
	WebElement text05 = driver.findElement(By.name("address"));
	text05.sendKeys(s12);
	
	WebElement text06 = driver.findElement(By.id("cc_num"));
	text06.sendKeys(s13);
	
	WebElement text07 = driver.findElement(By.id("cc_type"));
	Select select5=new Select(text07);
	int parseInt5 = Integer.parseInt(s14);
	select5.selectByIndex(parseInt5);
	
	WebElement text08 = driver.findElement(By.id("cc_exp_month"));
	Select select6=new Select(text08);
	int parseInt6 = Integer.parseInt(s15);
	select6.selectByIndex(parseInt6);
	
	WebElement text09 = driver.findElement(By.id("cc_exp_year"));
	Select select9=new Select(text09);
	int parseInt9 = Integer.parseInt(s16);
	select9.selectByIndex(parseInt9);
	
	WebElement text22 = driver.findElement(By.id("cc_cvv"));
	text22.sendKeys(s17);
	}
	
	}
	
	
	


