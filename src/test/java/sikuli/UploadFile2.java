package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class UploadFile2 {

	@Test
	public void downloadFile() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/rajendra/workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://files.fm/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='file_select_button']")).click();
		Thread.sleep(3000);

		Screen screen = new Screen();

//		Pattern pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/Documents.PNG");
//		screen.click(pattern);

		Pattern pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/FileName.PNG");
		screen.type(pattern, "C:\\Users\\rajendra\\Downloads\\log4j-1.2.17.jar");
		Thread.sleep(3000);
		
		pattern = new Pattern(System.getProperty("user.dir") + "/src/test/resources/sikuliImages/Open.PNG");
		screen.click(pattern);

		Thread.sleep(3000);

	}

}
