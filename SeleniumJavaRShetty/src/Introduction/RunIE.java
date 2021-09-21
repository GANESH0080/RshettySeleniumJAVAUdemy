package Introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RunIE {
	static String actualtittle;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\IEBrowser\\IEDriverServer.exe");
		// Creating object to drive the TC in Internet Explorer
		WebDriver driver = new InternetExplorerDriver();

		try {
			driver.get("https://www.google.ro/?safe=active&ssui=on");
		} catch (Exception e) {

			// Printing the tittle of the page
			System.out.println(driver.getTitle());
		}
		if (actualtittle == "Google") {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
