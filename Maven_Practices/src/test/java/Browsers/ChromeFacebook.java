package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com//");
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.id("email")).sendKeys("mecury");
	    driver.findElement(By.id("pass")).sendKeys("mecury");
	    	    
	    driver.findElement(By.partialLinkText("Forgot account?")).click();
	    
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	}
}
