package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class UploadFileToBrowser2 {

	@Test
	public void downloadFile() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://files.fm/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		Screen screen = new Screen();
		Pattern pattern = new Pattern();

		driver.findElement(By.xpath("/html/body/div[1]/div/section[1]/div/div/div[2]/div[4]/div[2]/div[1]/div/span"))
				.click();
		Thread.sleep(3000);

		/*pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/Downloads.PNG");
		screen.click(pattern);
		Thread.sleep(1000);
		pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/Open.PNG");
		screen.click(pattern);
		Thread.sleep(1000);*/

		pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/FileName.PNG");

		screen.type(pattern, "C:\\Users\\Rajendra Prasad\\Downloads\\sikulixapi.jar");
		Thread.sleep(3000);

		pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/Open.PNG");
		screen.click(pattern);

		Thread.sleep(3000);

	}

}
