package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DemoHeadlessBrower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println("Title of the page is "+driver.getTitle());
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("test");
//		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		String actualMsg =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div")).getText();
		String errorMsg= "The email or phone number you’ve entered doesn’t match any account.";

				if(actualMsg.equals(errorMsg)) {
				        System.out.println("Test Case Passed");
				    }else{
				        System.out.println("Test Case Failed");
				    };


			

		

		
	}

}