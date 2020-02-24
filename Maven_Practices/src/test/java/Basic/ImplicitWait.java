package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    // maximize the window
		driver.manage().deleteAllCookies();		// delete all cookies
		
		driver.get("https://half.ebay.com/");
	    System.out.println(driver.getTitle());
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.quit();
	  
		
		
		

	}}
