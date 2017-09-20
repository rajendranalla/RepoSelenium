package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class PushNotification {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Users/rajendra/workspace/geckodriver.exe");

		ProfilesIni listprofile = new ProfilesIni();
		FirefoxProfile profile = listprofile.getProfile("Default User");

		WebDriver driver = new FirefoxDriver(profile);

		driver.get("http://www.firstcry.com/");
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


	}

}
