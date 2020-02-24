package Maven;

import org.testng.annotations.Test;


public class GroupTestCase {
	@Test(groups = {"functionaltest","smoketesting"})
	public void testCase1()
	{
		System.out.println("Test Case 1");
	}
	@Test(groups = {"regressiontesting","smoketesting"})
	public void testCase2()
	{
		System.out.println("Test Case 2");
	}
	@Test(groups = {"sanitytesting","regressiontesting"})
	public void testCase3()
	{
		System.out.println("Testing in groups Test Case 3");
	}


}