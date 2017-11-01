package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FrameIdentification {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/IEDriverServer.exe");

//		 ProfilesIni profile = new ProfilesIni();
//		 FirefoxProfile firefoxprofile = profile.getProfile("Default User");
//		 firefoxprofile.setPreference("dom.webnotifications.enabled", false);
//		
//		 WebDriver driver = new FirefoxDriver(firefoxprofile);
		 WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com/");
		Thread.sleep(8000);

		WebElement loginpage = driver.findElement(By.xpath("//div/div[2]/iframe[@id='iframe_Login']"));

		driver.switchTo().frame(loginpage);
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("amitabh@kbc.com");
		Thread.sleep(5000);

	}

}
