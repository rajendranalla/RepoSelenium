package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static WebDriver driver;

	public static void main(String[] args)  {

		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rajendra\\workspace\\geckodriver.exe");
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.xpath("//a[@class='_1QZ6fC'][@title='Men']"));

		Actions action = new Actions(driver);
		action.moveToElement(menu);
		

	    // a[@class='_3ZgIXy'][@title='Shirts']
		driver.findElement(By.xpath("//a[@class='_3ZgIXy'][@title='Shirts']")).click();

	}

}
