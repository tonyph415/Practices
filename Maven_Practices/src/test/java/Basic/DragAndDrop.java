package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://jqueryui.com/droppable/");
	    System.out.println(driver.getTitle());
	    
//	    driver.switchTo().frame(0);
//	    // driver.switchTo().frame(driver.findElement(ByClassName("demo-frame")));
//	    Actions actions = new Actions(driver);
//	    actions.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
//	    .moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
//	    		.release().build().perform();
//	    		
//	    driver.quit();
	   
	    
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions actions = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		actions.dragAndDrop(drag,drop).build().perform();
		
		driver.quit();
	    
	    
	}

}
