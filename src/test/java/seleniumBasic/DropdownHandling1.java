package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownHandling {

	WebDriver driver;

	@BeforeTest
	public void invokeBrowser() {

		try {
			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\Rajendra
			// Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\resources\\executables\\geckodriver.exe");
			// driver = new FirefoxDriver();

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\SeleniumWebDriverMaven\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 1)
	public void selectLanguageFromDropDown() throws Exception {

		driver.get("https://www.wikipedia.org/");
		/*
		 * driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Dansk");
		 * driver.findElement(By.xpath("/html/body/div[2]/form/fieldset/button")).click(
		 * ); System.out.println("59th element is: "+ driver.findElement(By.xpath(
		 * "//div[@id='search-input']/div[1]/div/select[@id='searchLanguage']/option[59]"
		 * )).getText());
		 */

		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		Thread.sleep(3000);
		select.selectByValue("vo");

		WebElement optionsTag = driver.findElement(By.xpath("html/body/div[2]/form/fieldset/div/div[1]/div/select"));

		List<WebElement> values = optionsTag.findElements(By.tagName("option"));
		System.out.println("All languages in this dropdown is " + values.size());
		// System.out.println(values.get(58).getText());

		// Print all the language attributes from dropdown
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
		}
	}

	// This block prints all the links in a page
	@Test(enabled = true, priority = 2)
	public void getAllLinks() {

		// driver.findElements(By.tagName("a")) select all the links from the page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("------Total links in the entire page is-------- " + allLinks.size());

		for (WebElement link : allLinks) {
			System.out.println("URLs from the entire page: " + link.getAttribute("href"));

		}
	}

	@Test(enabled = true, priority = 3)
	public void LinksFromParticularBlockInAPage() {

		WebElement blockElements = driver.findElement(By.xpath("/html/body/div[1]"));

		List<WebElement> linksInAParticularBlock = blockElements.findElements(By.tagName("a"));
		System.out.println("----Total links in this particular block----- " + linksInAParticularBlock.size());

		for (WebElement link : linksInAParticularBlock) {
			System.out.println("URLs from a particular block in a page: " + link.getAttribute("href"));

		}

		driver.close();

	}

}
