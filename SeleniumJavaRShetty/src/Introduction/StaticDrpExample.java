package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDrpExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		d.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println("Original Passenger are:" +" " +d.findElement(By.id("divpaxinfo")).getText());
		// For-loop for selecting the 4 Adults
		/*
		  for (int i=0;i<4;i++) { d.findElement(By.id("hrefIncAdt")).click(); }		  
		  d.findElement(By.id("btnclosepaxoption")).click();
		  }
		 */
		
		
		// Do-While loop for selecting the 4 Adults
		int i = 0;
		/*
		 do { 
		  d.findElement(By.id("hrefIncAdt")).click(); i++;
		  } while(i<4); { d.findElement(By.id("btnclosepaxoption")).click(); }
		 */

		
		// While loop for selecting the 4 Adults
		while (i < 3) {
			d.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		d.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("Updated Passengers are:" +" " +d.findElement(By.id("divpaxinfo")).getText());
	}
	
	

}
