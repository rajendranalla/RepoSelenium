package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableOnly {

	public static void main(String[] args) {

		try {

			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
			System.setProperty("webdriver.gecko.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/geckodriver.exe");

			WebDriver driver = new FirefoxDriver();

			BasicConfigurator.configure();

			Logger log = Logger.getLogger("DraggableOnly");

			// configure log4j properties file
			PropertyConfigurator
					.configure(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\log4j.properties");

			log.debug("Open URL in Firefox browser");
			driver.get("https://jqueryui.com/draggable/");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			log.trace("Switch to Frame");
			driver.switchTo().frame(0);

			Actions action = new Actions(driver);

			log.info("Find the draggable element");
			WebElement draggable = driver.findElement(By.id("draggable"));

			log.fatal("Not dropping");
			action.dragAndDropBy(draggable, 400, 150).perform();
			Thread.sleep(5000);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
