package seleniumBasic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class myFirstSelenium {

	WebDriver driver;
	JavascriptExecutor jse;

	public void gmailInvoke() {
		try {
			// final String sUrl = "http://www.google.co.in/";
			System.setProperty("webdriver.gecko.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.get("http://www.amazon.in/");
			

			// Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
//			dropdown.selectByValue("search-alias=watches");
			// driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();

			searchPage();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchPage() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,1000)");
		driver.findElement(By.linkText("Become an Author")).click();

	}

	public static void main(String[] args) throws Exception {

		myFirstSelenium credential = new myFirstSelenium();
		credential.gmailInvoke();

	}
}
