package Introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSpecificDataFrmTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Clicking on the column for Sorting
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Created list variable as OriginalList
		List<String> OriginalList;

		do {
			// Grab the Size of vegetable column
			List<WebElement> vegtables = driver.findElements(By.xpath("//tr/td[1]"));
			// Grab all the Text from vegetable column using filter method
			// Using Map Method are getting the price form getPrice method
			// Converted that into list
			OriginalList = vegtables.stream().filter(s -> s.getText().equals("Strawberry")).map(s -> getPrice(s))
					.collect(Collectors.toList());
			// Printing the Price
			OriginalList.forEach(s -> System.out.println(s));

			// If Strabeery is found above then size of list is 1
			// If Strawberry not found then size is 0
			// So If not found then clicking on NEXT button
			if (OriginalList.size() < 1) {
				// Going to the next page
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		}
		// On Second page and list start iterating and searching strabery
		while (OriginalList.size() < 1);

	}

	// Created the method to getting the price
	private static String getPrice(WebElement s) {
		// Getting the price using
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		System.out.println("Price of the Bean is:" + " " + price);
		return price;
	}

}
