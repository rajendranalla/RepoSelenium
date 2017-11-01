package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/resizable/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		Actions action = new Actions(driver);

		driver.switchTo().frame(0);

		WebElement resizable = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

		action.clickAndHold(resizable).moveByOffset(100, 100).release(resizable).build().perform();

		Thread.sleep(5000);

		driver.close();
	}

}
