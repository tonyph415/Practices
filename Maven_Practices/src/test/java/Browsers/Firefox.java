package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

			System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		    driver.get("https://www.safeway.com/account/sign-in.html#error=login_required");
		    System.out.println(driver.getTitle());
		    
		    driver.findElement(By.name("userId")).sendKeys("mecury");
		    driver.findElement(By.name("inputPassword")).sendKeys("mecury");
		    	    
		    driver.findElement(By.xpath("//*[@id=\"btnSignIn\"]")).click();
		    System.out.println(driver.getTitle());
		    driver.close();

	}
	
}
