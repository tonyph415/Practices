package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBRegister {

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
	    
//	    WebElement gender = driver.findElement(By.id("u_0_a"));
//	    WebElement gender = driver.findElement(By.id("u_0_b"));
//	    WebElement gender = driver.findElement(By.id("u_0_b"));
//	    gender.click();
	    driver.findElement(By.id("u_0_b")).click();
//	    driver.findElement(By.id("js_o")).click();
	    Select option = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[7]/div[1]/select")));
//	    option.selectByVisibleText("Wish them a happy birthday!");
//	    option.selectByValue(6);
	    option.selectByIndex(3);
	    
//	    .findElement(By.id("u_0_11")).sendKeys("No Gender");
	     
	    // submit
	    driver.findElement(By.id("u_0_13")).click();
	    
	    System.out.println(driver.getTitle());
	    
//	    driver.close();

}}
