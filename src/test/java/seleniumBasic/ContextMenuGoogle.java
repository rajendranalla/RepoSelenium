package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/rajendra/workspace/geckodriver.exe");

		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile firefoxprofile = profile.getProfile("Default User");

		WebDriver driver = new FirefoxDriver(firefoxprofile);
		driver.manage().deleteAllCookies();

		System.out.println("-----------------First Window--------------");
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		WebElement about = driver.findElement(By.xpath("html/body/div[1]/div[6]/div[1]/div/div/div/div/span[2]/a[3]"));
		
		action.moveToElement(about);
		
		action.contextClick().build().perform();

		Thread.sleep(5000);

	}

}
