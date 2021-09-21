package Introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CalenderHandlingandCheckEnabled {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		// Using IF we are validating style value 
		// If Style value contains 1 then element is enabled
		if(d.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Element is enabled");
			Assert.assertTrue(true);
			
		}
		else 
		{
			System.out.println("Element is not enabled");
			Assert.assertTrue(false);
		}
		// Printing the style attribute
		System.out.println("Style attribute value before clicking on dependent field:" +" " +d.findElement(By.id("Div1")).getAttribute("style"));
		
		
		// Clicking on Radio button
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		
        // Again using If condition we are validating element is enabled or not
		if(d.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Element is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	    // Printing the style after elements gets enabled
		System.out.println("Style attribute value after clicking on dependent field:" +" " +d.findElement(By.id("Div1")).getAttribute("style"));
		
		// Clicking on Date field
		d.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(3000);
		// Selecting current date using CSS Selector
		d.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
	}

}
