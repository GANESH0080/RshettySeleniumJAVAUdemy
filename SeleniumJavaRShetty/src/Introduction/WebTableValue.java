package Introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Clicking on the column for Sorting
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Grab the Size of vegetable column
		List<WebElement> vegtables = driver.findElements(By.xpath("//tr/td[1]"));
		// Printing the Vegetable size
		System.out.println(vegtables.size());

		for (WebElement veggie : vegtables) {

			if (veggie.getText().contains("Beans")) {
				System.out.println(veggie.findElement(By.xpath("following-sibling::td[1]")).getText());

			}

			

		}
		
	}

}
