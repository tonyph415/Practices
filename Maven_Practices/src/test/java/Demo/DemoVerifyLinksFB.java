package Demo;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoVerifyLinksFB {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com//");
		    driver.manage().window().maximize();    // maximize the window
			driver.manage().deleteAllCookies();		// delete all cookies
		    System.out.println(driver.getTitle());

		    // Login 
		    driver.findElement(By.id("u_0_2")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    	// Get entire page screenshot
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// Copy the screenshot to disk
			FileUtils.copyFile(screenshot, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png"));
			System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");
				// Navigate to previous page (Home page)
			driver.navigate().back();
			
			// Forgot account?
			driver.findElement(By.partialLinkText("Forgot account?")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// Sign Up
			driver.findElement(By.name("websubmit")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// Create A Page
			driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Sign Up
			driver.findElement(By.linkText("Sign Up")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Log In
			driver.findElement(By.linkText("Log In")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Messenger
			driver.findElement(By.linkText("Messenger")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Facebook Lite 
			driver.findElement(By.linkText("Facebook Lite")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Watch 
			driver.findElement(By.linkText(" Watch ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	People
			driver.findElement(By.linkText(" People ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Pages
			driver.findElement(By.linkText(" Pages ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Page Categories
			driver.findElement(By.linkText(" Page Categories ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Places
			driver.findElement(By.linkText(" Places ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Games
			driver.findElement(By.linkText(" Games ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Locations
			driver.findElement(By.linkText(" Locations ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Marketplace
			driver.findElement(By.linkText(" Marketplace ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Groups
			driver.findElement(By.linkText(" Groups ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Instagram
			driver.findElement(By.linkText(" Instagram ")).click();
		    System.out.println("Link loaded to page: "+ driver.getTitle());
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.navigate().back();
			
			// 	Local
			// 	Fundraisers
			// 	Services
			// 	About
			// 	Create Ad
			// 	Create Page
			// 	Developers
			// 	Careers
			// 	Privacy
			// 	Cookies
			// 	Ad Choices
					
		driver.close();

		}

	}