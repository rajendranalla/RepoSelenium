package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommandsAll {

	WebDriver driver;

	public void invoke() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Rajendra Prasad/eclipse-workspace/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			navigateCommands();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void navigateCommands() throws Exception {

		driver.navigate().to("https://www.amazon.in");
		driver.findElement(By.linkText("Today's Deals")).click();
		System.out.println("Today's deals page: " + driver.getCurrentUrl());
		System.out.println("Today's deals page title: " + driver.getTitle());
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='nav-subnav']/a[3]/span")).click();
		System.out.println("Subscribe and save page: " + driver.getCurrentUrl());
		System.out.println("Subscribe and save page title: " + driver.getTitle());
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Today's deals page: " + driver.getCurrentUrl());
		System.out.println("Today's deals page title: " + driver.getTitle());

		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("Subscribe and save: " + driver.getCurrentUrl());
		System.out.println("Subscribe and save page title: " + driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();

	}

	public static void main(String[] args) {

		navigateCommandsAll navigate = new navigateCommandsAll();
		navigate.invoke();

	}

}
