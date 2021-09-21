package Introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSpecificDataFromWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		//Clicking on the column for Sorting
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Grab the Size of vegetable column
		List<WebElement> vegtables = driver.findElements(By.xpath("//tr/td[1]"));
		//Printing the Vegetable size
		System.out.println(vegtables.size());

		// Grab all the Text from vegetable column using filter method
		// Using Map Method are getting the price form getPrice method
		// Converted that into list
		List<String> OriginalList = vegtables.stream().filter(s -> s.getText().equals("Rice"))
				.map(s -> getPrice(s))
				.collect(Collectors.toList());

		// Printing the Price 
		OriginalList.forEach(s -> System.out.println(s));

		
	}

	//Created the method to getting the price
	private static String getPrice(WebElement s) {
		// Getting the price using 
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		System.out.println("Price of the Bean is:" +" " +price);
		return price;
	}

}
