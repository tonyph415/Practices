package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {
		public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		// Alert Message handling
	        driver.get("http://demo.guru99.com/test/delete_customer.php");			
	        driver.findElement(By.name("cusid")).sendKeys("53920");					
	        driver.findElement(By.name("submit")).submit();			
	    // Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	    // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	    // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	    // Accepting alert		
	        alert.accept();		
	        
	        driver.close();
	    
	    //https://www.guru99.com/alert-popup-handling-selenium.html
	    
//	 // void dismiss() // To click on the 'Cancel' button of the alert.
//	    driver.switchTo().alert().dismiss();
//	 //void accept() // To click on the 'OK' button of the alert.
//	    driver.switchTo().alert().accept();
//	 // String getText() // To capture the alert message.
//	    driver.switchTo().alert().getText();			
//	 // void sendKeys(String stringToSend) // To send some data to alert box.
//	    driver.switchTo().alert().sendKeys("Text");
	    
	    
	    
	    
		}

}
