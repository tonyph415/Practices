package Maven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrappermethods {
	WebDriver driver;
	
	public void insertapp(String url){ 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    // maximize the window
		driver.manage().deleteAllCookies();		// delete all cookies
		driver.get(url);
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	public void enterbyid(String val,String name)
	{
		driver.findElement(By.id(val)).sendKeys(name);
	}
	
	public void clickbyxpath(String val1)
	{
		driver.findElement(By.xpath(val1)).click();
	}
	public void closeapp()
	{
		driver.close();
	}
	public void takesnap(String path) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));	
	}


	
}
