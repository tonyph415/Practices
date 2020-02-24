package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		    driver.get("https://www.facebook.com//");
		    System.out.println(driver.getTitle());
		    
		    // Dropdown using select:
		    Select day = new Select(driver.findElement(By.id("day")));
		    day.selectByIndex(10);
		    Select month = new Select(driver.findElement(By.id("month")));
		    month.selectByVisibleText("Jun");
		    Select year = new Select(driver.findElement(By.id("year")));
		    year.selectByValue("1999");
		   
		    // Radio button 
		    WebElement gender = driver.findElement(By.id("u_0_9"));
//		    WebElement gender = driver.findElement(By.id("u_0_a"));
//		    WebElement gender = driver.findElement(By.id("u_0_b"));
		    gender.click();
		     
		    // submit
		    driver.findElement(By.id("u_0_13")).click();
		    
//		    System.out.println(driver.getTitle());
		    
//		    driver.close();
}}