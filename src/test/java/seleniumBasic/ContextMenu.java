package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//@Listeners(ListenersDemo.ListenersTestNG.class)
public class ContextMenu {

	@Test
	public void contextMenuDemo() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		Actions action = new Actions(driver);

		// Right clicking on the image
		WebElement contextmenu = driver
				.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));

		Thread.sleep(5000);
		action.contextClick(contextmenu).build().perform();

		// Moving to Product Info in the Contextual menu
		contextmenu = driver.findElement(By.id("dm2m1i1tdT"));
		action.moveToElement(contextmenu).build().perform();
		Thread.sleep(5000);

		// Moving to Installation in the Contextual menu
		contextmenu = driver.findElement(By.id("dm2m2i1tdT"));
		action.moveToElement(contextmenu).perform();

		Thread.sleep(5000);

		// Clicking on the Description files
		contextmenu = driver.findElement(By.id("dm2m3i0tdT"));
		action.moveToElement(contextmenu).click().build().perform();
		Thread.sleep(5000);

		driver.quit();
	}

}
