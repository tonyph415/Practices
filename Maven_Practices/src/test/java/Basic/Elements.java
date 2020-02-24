package Basic;





import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
	public static void main(String[] args) throws IOException, InterruptedException  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("userName")).sendKeys("mecury");
	    driver.findElement(By.name("password")).sendKeys("mecury");
	    driver.findElement(By.name("login")).click();
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);

		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".jpg"));
		 System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".jpg");
		 
		 
// check Cruise tab		
		 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a")).click();
		 System.out.println(driver.getTitle());
		 Thread.sleep(5000);
		 File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot1, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png"));
		 System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");
		
		 
// check Now Accepting Reservations link
		 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/p[3]/a/img")).click();
		 Thread.sleep(5000);
		 File screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot11, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png"));
		 System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");
		
		 
//		 Generating Mouse Hover Event In WebDriver
		 Actions actions = new Actions(driver);
		 WebElement moveonmenu = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a"));
		 actions.moveToElement(moveonmenu);
		 actions.perform();
		 moveonmenu.click();
		 
		 
////	Find Flight until it is visiable 	 
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.name("findFlights"), "Time left: 7 seconds"));
//		
//		driver.getCurrentUrl();
//		
//		Select mydrpdwn = new Select(driver.findElement(By.name("fromPort")));
//		mydrpdwn.selectByVisibleText("Acapulo");
//		
//			
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 File screenshot111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot111, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png"));
		 System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");

		
		driver.quit();
		
}}