package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    System.out.println(driver.getTitle());
	    
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement a = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement b = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));

		WebElement c = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement d = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		Actions act = new Actions(driver);
		act.clickAndHold(a).clickAndHold(d).release().build().perform();

//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//		System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
//		driver.switchTo().defaultContent();
//		driver.findElement(By.linkText("Droppable")).click();
//		
}
}
