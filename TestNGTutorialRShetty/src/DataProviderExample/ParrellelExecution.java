package DataProviderExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParrellelExecution {
	@Test(priority = 6)
	public void tera() {
		System.out.println("tera");
	}

	
	@Test
	public void era() {
		System.out.println("era");
	
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test 1");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite 1");
	}

	@Test(priority = 6)
	public void pyara() {
		System.out.println("pyara");
	}

	@Test
	public void ross() {
		System.out.println("ross");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method 1");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class 1");
	}
}