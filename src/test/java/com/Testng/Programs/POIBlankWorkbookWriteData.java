package com.Testng.Programs;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIBlankWorkbookWriteData {

	public static void main(String[] args) throws Exception {

		// Create Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet(" Employee Details ");

		// Create row object
		XSSFRow row;

		// This data needs to be written (Object[])
		Map<String, Object[]> empinfo = new TreeMap<String, Object[]>();
		empinfo.put("1", new Object[] { "EMP ID", "EMP NAME", "DESIGNATION" });
		empinfo.put("2", new Object[] { "tp01", "Gopal", "Technical Manager" });
		empinfo.put("3", new Object[] { "tp02", "Manisha", "Proof Reader" });
		empinfo.put("4", new Object[] { "tp03", "Masthan", "Technical Writer" });
		empinfo.put("5", new Object[] { "tp04", "Satish", "Technical Writer" });
		empinfo.put("6", new Object[] { "tp05", "Krishna", "Technical Writer" });
		empinfo.put("7", new Object[] { "tp06", "Rambabu", "Technical Writer" });

		// Iterate over data and write to sheet
		Set<String> keyid = empinfo.keySet();
		int rowid = 0;

		for (String key : keyid) {
			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = empinfo.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}

		// Create file system using specific name
		FileOutputStream fos = new FileOutputStream(new File(
				"C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\java\\com\\Testng\\Programs\\POIBlankWorkbookWriteData.xlsx"));

		// write operation workbook using file out object
		workbook.write(fos);
		fos.close();
		System.out.println("POIBlankWorkbookWriteData.xlsx written successfully");

	}

}
