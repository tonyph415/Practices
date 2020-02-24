package Basic;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	
	
	
	public class keyboardhandling {
	
		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();    // maximize the window
			driver.manage().deleteAllCookies();		// delete all cookies
			driver.get("https://www.facebook.com/");
			
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.findElement(By.id("email")).sendKeys("123@asf.com");
		    Actions act = new Actions(driver);
		    act.sendKeys(Keys.TAB).perform();
		    act.sendKeys("acbd").perform();
		    act.sendKeys(Keys.ENTER);
		    System.out.println(driver.getTitle());
		   
		    act.sendKeys(Keys.TAB).perform();
		    act.sendKeys(Keys.ENTER);
		    System.out.println(driver.getTitle());
		    driver.close();
			
		}
		
		
	}