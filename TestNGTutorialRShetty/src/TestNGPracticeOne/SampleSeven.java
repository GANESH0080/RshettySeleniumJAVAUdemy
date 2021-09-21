package TestNGPracticeOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleSeven {

	@Test(priority = 6, dependsOnMethods = { "ross" })
	public void tera() {
		System.out.println("tera");
	}

	@Parameters({ "URL" })
	@Test
	public void era(String applicationURL) {
		System.out.println("era");
		System.out.println(applicationURL);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@Test(priority = 6, dependsOnMethods = { "tera" })
	public void pyara() {
		System.out.println("pyara");
	}

	@Test(priority = 9, groups = { "testing" })
	public void ross() {
		System.out.println("ross");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
}
