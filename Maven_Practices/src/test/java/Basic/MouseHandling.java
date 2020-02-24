package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String[] args) throws InterruptedException {
		

			System.setProperty("webdriver.chrome.driver","C:\\Users\\tuan\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    driver.get("https://www.wellsfargo.com/");
		    System.out.println(driver.getTitle());
		    
//		    Actions actions = new Actions(driver);
//			 WebElement moveonmenu = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a"));
//			 actions.moveToElement(moveonmenu);
//			 actions.perform();
//			 moveonmenu.click();

		    Actions actions = new Actions(driver);
		    actions.moveToElement(driver.findElement(By.linkText("Banking and Credit Cards"))).build().perform();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Online Banking")).click();
		    
		    driver.quit();
	}

}