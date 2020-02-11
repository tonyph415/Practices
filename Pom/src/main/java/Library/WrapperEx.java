package Library;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperEx {
protected WebDriver driver;

	public void launchApplication(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src\\main\\resources\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		} catch (WebDriverException e){
			System.out.println("Browser could not be launched");
		}
	
	}
	public void takescreenshot (WebDriver driver) throws IOException {
		// Get entire page screenshot
				File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				// Copy the screenshot to disk
				FileUtils.copyFile(screenshot, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png"));
				System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");
				
	}
	
	public void quit() {
		driver.close();
	}
}