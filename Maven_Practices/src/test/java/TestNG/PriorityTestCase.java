package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTestCase {
	
		  @Test
		  public void Test1() {
			  System.out.println("testcase1");
		  }
		  @Test
		  public void Test2() {
			  System.out.println("testcase2");
		  }
		  @Test
		  public void Test3() {
			  System.out.println("testcase3");
		  }
		  @BeforeMethod
		  public void beforeMethod() {
			  System.out.println("before method: Launch app");
		  }

		  @AfterMethod
		  public void afterMethod() {
			  System.out.println("after method:close app");  
		  }

		  @BeforeClass
		  public void beforeClass() {
			  System.out.println("before class :prepare test data");    
		  }

		  @AfterClass
		  public void afterClass() {  
			  System.out.println("after class: generate report") ;  
		  }

		  @BeforeTest
		  public void beforeTest() {
			  System.out.println("before test:open db connection");  
		  }

		  @AfterTest
		  public void afterTest() {
			  System.out.println("after test: close db connection") ; 
		  }

		  @BeforeSuite
		  public void beforeSuite() {
			  System.out.println("before suite: smoke testing")  ;
		  }

		  @AfterSuite
		  public void afterSuite() {
			  System.out.println("after suite:clear results");  
		  }

		}