package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.makemytrip.com/flights/");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label")).click();
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[5]")).click();
	    
	    
//	    Select day = new Select(driver.findElement(By.id("day")));
//	    day.selectByIndex(10);
//	    Select month = new Select(driver.findElement(By.id("month")));
//	    month.selectByVisibleText("Jun");
//	    Select year = new Select(driver.findElement(By.id("year")));
//	    year.selectByValue("2021");
//		
	    driver.quit();
	}

}
