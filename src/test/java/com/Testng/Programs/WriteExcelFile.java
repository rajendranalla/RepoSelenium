package com.Testng.Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("First");
		
		/*Row row0 = sheet0.createRow(0);

		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);

		cellA.setCellValue("Username");
		cellB.setCellValue("Password");
*/
		
		for (int rows =0; rows<10; rows++) {
			
			Row row = sheet0.createRow(rows);
			
			for (int cols=0; cols<10; cols++) {
				
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.incrementExact(1)));
			}
		}
		
		
		// Create the stream

		FileOutputStream fos = new FileOutputStream(new File(
				"C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\java\\com\\Testng\\Programs\\WriteExcelFile.xlsx"));

		workbook.write(fos);
		
		// Closing the stream
		fos.close();
		
		System.out.println("WriteExcelFile.xlsx file created");

	}

}
