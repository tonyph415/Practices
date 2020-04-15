package stepdefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class teststep {
WebDriver driver;
String baseURL = "https://www.orderpage.in";
WebElement product = driver.findElement(By.name("product"));
WebElement productV1 = driver.findElement(By.name("productV1"));
WebElement productV2 = driver.findElement(By.name("productV2"));
WebElement plan = driver.findElement(By.name("plan"));
WebElement planP1 = driver.findElement(By.name("planP1"));
WebElement planP2 = driver.findElement(By.name("planP2"));

//Select a product by click on product radio button, click on product
//after clicked on product, a list of plans is displayed
//click on a plan to select plan
// A product with plan counted as 1 item; 
// Click on "Add to your Cart", enter number to Quantity box 
// Quantity box maximum is 3

	@Given ("^ User navigates to Order page $")
	public void User_navigates_to_Order_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","WebDrivers\\geckodriver.exe");
		   driver = new FirefoxDriver(); 
		   driver.get(baseURL);
	}
	
	@Then("^User choose a Product and Plan option is not Displayed$")
	
		public static void main(String[] args) { 
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		    WebDriver driver = new FirefoxDriver();
			driver.get(baseURL);

			Select drpCountry = new Select(driver.findElement(By.name("country")));
			drpCountry.selectByVisibleText("ANTARCTICA");

			//Selecting Items in a Multiple SELECT elements
			driver.get("http://jsbin.com/osebed/2");
			Select fruits = new Select(driver.findElement(By.id("fruits")));
			fruits.selectByVisibleText("Banana");
			fruits.selectByIndex(1);
		
		
		
//		driver.close();
	}


	
	
	
	


	

}

