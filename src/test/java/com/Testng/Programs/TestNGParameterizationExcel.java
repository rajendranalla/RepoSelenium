package com.Testng.Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelReader.ExcelReader;

public class TestNGParameterizationExcel {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")

	public void testFormFill(String username, String password, String age) {

	}

	@DataProvider
	public Object[][] getData() throws Exception {

		if (excel == null) {

			excel = new ExcelReader(
					"C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\java\\com\\Testng\\Programs\\abc.xlsx");
		}

		String sheetName = "LoginTest";
		int row = excel.getRowCount(sheetName);
		int col = excel.getColumnCount(sheetName);

		Object[][] data = new Object[row - 1][col];

		for (int rowNum = 2; rowNum <= row; rowNum++) {

			for (int colNum = 0; colNum < col; colNum++) {

				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}

		return data;

	}
}
