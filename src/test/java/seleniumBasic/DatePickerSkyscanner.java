package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatePickerSkyscanner {

	public WebDriver driver;
	public JavascriptExecutor jse;
	public String calDate;

	@Test
	public void SkyscannerDateSelection() throws Exception {

		System.setProperty("webdriver.ie.driver", "C:/Users/rajendra/workspace/IEDriverServer.exe");

//		// Create object of HashMap Class
//		Map<String, Object> prefs = new HashMap<String, Object>();
//
//		// Set the notification setting it will override the default setting
//		prefs.put("profile.default_content_setting_values.notifications", 2);
//
//		// Create object of ChromeOption class
//		ChromeOptions options = new ChromeOptions();
//
//		// Set the experimental option
//		options.setExperimentalOption("prefs", prefs);
//
//		// pass the options object in Chrome driver
//		driver = new ChromeDriver(options);
		driver = new InternetExplorerDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Waits for 10 secs
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("https://www.skyscanner.co.in/");
		Thread.sleep(10000);

		driver.findElement(By.cssSelector("#js-origin-input")).sendKeys("hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#js-destination-input")).sendKeys("delhi");
		Thread.sleep(2000);

		/*
		 * ***********************************Selecting
		 * departure****************************************************
		 */
		driver.findElement(By.cssSelector("#js-depart-input")).click();
		Thread.sleep(5000);

		String ExpectedMonthToDepart = "March 2018";

		String CurrentMonthToDepart = driver.findElement(By.cssSelector("div.depart span.current")).getText();

		if (ExpectedMonthToDepart.equals(CurrentMonthToDepart)) {
			System.out.println("Month is already selected");
		} else {

			for (int i = 1; i < 12; i++) {
				driver.findElement(By.cssSelector("div.depart button.next")).click();
				Thread.sleep(2000);

				CurrentMonthToDepart = driver.findElement(By.cssSelector("div.depart span.current")).getText();
				if (ExpectedMonthToDepart.equals(CurrentMonthToDepart)) {
					System.out.println("Month selected for depature " + ExpectedMonthToDepart);
					break;
				}
			}
		}

		Thread.sleep(3000);

		WebElement datepicker = driver.findElement(By.cssSelector("div.depart div.datepicker-inner div table tbody"));

		List<WebElement> dates = datepicker.findElements(By.tagName("td"));

		String ExpectedDateToDepart = "2018-03-08";

		for (WebElement date : dates) {

			String calDate = date.getAttribute("data-id");
			if (calDate.equals(ExpectedDateToDepart)) {
				date.click();
				System.out.println("Date selected for departure " + ExpectedDateToDepart);
				break;
			}
		}
		Thread.sleep(5000);

		/*
		 * ***********************************Selecting
		 * Return****************************************************
		 */
		driver.findElement(By.cssSelector("#js-return-input")).click();
		Thread.sleep(3000);

		String ExpectedMonthToReturn = "May 2018";

		String CurrentMonthToReturn = driver.findElement(By.cssSelector("div.return span.current")).getText();

		if (ExpectedMonthToReturn.equals(CurrentMonthToReturn)) {
			System.out.println("Month is already selected");
		} else {

			for (int i = 1; i < 12; i++) {
				driver.findElement(By.cssSelector("div.return button.next")).click();
				Thread.sleep(2000);

				CurrentMonthToReturn = driver.findElement(By.cssSelector("div.return span.current")).getText();
				if (ExpectedMonthToReturn.equals(CurrentMonthToReturn)) {
					System.out.println("Month selected for return " + ExpectedMonthToReturn);
					break;
				}
			}
		}

		Thread.sleep(3000);

		datepicker = driver.findElement(By.cssSelector("div.return div.datepicker-inner div table tbody"));

		dates = datepicker.findElements(By.tagName("td"));

		String ExpectedDateToReturn = "2018-05-18";

		for (WebElement date : dates) {

			String calDate = date.getAttribute("data-id");
			if (calDate.equals(ExpectedDateToReturn)) {
				date.click();
				Thread.sleep(3000);
				System.out.println("Date selected for return " + ExpectedDateToReturn);
				break;
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".fss-bpk-button.fss-bpk-button--large.js-search-button")).click();
		Thread.sleep(5000);

		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#price-alert-button2")));

		boolean status = element.isDisplayed();

		if (status) {
			System.out.println("Get Price Alerts is present");
		} else {
			System.out.println("Get Price Alerts NOT present");
		}

		Thread.sleep(5000);
		driver.quit();
	}

}