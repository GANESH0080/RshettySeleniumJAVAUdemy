package Introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterProductStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Entering text in search fiels
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");

		// get all the elements in List after entering text in search field
		List<WebElement> veggie = driver.findElements(By.xpath("//tr/td[1]"));

		// Create new list after filtering the above list with condition
		List<WebElement> OGList = veggie.stream().filter(s -> s.getText().contains("Rice"))
				.collect(Collectors.toList());
        
		// Compare both list
		Assert.assertTrue(OGList.equals(veggie));

	}

}
