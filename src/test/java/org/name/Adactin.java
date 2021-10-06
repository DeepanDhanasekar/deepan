package org.name;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.deepan.Global;
import org.openqa.selenium.WebElement;

public class Adactin extends Global{

public static void main(String[] args) throws IOException  {
	
	url("https://adactinhotelapp.com/");
	WebElement locators = locators("id", "username");
	String getcellvaue = getcellvaue("C:\\Users\\Deepan\\Desktop\\mass.xlsx", "sheet1", 1, 0, null);
	entertext(locators,getcellvaue );	
	
	
}	


	
		
		
		
		
		
		
		
		
		
//		WebElement username = Locators("id"," username");
//String uservalue = getDataFromExcel("F:\\eclipse\\Taskes\\excel\\mass.xlsx",1,0,null);
//enterTetx(username,uservalue);
//WebElement password = locaters("id", "password");
//String passwordvalue = getDataFromExcel("F:\\\\eclipse\\\\Taskes\\\\excel\\\\mass.xlsx",1 , 1, null);
//	enterTetx(passwordvalue, passwordvalue);
	

	
	
	
	

		
	}


	

	


