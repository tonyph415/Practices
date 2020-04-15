package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderStepDefination {
	WebDriver driver;
	@Given("^Open the Orderpage$")
	public void user_have_open_the_browser() throws Throwable {
		System.setProperty("webdriver.gecko.driver","Driver//geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=010999779d3673bc82fa6430732c74e5");
	    driver.manage().window().maximize();    // maximize the window
		driver.manage().deleteAllCookies();		// delete all cookies
	}
	@When("^Login Account$")
	public void login_Account() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    System.out.println(driver.getTitle());
	}
	@When("^User select Product \"([^\"]*)\"$")
	public void user_select_Product(String product) throws Throwable {
	    if (!driver.findElement(By.name("Plans")).isDisplayed()) // user have to select a product before choose a plan
	    {
	    	Select products1 = new Select(driver.findElement(By.name("Products")));
			products1.selectByVisibleText(product);
	    } else {
	    	System.out.println("Please select your product");
	    }
	}
	@When("^User select  Plan \"([^\"]*)\"$")
	public void user_select_Plan(String plan) throws Throwable {
		Select plan1 = new Select(driver.findElement(By.name("Plans")));
		plan1.selectByVisibleText(plan);
	}
	@Then("^User select Quantity \"([^\"]*)\"$")
	public void user_select_Quantity(String Qty) throws Throwable {
		Select qty1 = new Select(driver.findElement(By.name("Quantity")));
		qty1.selectByVisibleText(Qty);
		}   
	
	@Then("^Add selected items to Cart$")
	public void add_selected_items_to_Cart() throws Throwable {
		driver.findElement(By.name("AddtoCart")).click();
	 }		
	
	@Then("^Place the order$")
	public void place_the_order() throws Throwable {
		if (driver.findElements(By.name("item")).size()<=3 ) {
			driver.findElement(By.name("placeOrder")).click();
			System.out.println("Order Summary "+driver.findElement(By.name("Order Summary")).getText());
		}else {
			System.out.println("Error: Unable to make order have more than 3 items");
		}
	}
	
	@Then("^Print out success message$")
	public void print_out_success_message() throws Throwable {
		if (driver.findElements(By.name("oderId")).size()!=0) {
			System.out.println("Order history"+driver.findElement(By.name("OrderHistory")).getText());
		}else {
			System.out.println("Error: Please review your oder");
		}
		
//		driver.close();
	}
	
	
}







