package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTestNG {

	@Test
	public void testcase1() {
		System.out.println("Testcase1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Testcase2");
	}
	@Test
	public void testcase3() {
		System.out.println("Testcase3");
	}
	
	@BeforeClass
	public static void setupbeforeclass() throws Exception {
		System.out.println("BeforeClass");
	}
	
	@AfterClass 
	public void aftermethod() {
		System.out.println("After");
	}
	@BeforeClass
	public void beforemethod() {
		System.out.println("Before");
	}

}
