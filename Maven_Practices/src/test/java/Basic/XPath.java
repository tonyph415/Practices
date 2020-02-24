package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
			

			System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    System.out.println(driver.getTitle());
		 // Absolute Xpath check
		    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("mecury");
		 // Relative xpath
		    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mecury");		    
		 // Using AND Condition 
//		    driver.findElement(By.xpath("//*[@type='submit' and @id='u_0_2']") ).click();
		 // Using OR Condition 
//		    driver.findElement(By.xpath("//*[@type='submit' and @id='u_0_2']") ).click();
		  // Using contains with
		    driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("mecury");
		  // Using start with
		    driver.findElement(By.xpath("//*[starts-with(@name,'lastname')]")).sendKeys("Lastname");
		    
		    
		    
		    driver.quit();

}}