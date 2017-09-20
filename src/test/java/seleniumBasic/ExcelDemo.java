package seleniumBasic;

import org.testng.annotations.Test;

import excelReader.ExcelReader;

public class ExcelDemo {

	@Test()

	public void excelFirstProgram() {

		ExcelReader er = new ExcelReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\selenium.xlsx");
		String sheetName = "seleniumDemo1";

		System.out.println("Row count is: " + er.getRowCount(sheetName));
		er.removeColumn(sheetName, 2);
		String colName = "SRK";
		er.addColumn(sheetName, colName);

		er.setCellData(sheetName, colName, 2, "Actor");

		er.removeSheet("seleniumDemo2");
		er.addSheet("seleniumDemo2");
	}

}
