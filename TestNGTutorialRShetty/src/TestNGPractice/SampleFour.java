package TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = { "ClassTest1" })
public class SampleFour {
	@Parameters({"URL"})
	@Test(priority = -1, dependsOnMethods = {"oneshivshambho"})
	public void shivshambho(String aURL) {
		System.out.println("Shivshambho");
		
		System.out.println(aURL);
	}

	@Test(priority = 0, enabled = false)
	public void royal() {
		System.out.println("Royal");

	}

	@Test
	public void sangharsh() {
		System.out.println("Sangharsh");

	}

	@Test(priority = 0)
	public void mauli() {
		System.out.println("mauli");

	}

	@Test(priority = 0)
	public void ekta() {
		System.out.println("Ekta");

	}

	@Test
	public void badboys() {
		System.out.println("Badboys");
	}

	public void oneshivshambho() {
		System.out.println("-1 priority methodOneSameOne");

	}

}
