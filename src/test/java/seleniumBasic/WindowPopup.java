package seleniumBasic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:/Users/rajendra/workspace/IEDriverServer.exe");

		// ProfilesIni profile = new ProfilesIni();
		// FirefoxProfile firefoxprofile = profile.getProfile("Default User");
		//
		// WebDriver driver = new FirefoxDriver(firefoxprofile);

		WebDriver driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		System.out.println("-----------------First Window--------------");
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(5000);

		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iterate = windowids.iterator();
		String first_window = iterate.next();
		System.out.println(first_window);

		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		Thread.sleep(5000);

		System.out.println("-----------------Second Window--------------");
		windowids = driver.getWindowHandles();
		iterate = windowids.iterator();

		while (iterate.hasNext()) {
			String second_window = iterate.next();
			System.out.println(second_window);

			Thread.sleep(5000);
			try {
				driver.switchTo().window(second_window);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		Thread.sleep(5000);

		WebElement netbanking = driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a"));
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		System.out.println("is enable: " + netbanking.isEnabled());
		System.out.println("is displayed: " + netbanking.isDisplayed());

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(netbanking));

		// netbanking.click();

		action.moveToElement(netbanking);
		Thread.sleep(5000);
		//
		action.contextClick(netbanking).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build()
				.perform();

		System.out.println("-----------------Third Window--------------");
		Thread.sleep(2000);

		windowids = driver.getWindowHandles();
		iterate = windowids.iterator();

		while (iterate.hasNext()) {
			String third_window = iterate.next();
			System.out.println(third_window);

			Thread.sleep(5000);
			try {
				driver.switchTo().window(third_window);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		Thread.sleep(5000);

		driver.switchTo().frame(0);

		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		WebElement customerid = driver.findElement(By.xpath(
				"html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input"));

		System.out.println("is enable: " + customerid.isEnabled());
		System.out.println("is displayed: " + customerid.isDisplayed());

		// WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(customerid));

		action.moveToElement(customerid);
		Thread.sleep(2000);

		customerid.sendKeys("1234567890");
		Thread.sleep(5000);
	}

}
