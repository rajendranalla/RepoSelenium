package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.gecko.driver", "C:/Users/rajendra/workspace/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			dropDown();
//			allLinks();
//			particularBlockLinks();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void dropDown() {

		driver.get("https://www.wikipedia.org/");
		// driver.findElement(By.xpath("//div[@id='search-input']/div[1]/i")).click();
		// System.out.println("59th element is: "+
		// driver.findElement(By.xpath("//div[@id='search-input']/div[1]/div/select[@id='searchLanguage']/option[59]")).getText());
		

		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		select.selectByValue("it");

		
		WebElement optionsTag = driver.findElement(By.xpath("html/body/div[2]/form/fieldset/div/div[1]/div/select"));
		
		List<WebElement> values = optionsTag.findElements(By.tagName("option"));
		System.out.println(values.size());

		System.out.println(values.get(58).getText());

		// Print all the language attributes from dropdown

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getAttribute("lang"));
		}

	}

	// This block prints all the links in a page
	public void allLinks() {

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		allLinks.size();

		for (WebElement link : allLinks) {
			System.out.println(link.getText() + " URL is: " + link.getAttribute("href"));
		}
	}

	// This "html/body/div[6]/div[3]" has 12 links in it and prints them
	public void particularBlockLinks() {

		WebElement blockElements = driver.findElement(By.xpath("html/body/div[6]/div[3]"));

		List<WebElement> linksInBlock = blockElements.findElements(By.tagName("a"));

		for (WebElement link : linksInBlock) {
			System.out.println(link.getText() + " URL is: " + link.getAttribute("href"));
		}

	}

	public static void main(String[] args) {

		DropdownHandling dropdown = new DropdownHandling();
		dropdown.invokeBrowser();

	}

}
