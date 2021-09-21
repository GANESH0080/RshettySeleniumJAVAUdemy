package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		//Clicking on specific radio button
		d.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
		//Verifying Radio button is selected or not
		System.out.println(d.findElement(By.xpath("//input[@value='RoundTrip']")).isSelected());
		
		// Getting total radio buttons on the page and story it into rButtons
		List<WebElement> rButtons =  d.findElements(By.xpath("//input[@type='radio']"));
		// printing the total number of radio buttons on page
		System.out.println(rButtons.size());	
		// Printing radio buttons name
		System.out.println( d.findElement(By.xpath("//div[@id='travelOptions']")).getText());
		Thread.sleep(2000);
		
		// Storing only Trip Radio buttons in rrButtons variable
		List<WebElement> rrButtons =  d.findElements(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td"));
		
		
		//iterating all the trip radio buttons 
		for(WebElement radiob : rrButtons)
		{
			if(radiob.getText().equalsIgnoreCase("One Way"))
			{
				System.out.println(radiob.getText());
				radiob.click();	
			}
		}
	}

}
