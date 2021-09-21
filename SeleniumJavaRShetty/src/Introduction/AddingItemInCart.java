package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemInCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> totalProducts = d.findElements(By.cssSelector("h4.product-name"));
		System.out.println(totalProducts.size());
		
		
		
		
		for (int i = 0; i <totalProducts.size() ; i++)
		{
			String exactproduct = totalProducts.get(i).getText();
			if(exactproduct.contains("Cucumber"))
			{
				d.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
				break;
			}
			
			
		}
		
	
		}
		
	}


