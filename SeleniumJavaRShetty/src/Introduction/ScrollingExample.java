package Introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Created object as js Using JavascriptExecutor mechanism and casting driver 
		JavascriptExecutor js = (JavascriptExecutor)d;
		//Using js object scroll the page till particular cordinator
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		// Scroll the Webtable using DOM (Document) and Query Selector
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		// Try to getting count of amount column
		// Created CSSSelector using parent -child
		// Parent is ".tableFixHead" then Space and
		// 4 th column all values so define nth , nthe means all values , child[4] means 4th column and td means child tagname
		List<WebElement> data = d.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		System.out.println("Total size is: " +" " +data.size());
		
		
		int sum =0;
		
		for(WebElement e : data)
		{
			int gettingValue = Integer.parseInt(e.getText());  
			System.out.println("Original Values :" +" " +gettingValue);
			sum = sum+gettingValue;
			
		}
		System.out.println("Sum after adding : " +" " +sum);
		
			String totalvalue = d.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
			System.out.println("Total values after spliting:" +" "+totalvalue);
			
			int value = Integer.parseInt(totalvalue);  
			
			Assert.assertEquals(sum,value);
		}
}
