package TestNGPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleThree {
	@Test(priority =-1)
	public void jamie()
	{
		System.out.println("-1 priority methodOneSameOne");

	}
	
	@Test(priority = 0)
	public void ashish()
	{
		System.out.println("0 priority sampleTwoMethod2");

	}
	@BeforeTest
	public void beforeExeution() {
		System.out.println("Executed before all the test");
	}
	@Test
	public void john()
	{
		System.out.println("Blank priority Salunkhe");

	}
	
	@Test(priority =-1)
	public void super11()
	{
		System.out.println("Super11");

	}
	
	@Test(priority = 0)
	public void shriganesh()
	{
		System.out.println("0 priority Babul");

	}
	
	@Test
	public void paresh()
	{
		System.out.println("Blank priority Marshal");
}
	
	@Test
	public void super12()
	{
		System.out.println("Super12");
}
	
	@Test
	public void super13()
	{
		System.out.println("Super13");
}
	
}