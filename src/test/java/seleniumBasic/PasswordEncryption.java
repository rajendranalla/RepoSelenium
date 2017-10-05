package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PasswordEncryption {

	@Test
	public void passwordEncode() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/rajendra/workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		String password = decodedPassword("UHJhc2FkXzkxNzc=");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rajendranalla@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		Thread.sleep(3000);
	}

	public static String decodedPassword(String password) {

		byte[] decodedPassword = Base64.decodeBase64(password);
		return new String(decodedPassword);

	}

}
