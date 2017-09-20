package seleniumBasic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class getCommandsAll {
	
	WebDriver driver;
	
	
	public void Invoke(){
		
		try {
			System.setProperty("webdriver.ie.driver", "C:/Users/rajendra/workspace/IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.get("https://www.amazon.in");
			
			getCommands();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void getCommands() throws Exception{
		
		try {
			driver.get("https://www.amazon.in");
			Thread.sleep(5000);
			String title = driver.getTitle();
			System.out.println("Title of the page is: " +title);
			driver.findElement(By.linkText("Your Amazon.in")).click();
			Thread.sleep(3000);
			String URL = driver.getCurrentUrl();
			System.out.println("Current URL of the page is: "+URL);
			
			//Finding the text from the password link
			WebElement forgot = driver.findElement(By.partialLinkText("Forgot"));
		    System.out.println("Forgot pwd text is :" +forgot.getText());
		    
		    //Page source
			System.out.println("Page source is: "+ driver.getPageSource());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		getCommandsAll getCommands = new getCommandsAll();
		getCommands.Invoke();

	}

}
