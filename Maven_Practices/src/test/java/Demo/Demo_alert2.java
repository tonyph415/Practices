package Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_alert2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/popup.php");

		driver.findElement(By.xpath("html/body/p/a")).click();
System.out.println(driver.getTitle());
		// return the parent window name as a String
		 String parentWindow=driver.getWindowHandle();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Pass a window handle to the other window
		for(String childWindow: driver.getWindowHandles())
		    {
		      System.out.println("Switch to child window");

		      //switch to child window
		      driver.switchTo().window(childWindow);
		      System.out.println(driver.getTitle());
		      //find an element and print text of it  
		    WebElement textLabel=driver.findElement(By.xpath("html/body/div[1]/h2"));
		     System.out.println(" text:  "+textLabel.getText());
		     driver.close();
//		            }
//		     System.out.println("Get back to parent window");

		      //switch to Parent window
//		      driver.switchTo().window(parentWindow);

		     //find an element and print text of it 
//		     WebElement logotext=driver.findElement(By.xpath("html/body/div[1]/h2"));
//		       System.out.println("text: "+logotext.getText());
//		       driver.close();
		    }	}
		}
