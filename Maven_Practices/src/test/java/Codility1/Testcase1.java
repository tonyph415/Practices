package Codility1;


import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//	import com.codility.selenium.tests.WebDriverTestCase;


	public class Testcase1 {
		WebDriver driver;
	@BeforeMethod
		  public void OpenBr(){
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
		  }
	    @Test
	    public void MainPageTitle() { 
	    	// verify main page title
	        String title = driver.getTitle();
	        assertEquals( "ARR", title);
	   }
	    
	    
	    @Test 
	    // verify that the "query input" and “Search button” is displayed and enabled
	    	    
	    public void mainscreen ( ) {
	    	if(driver.findElements(By.id("search-input")).size() != 0){
	    		System.out.println("Query Input is Present"); 
	    		}else
	    		{ 
	    			System.out.println("Query Input is Absent"); 
	    			}
	    	if(driver.findElements(By.id("search-button")).size() != 0){
	    		System.out.println("Search-button is Present"); 
	    		}else
	    		{ 
	    			System.out.println("Search-button is Absent"); 
	    			}
	    }
//	    public void mainscreen() {
//    	boolean searchboxPresence = driver.findElement(By.id("search-input")).isDisplayed();
//    	boolean searchIconEnabled = driver.findElement(By.id("search-button")).isEnabled();
//	}
//	    
	    
	    @Test
	    public void verifyForbiddenQuery (){
	        // verify that empty Query input is Forbidden
	        driver.findElement(By.id("search-input")).sendKeys("");
	        driver.findElement(By.id("search-button")).click();
	        
	        String expected= "Provide some query";
	        String actual= driver.findElement(By.id("error-empty-query")).getText();
	        Assert.assertEquals(expected,actual);
	    }
	    @Test
	     public void verifySearchRessult (){
	    	// veryfy that at least 1 result
	        driver.findElement(By.id("search-input")).sendKeys("isla");
	        driver.findElement(By.id("search-button")).click();
	        
	        int count = driver.findElements(By.id("search-results")).size(); 
	        Assert.assertTrue(count>=1); 
	        System.out.println("Count is greater than or equal to 1. Count is: "+count);

	        
//	        String expectedS= "isla";
//	        String actual= driver.findElement(By.id("search-results")).getText();
//	        Assert.assertTrue(expectedS.contains("isla"));
	     } 
	        
	    @Test
	    public void verifyFeedbackResult (){ 
	    	// Verify Feedback display
	        driver.findElement(By.id("search-input")).sendKeys("castle");
	        driver.findElement(By.id("search-button")).click();
	        
	        String expectedFb= "No results";
	        String actualFb= driver.findElement(By.xpath("//*[@id=\"error-no-results\"]")).getText();
	        Assert.assertEquals(expectedFb,actualFb);
	    
	    }
	       @Test  
	         public void verifyMatchResult (){ 
	    	   // check if the result match the query input
	        driver.findElement(By.id("search-input")).sendKeys("Port Royal");
	        driver.findElement(By.id("search-button")).click();
	        
	       String actualM= driver.findElement(By.xpath("//*[@id=\"search-results\"]")).getText();
	       System.out.println(actualM);
	       
	        Assert.assertEquals("Port Royal",actualM);
	    
	     }
	    @AfterMethod
	    public void closeBr(){
	        driver.close();
	    }

}
