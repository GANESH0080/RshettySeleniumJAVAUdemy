package Introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Clicking on the column
		// driver.findElement(By.cssSelector("span[class='sort-icon
		// sort-descending']")).click();
		  driver.findElement(By.xpath("//tr/th[1]")).click();

		// Grab the Size of vegetable column
		List<WebElement> vegtables = driver.findElements(By.xpath("//tr/td[1]"));
		System.out.println(vegtables.size());

		// Grab all the Text from vegetable column
		//Using Map Method we are extracting the text of each element
		List<String> OriginalList = vegtables.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println("Sorted List is : " + " " + OriginalList);

		// Created new List and sorted the existing list
		List<String> SortedList = OriginalList.stream().sorted().collect(Collectors.toList());
		System.out.println(SortedList);

		//Comparing the both lists
		Assert.assertTrue(OriginalList.equals(SortedList));

	}

}
