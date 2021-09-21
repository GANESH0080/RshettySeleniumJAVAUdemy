package TestNGPracticeOne;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SampleSix {

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@Parameters({ "URL","USERNAME", "PASSWORD" })
	@Test
	public void ui(String appURL, String un, String pass) {
		System.out.println("UI");
		System.out.println(appURL);
		System.out.println(un);
		System.out.println(pass);
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}

	@Test(groups = { "smoke" })
	public void two() {
		System.out.println("TWO");
	}

	@Parameters({"COMMONURL"})
	@Test(priority = 6)
	public void three(String commURL) {
		System.out.println("Three");
		System.out.println(commURL);
	}

	@Test(priority = 9)
	public void four() {
		System.out.println("Four");
	}
}
