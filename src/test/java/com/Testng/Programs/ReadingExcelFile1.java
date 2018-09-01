package com.Testng.Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelFile1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		File f = new File(
				"C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\java\\com\\Testng\\Programs\\POIBlankWorkbookWriteData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet0 = wb.getSheetAt(0);

		/*
		 * Row row0 = sheet0.getRow(0); Cell cellA = row0.getCell(0);
		 * 
		 * System.out.println(cellA);
		 */

		for (Row row : sheet0) {
			for (Cell cell : row) {

				switch (cell.getCellType()) {

				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue() + " \t \t");
					break;

				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t \t");
					break;

				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank Cell" + " \t \t");
					break;

				}
			}

			System.out.println();
		}

	}

}
