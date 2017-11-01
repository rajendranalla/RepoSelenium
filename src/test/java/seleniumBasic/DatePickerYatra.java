package seleniumBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DatePickerYatra {

	public WebDriver driver;
	public JavascriptExecutor jse;

	@Test
	public void yatraDateSelection() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/chromedriver.exe");

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

		
		
		

		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']")).sendKeys("hyderabad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='BE_flight_arrival_city']")).sendKeys("delhi");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='BE_flight_depart_date']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='PegasusCal-0']/div[3]/div[1]/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='a_2017_11_15']/span[1]")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id='BE_flight_return_date']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='PegasusCal-0']/div[3]/div[1]/ul/li[8]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='a_2018_2_28']/span[1]")).click();
		Thread.sleep(5000);
		
	
		driver.findElement(By.xpath("//*[@id='BE_flight_flsearch_btn']")).click();
		Thread.sleep(10000);

        driver.quit();
	}

}