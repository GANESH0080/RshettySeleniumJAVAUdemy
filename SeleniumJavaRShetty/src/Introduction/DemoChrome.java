package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Using this command we are navigating to specific URL
		driver.navigate().to("https://www.google.com/");
		// Storing url in specific string
		String url = driver.getCurrentUrl();
		// Printing the URL
		System.out.println("URL is :" + " " + url);
		// Printing the current page URL directly
		System.out.println(driver.getCurrentUrl());
		// Using this command we are navigating to specific URL
		// driver.get("https://www.google.com/");

		// Tittle of the current page
		String tittle = driver.getTitle();
		// Printing the tittle
		System.out.println("Tittle of the current page is :" + " " + tittle);
	}

}
