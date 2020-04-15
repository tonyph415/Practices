package OrderFlowV2;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class OrderStepDefination_V2 {
	
	// Select a product by click on product box, click on product
	// after clicked on product, a list of plans is displayed
	// click on a plan to select plan
	// A product has to have a plan counted as 1 item; 
	// Click on "Add to your Cart", enter number to Quantity box 
	// Quantity box maximum is 3
	// click on order, review order summary
	// Print out success message and order history

		WebDriver driver;
		@Given("^Open the Orderpage$")
		public void user_have_open_the_browser() throws Throwable {
			System.setProperty("webdriver.gecko.driver","Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		    driver.get("http://place.order2.com");	// navigate to page
		    driver.manage().window().maximize();    // maximize the window
			driver.manage().deleteAllCookies();		// delete all cookies
		// Login user account for order
			driver.findElement(By.name("userName")).sendKeys("user");
			driver.findElement(By.name("password")).sendKeys("pass");
			driver.findElement(By.name("login")).click();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    System.out.println(driver.getTitle());
		}
	
		@When("^Select the Product  \"([^\"]*)\" and Plan \"([^\"]*)\"$")
		public void user_select_Product(String Product2V, String Plan2V) throws Throwable { // products and Plans are displayed
			Select products2 = new Select(driver.findElement(By.name("Products")));
			products2.selectByVisibleText(Product2V);		// Select product from dropbox
		    
			Select plan2 = new Select(driver.findElement(By.name("Plans"))); // To select plan from dropbox
			plan2.selectByVisibleText(Plan2V);
		}
		@Then("^User select Quantity \"([^\"]*)\"$")
		public void user_select_Quantity(String Qty2V) throws Throwable {
			Select qty1 = new Select(driver.findElement(By.name("Quantity"))); // quantity list in dropbox has 1,2,3
			qty1.selectByVisibleText(Qty2V);
			}   
		
		@Then("^Add selected items to Cart$")
		public void add_selected_items_to_Cart() throws Throwable {
			driver.findElement(By.name("AddtoCart")).click();
		 }		
		
		@Then("^Place the order$")
		public void place_the_order() throws Throwable {
			if (driver.findElements(By.name("item")).size()<=3 ) { 	// each product with plan is listed in a line as 1 item; limited 3 items per order
				driver.findElement(By.name("placeOrder")).click();	// placing order
				
			}else {
				System.out.println("Error: Unable to make order have more than 3 items");
			}
		}
		@And("^Order summary is displayed")
		public void order_summary() throws Throwable {
			System.out.println("Order Summary "+driver.findElement(By.name("Order Summary")).getText()); //order summary is displayed
			String actual = driver.findElement(By.name("Order Summary")).getText();
			Assert.assertTrue(actual .contains("OrderId"));  // order summary displayed order id
			
		}
		
		@Then("^Print out success message$")
		public void print_out_success_message() throws Throwable {
			if (driver.findElements(By.name("oderId")).size()!=0) { // order paced has its order id
				System.out.println("Order history"+driver.findElement(By.name("OrderHistory")).getText()); // OrderHistory is displayed
			}else {
				System.out.println("Error: Please review your oder");
			}
			
			driver.close();
		}

	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	


	




	
	
	

