package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDroppable {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.gecko.driver", "C:/Users/rajendra/workspace/geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.switchTo().frame(0);

			Actions action = new Actions(driver);

			WebElement draggable = driver.findElement(By.id("draggable"));
			WebElement droppable = driver.findElement(By.id("droppable"));

//			Thread.sleep(5000);
//			action.contextClick(droppable).build().perform();
//			Thread.sleep(5000);

			action.dragAndDrop(draggable, droppable);

			Thread.sleep(5000);

			driver.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
