package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		// Storing all the dropdown element in AllValues variable
		// Xpath is a parent xpath of dropdown and then we put tag of child xpath which we want(/a)
		// Used find elements to storing all the element values
		List<WebElement> AllValues = d.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		//Printing the Size of dropdown values
		System.out.println("Size is :" + AllValues.size());

		//Iterating the values from dropdown (All values stored in AllValues variable)
		for (WebElement value : AllValues) {
			
			if (value.getText().equalsIgnoreCase("India")) {

				value.click();

			}

		}

	}
}
