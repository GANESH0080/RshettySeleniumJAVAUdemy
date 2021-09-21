package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunFirefox {
	// Created actualtittle variable is static because we are trying to access in
	// static method of same class
	// Created this actualtittle as class variable because no need to initialise
	// default value.
	static String actualtittle;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Geckodriver_18\\geckodriver.exe");
		// Creating object to drive the TC in Firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		// Printing the tittle of the page
		System.out.println(driver.getTitle());

		if (actualtittle == "Google") {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
