package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.cogitate.us/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println("URL is :" + " " + url);

		// Actual URL storing in String
		String actualurl = "https://www.cogitate.us/";

		// Verifying currentURL with actual URL and storing in verifiedURL boolen
		// variable
		boolean verifiedURL = url.contentEquals(actualurl);
		// Printing boolean variable
		System.out.println(verifiedURL);

		// Verifying URL with IF
		if (url.contentEquals(actualurl)) {
			System.out.println("URL is same" + " " + url);
		} else {
			System.out.println("URL is not same");
		}
		// Printing the pagesource
		System.out.println(driver.getPageSource());
		// Verify the text avaialble on the page or not using boolean variable
		boolean pagedata = driver.getPageSource().contains("Do you need more information about our products?");

		// Printing boolean value
		System.out.println("Contains using GetPageSource for pagedata: " + " " + pagedata);

		// Waiting 2 miliseconds
		Thread.sleep(2000);

		// Closing the driver
		driver.quit();

	}

}