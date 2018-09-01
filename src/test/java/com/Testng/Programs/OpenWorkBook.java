package com.Testng.Programs;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OpenWorkBook {

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\java\\com\\Testng\\Programs\\POIBlankWorkbook.xlsx");
		FileInputStream fis = new FileInputStream(file);

		// Get the workbook instance for XLSX file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		if (file.isFile() && file.exists()) {
			System.out.println("openworkbook.xlsx file open successfully.");
		} else {
			System.out.println("Error to open openworkbook.xlsx file.");
		}

	}

}
