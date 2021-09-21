package TestNGPractice;


import org.testng.annotations.Test;

public class SampleTwo {

	@Test(priority =-1)
	public void methodOneSameOne()
	{
		System.out.println("SampleTwo class Method 1");

	}
	
	@Test(priority = 0, groups={"smoke"})
	public void sampleTwoMethod2()
	{
		System.out.println("SampleTwo class Method 1");

	}
	
	@Test
	public void salunkhe()
	{
		System.out.println("Salunkhe");

	}
	
	
	
	@Test(priority =-1)
	public void paisa()
	{
		System.out.println("Paisa");

	}
	
	@Test(priority = 0)
	public void babul()
	{
		System.out.println("Babul");

	}
	
	@Test
	public void marshal()
	{
		System.out.println("Marshal");

	}
	
}
