package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	WebDriver driver;

	public void invokeBrowser() {

		try {

			System.setProperty("webdriver.gecko.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(10000);

			// driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			mouseOver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mouseOver() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
		Thread.sleep(5000);
		action.moveToElement(menu).build().perform();
		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[3]/a/span")).click();
	}

	public static void main(String[] args) {

		MouseActions mouse = new MouseActions();
		mouse.invokeBrowser();

	}

}
