package Basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {
	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		// Get entire page screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Copy the screenshot to disk
		FileUtils.copyFile(screenshot, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png"));
		System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");
		
        driver.quit();
    }
}
		
		//// Get entire page screenshot
		//File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//
		//// Copy the element screenshot to disk
		//File screenshotLocation = new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png");
		//FileUtils.copyFile(screenshot, screenshotLocation);
		//System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");