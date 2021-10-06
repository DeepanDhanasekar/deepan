package org.deepan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Global {
	public static WebDriver driver;
	public static WebElement element;

	public static void url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void gettitle() {
		driver.getTitle();
	}
	
	public static WebElement locators (String locater, String value) {
		if (locater.equals("id")) {
			element = driver.findElement(By.id(value));
		return element;}
		else if (locater.equals("name")) {
			element = driver.findElement(By.name(value));
		return element;
		}
		else if (locater.equals("xpath")) {
			element = driver.findElement(By.xpath(value));
		return element;
		}

		else if (locater.equals("tagname")) {
			element = driver.findElement(By.tagName(value));
		return element;
		}
		return element;
	}
	public static String getcellvaue(String pathname, String sheetname, int rownum, int cellnum, String dateformat)
			throws FileNotFoundException {

		File f = new File(pathname);
		FileInputStream d = new FileInputStream(f);
		Workbook work = new XSSFWorkbook();
		Sheet sheet = work.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int type = cell.getCellType();
		if (type == 1) {
			String text = cell.getStringCellValue();
			return text;
		}

		if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat(dateformat);
			String text = dateFormat.format(date);
			return text;
		} else {
			double value = cell.getNumericCellValue();
			long l = (long) value;
			String text = String.valueOf(l);
			return text;
		}}
	public static void entertext(WebElement element , String value) {
element.sendKeys(value);
	}
}
