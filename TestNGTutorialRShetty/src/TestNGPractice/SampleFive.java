package TestNGPractice;

import org.testng.annotations.Test;

@Test(groups = { "ClassTest2" })
public class SampleFive {
	@Test(priority =-1)
	public void mahape()
	{
		System.out.println("-1 priority methodOneSameOne");

	}
	
	@Test(priority = 0)
	public void vadala()
	{
		System.out.println("0 priority sampleTwoMethod2");

	}
	
	@Test
	public void airoli()
	{
		System.out.println("Blank priority Salunkhe");

	}
	
	@Test(priority = 0)
	public void vashi()
	{
		System.out.println("mauli");

	}
	
	@Test(priority = 0)
	public void nerul()
	{
		System.out.println("Ekta");

	}
	
	@Test
	public void badboys()
	{
		System.out.println("Badboys");
}
}
