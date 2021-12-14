package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.name.name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class provider {
	
	@DataProvider(name="Excledata")
	public Object[][] getData() throws IOException {
	File file=new File("F:\\eclipse\\Taskes\\excel\\dataprovider.xlsx");
	FileInputStream f = new FileInputStream(file);
	Workbook work=new XSSFWorkbook(f);
	Sheet sheet = work.getSheet("Sheet1");
	Row row = sheet.getRow(0);
	int rowno = sheet.getPhysicalNumberOfRows();
 int lastCellNum = row.getLastCellNum();
	Object data [][]=new Object[rowno-1][lastCellNum];
	
		for (int i = 0; i < rowno-1; i++) {
			Row row2 = sheet.getRow(i+1);
			for (int j = 0; j < lastCellNum; j++) {
				Cell cell = row2.getCell(j);
				DataFormatter dataFormatter=new DataFormatter();
				String formatCellValue = dataFormatter.formatCellValue(cell);
				data[i][j]=formatCellValue;
			}}
		return  data;
		
}
	private void entertext() {

	}

}
