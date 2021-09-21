package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssgnment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		// checking 1st Checkbox
		   d.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		// Printing the boolean value and verifying the checkbox is selected on not
		   System.out.println(d.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		// Unchecking then same first checkbox
	       d.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		// Printing the boolean value and verifying the checkbox is selected on not
		    System.out.println(d.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		// Storing all the checkox in List
		List<WebElement> size = d.findElements(By.xpath("//input[@type='checkbox']"));
		
		int totalsize = size.size();
		// Printing the count of checkbox
		System.out.println("Total size is:" +" " +totalsize);
		
	

}
}