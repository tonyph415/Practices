package Maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class objectrepository {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	
//	Load the properties File
	Properties obj = new Properties();
	FileInputStream objfile = new FileInputStream("C:\\Users\\tuand\\eclipse-workspace\\PracticesMaven\\config.property");
	obj.load(objfile);
	
//	Enter Data into Form
	
	driver.findElement(By.id(obj.getProperty("username"))).sendKeys("username1");
	driver.findElement(By.id(obj.getProperty("password"))).sendKeys("password1");
	driver.findElement(By.id(obj.getProperty("submit"))).click();
	
// close browser
	driver.close();
	
	}

	}