package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Users/rajendra/workspace/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();
		

		driver.get("https://www.facebook.com/");

		//Waits for 10 secs
		WebDriverWait wait = new WebDriverWait(driver, 2);

		//Check for element visibility
//		WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgotten account?")));
//
//		boolean status = element.isDisplayed();
//		
//		if(status){
//			System.out.println("Element is displayed");
//		}
//		else{
//			System.out.println("Element is NOT displayed");
//		}
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rajendranalla@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Prasad_9177");
		
		driver.findElement(By.xpath("//*[@id='u_0_0']")).click();
		
		WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Rajendra']")));
		
		boolean status= element.isDisplayed();
		
		if(status){
			System.out.println("Name is Present");
		}
		else{
			System.out.println("Name is not Present");
		}
	}

}
