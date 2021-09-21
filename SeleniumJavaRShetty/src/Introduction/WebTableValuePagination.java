package Introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableValuePagination {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

		WebElement nextButton = driver.findElement(By.xpath("//a[@aria-label= 'Next']"));
		boolean notlastpage = true;
		while (notlastpage)

		{
			notlastpage = nextButton.getAttribute("aria-disabled").contentEquals("false");
			System.out.println("Is Lat Page Value is :" +notlastpage);
			List<WebElement> allItems = new ArrayList<WebElement>();

			// Adding all the element in Arraylist
			allItems.addAll(driver.findElements(By.xpath("//tr//td[1]")));

			// Iterating using for
			for (WebElement e1 : allItems) {

				// If get Tomato then trying to get the price
				if (e1.getText().equals("Beans")) {
					System.out.println(e1.findElement(By.xpath("following-sibling::td[1]")).getText());

				}

			}
			if(notlastpage)
			{
			driver.findElement(By.xpath("//a[@aria-label= 'Next']")).click();
			

		}}
		
	}
}
