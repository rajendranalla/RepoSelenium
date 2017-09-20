package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.gecko.driver", "C:/Users/rajendra/workspace/geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			slider();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void slider() throws InterruptedException {

		driver.findElement(
				By.xpath("//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"))
				.sendKeys("shoes");
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button"))
				.click();
		Thread.sleep(3000);
		Actions actions = new Actions(driver);


//		WebElement slider = driver.findElement(
//				By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]"));
//
//		Dimension dim = slider.getSize();
//		int x = dim.getWidth();
//
//		actions.clickAndHold(slider).moveByOffset(x - 50, 0).release().build().perform();
//		Thread.sleep(10000);
		
		//for two points for slider
		 WebElement startpoint = driver.findElement(
		 By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[1]"));
		
		 WebElement endpoint = driver.findElement(
		 By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[2]"));
		 
		 actions.dragAndDropBy(endpoint, -100, 0).build().perform();

	}

	public static void main(String[] args) {

		SliderActions slider = new SliderActions();
		slider.invokeBrowser();

	}

}
