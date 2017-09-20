package seleniumBasic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xPath {

	WebDriver driver;
	JavascriptExecutor jse;

	public void Invoke(String url) {

		try {
			System.setProperty("webdriver.gecko.driver", "C:/Users/rajendra/workspace/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void xPathIdentification() throws Exception {
		Invoke("http://www.amazon.in");
		Thread.sleep(5000);

		// Identifying with Relative xpaths (example:
		// //select[@id='searchDropdownBox']/option[@value='search-alias=watches)

		// driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']/div[@class='nav-search-facade']/i")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']//select[@id='searchDropdownBox']/option[@value='search-alias=watches']")).click();
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();

	}

	public void xPathIdentificationUsingCalendar() {

	}

	public static void main(String[] args) throws Exception {

		xPath xpathLocator = new xPath();
		xpathLocator.xPathIdentification();

	}

}
