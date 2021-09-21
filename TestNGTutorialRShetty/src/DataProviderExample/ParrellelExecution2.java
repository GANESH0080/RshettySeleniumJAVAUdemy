package DataProviderExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParrellelExecution2 {
	@Test(priority = 6)
	public void tera2() {
		System.out.println("tera2");
	}

	
	@Test
	public void era2() {
		System.out.println("era2");
	
	}

	@BeforeTest
	public void beforeTest2() {
		System.out.println("Before Test 2");
	}

	@BeforeSuite
	public void beforeSuite2() {
		System.out.println("Before Suite 2");
	}

	@Test(priority = 6)
	public void pyara2() {
		System.out.println("pyara2");
	}

	@Test
	public void ross2() {
		System.out.println("ross2");
	}

	@BeforeMethod
	public void beforemethod2() {
		System.out.println("Before method 2");
	}

	@AfterClass
	public void afterclass2() {
		System.out.println("After class 2");
	}
}