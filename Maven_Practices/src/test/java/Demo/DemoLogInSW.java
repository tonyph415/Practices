package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoLogInSW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.safeway.com/account/sign-in.html#error=login_required");
        
        WebElement username=driver.findElement(By.id("label-email"));
        WebElement password=driver.findElement(By.id("label-password"));
        WebElement login=driver.findElement(By.id("btnSignIn"));
        
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
        login.click();
       System.out.println(driver.getTitle());
        
        String actualUrl="https://www.safeway.com/account/sign-in.html#error=login_required";
        String expectedUrl= driver.getCurrentUrl();
        
        Assert.assertEquals(expectedUrl,actualUrl);
        
        driver.close();

	}

}
