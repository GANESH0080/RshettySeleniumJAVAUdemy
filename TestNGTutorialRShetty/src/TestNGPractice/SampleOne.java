package TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SampleOne {

	// @Test is the annotation in TestNG
	// Only @Test annotation methods are executed
	@Test(priority = 0)
	// In TestNG, TestNG itself as compiler so no need of any main method
	// In TextNG everything is in method only
	@Parameters({ "URL" })
	public void methodOneSameOne(String appliURL)
	{
		System.out.println("SampleOne class Method 1");
		System.out.println(appliURL);

	}
	
	
	@Test(priority =-1)
	public void sampleTwo()
	{
		System.out.println("SampleOne class Method 2");

	}
	
	@Test
	public void method()
	{
		System.out.println("SampleOne class Method 3");

	}
	
	@Test
	public void smith()
	{
		System.out.println("smith");

	}
	
	@Test(priority =-1, dependsOnMethods = {"smith"})
	public void ganesh()
	{
		System.out.println("Ganesh");

	}
	
	@Test(priority = 0)
	public void harshal()
	{
		System.out.println("Harshal");

	}
	

}
