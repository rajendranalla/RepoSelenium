package seleniumBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScrollDropDownList {

	public WebDriver driver;
	public JavascriptExecutor jse;

	@Test
	public void yatraDateSelection() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/rajendra/workspace/chromedriver.exe");

		// Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();

		// Set the experimental option
		options.setExperimentalOption("prefs", prefs);

		// pass the options object in Chrome driver
		driver = new ChromeDriver(options);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		
		

		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.findElement(By.xpath("html/body/section/div[1]/div/div[3]/div[2]/div[1]/div[2]/select")).sendKeys("30");
		Thread.sleep(5000);
	
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		efwd.executeScript("document.querySelector('.ui-grid-viewport.ng-isolate-scope').scrollTop=100");
		Thread.sleep(5000);

        driver.quit();
	}

}