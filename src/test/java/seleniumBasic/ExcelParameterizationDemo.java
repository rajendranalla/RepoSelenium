package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelReader.ExcelReader;

public class ExcelParameterizationDemo {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void shutDown() {
		driver.quit();
	}

	@Test(dataProvider = "getData")
	public void parameterExcel(String username, String password) throws InterruptedException {

		try {
			driver.get("http://www.gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div/input[@id='identifierId']")).sendKeys(username);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@DataProvider
	public Object[][] getData() {

		String sheetName = "seleniumDemo1";
		ExcelReader excel = new ExcelReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");

		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);

		System.out.println("Total rows are : " + rowNum + "  total cols are : " + colNum);
		System.out.println(excel.getCellData(sheetName, 0, 2));

		Object[][] data = new Object[rowNum - 1][colNum];

		for (int rows = 2; rows <= rowNum; rows++) {
			for (int cols = 0; cols < colNum; cols++) {
				data[rows - 2][cols] = excel.getCellData(sheetName, cols, rows);
			}
		}

		return data;

	}
}
