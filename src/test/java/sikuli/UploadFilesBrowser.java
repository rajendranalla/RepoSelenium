package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class UploadFilesBrowser {

	@Test
	public void downloadFile() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://files.fm/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='file_select_button']")).click();
		Thread.sleep(3000);

		Screen screen = new Screen();

		Pattern pattern = new Pattern(System.getProperty("user.dir")+ "/src/test/resources/sikuliImages/Desktop.PNG");
		screen.click(pattern);
		Thread.sleep(3000);

		pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/Java.PNG");
		screen.doubleClick(pattern);

		Thread.sleep(3000);

	}

}
