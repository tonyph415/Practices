package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(5000);  // Let the user actually see something!
	    System.out.println(driver.getTitle());
	    
	    
//	    WebElement searchBox = driver.findElement(By.name("q"));
//	    searchBox.sendKeys("Selenium");
//	    searchBox.submit();
//	    Thread.sleep(5000);  // Let the user actually see something!
//	    driver.quit();
		
		
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		String actualMsg =driver.findElement(By.xpath("//*[@id=\"error_box\"]/div[1]")).getText();
		String errorMsg= "You Can't Use This Feature Right Now";

				if(actualMsg.equals(errorMsg)) {
				        System.out.println("Test Case Passed");
				    }else{
				        System.out.println("Test Case Failed");
				    };
				    
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
					
		String actualMsg1 =driver.findElement(By.xpath("//*[@id=\"error_box\"]/div[1]")).getText();
		String errorMsg1= "You Can't Use This Feature Right Now";

							if(actualMsg1.equals(errorMsg1)) {
							        System.out.println("Test Case Passed");
							    }else{
							        System.out.println("Test Case Failed");
							    };		    
	

	    
	    
	    
		
	}

	
	
	
}
