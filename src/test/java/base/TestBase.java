package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import excelReader.ExcelReader;
import utilities.DbManager;

public class TestBase {

	/*
	 * Webdriver logs properties mail jdbc Excel TestNG Reporting waits - Implicit
	 * and explicit
	 */

	public static WebDriver driver;

	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static Properties OR = new Properties();
	public static Properties config = new Properties();
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public WebElement dropdown;

	// Clicking an object
	public void click(String locator) {

		if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
		} else if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(OR.getProperty(locator))).click();
		} else if (locator.endsWith("_classname")) {
			driver.findElement(By.className(OR.getProperty(locator))).click();
		} else if (locator.endsWith("_linkText")) {
			driver.findElement(By.linkText(OR.getProperty(locator))).click();
		}

		log.debug("Click on an element " + locator);
	}

	// Type something
	public void type(String locator, String value) {

		if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_classname")) {
			driver.findElement(By.className(OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_linkText")) {
			driver.findElement(By.linkText(OR.getProperty(locator))).sendKeys(value);
		}

		log.debug("Typing in an element " + locator + " & the value entered is " + value);

	}

	// Select from drop down
	public void select(String locator, String value) {

		if (locator.endsWith("_xpath")) {
			dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
		} else if (locator.endsWith("_css")) {
			dropdown = driver.findElement(By.cssSelector(OR.getProperty(locator)));
		} else if (locator.endsWith("_id")) {
			dropdown = driver.findElement(By.id(OR.getProperty(locator)));
		} else if (locator.endsWith("_classname")) {
			dropdown = driver.findElement(By.className(OR.getProperty(locator)));
		} else if (locator.endsWith("_linkText")) {
			dropdown = driver.findElement(By.linkText(OR.getProperty(locator)));
		}

		Select select = new Select(dropdown);
		select.selectByVisibleText(value);
	}

	public boolean isElementPresent(String locator) {
		try {
			if (locator.endsWith("_xpath")) {
				driver.findElement(By.xpath(OR.getProperty(locator)));
			} else if (locator.endsWith("_css")) {
				driver.findElement(By.cssSelector(OR.getProperty(locator)));
			} else if (locator.endsWith("_id")) {
				driver.findElement(By.id(OR.getProperty(locator)));
			} else if (locator.endsWith("_classname")) {
				driver.findElement(By.className(OR.getProperty(locator)));
			} else if (locator.endsWith("_linkText")) {
				driver.findElement(By.linkText(OR.getProperty(locator)));
			}
		} catch (Exception e) {

			log.debug("Element not found " + locator);
			return false;
		}

		log.debug("Element found " + locator);
		return true;

	}

	public boolean isElementEnabled(String locator) {
		try {
			if (locator.endsWith("_xpath")) {
				driver.findElement(By.xpath(OR.getProperty(locator))).isEnabled();
			} else if (locator.endsWith("_css")) {
				driver.findElement(By.cssSelector(OR.getProperty(locator))).isEnabled();
			} else if (locator.endsWith("_id")) {
				driver.findElement(By.id(OR.getProperty(locator))).isEnabled();
			} else if (locator.endsWith("_classname")) {
				driver.findElement(By.className(OR.getProperty(locator))).isEnabled();
			} else if (locator.endsWith("_linkText")) {
				driver.findElement(By.linkText(OR.getProperty(locator))).isEnabled();
			}
		} catch (Exception e) {

			log.debug("Element not Enabled " + locator);
			return false;
		}

		log.debug("Element Enabled " + locator);
		return true;

	}

	@BeforeSuite
	public void setUp() {

		if (driver == null) {

			// Config.properties
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {

				System.out.println("Config.properties file is not found: " + e);
			}
			try {
				config.load(fis);
				log.debug("Config properties loaded");
			} catch (IOException e) {

				e.printStackTrace();
			}

			// Object Repository
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {

				System.out.println("OR.properties file is not found: " + e);
			}
			try {
				OR.load(fis);
				log.debug("OR properties loaded");
			} catch (IOException e) {

				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
				log.debug("Launching Firefox");

			} else if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("Launching Chrome");

			} else if (config.getProperty("browser").equals("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				log.debug("Launching Internet Explorer");
			}

			// Open the Website
			driver.get(config.getProperty("testsiteurl"));
			log.debug("Navigating to: " + config.getProperty("testsiteurl"));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			// Implicit Wait
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitly.wait")),
					TimeUnit.SECONDS);

			// Explicit Wait
			wait = new WebDriverWait(driver, Integer.parseInt(config.getProperty("explicitly.wait")));

			// Database Connection
			try {
				DbManager.setMysqlDbConnection();
				log.debug("DB connection established");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		log.debug("Test execution completed !!");

	}

}
