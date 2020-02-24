package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWFB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.wellsfargo.com/");
	    Thread.sleep(5000);  // Let the user actually see something!
	    System.out.println(driver.getTitle());

	    
//	   Sign On with a random user credential  
	    driver.findElement(By.id("userid")).sendKeys("mecury");
	    driver.findElement(By.id("password")).sendKeys("mecury");
	    	    
	    driver.findElement(By.id("btnSignon")).click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    
//	    View "Career" tab
	    driver.findElement(By.xpath("//*[@id=\"body\"]/footer/div/nav/div/div/div/div[2]/a")).click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
// 		View "About Wells Fargo" tab
	    driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[1]/a")).click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    
// 		View "Working at Wells Fargo" tab
	    driver.findElement(By.xpath("//*[@id=\"AboutUs-link4\"]/span")).click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"AboutUs-content4\"]/div/ul/li[1]/a")).click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    
//	    Search for Jobs
	    driver.findElement(By.id("HRS_SCH_WRK_HRS_SCH_TEXT100")).sendKeys("QA");
	    driver.findElement(By.xpath("//*[@id=\"HRS_SCH_WRK_FLU_HRS_SEARCH_BTN\"]/img")).click();
	    System.out.println(driver.getTitle());
	    
	    System.out.println("Searched QA job");
	    Thread.sleep(5000);
	    
	    driver.quit();
		
		
		
	}


}
