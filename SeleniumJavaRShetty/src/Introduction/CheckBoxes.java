package Introduction;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		//Using contains technique we are creating the xpath
		d.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		
		
		Thread.sleep(2000);
		//Using CSS selector Regular expression technique we are created the Xpath
		d.findElement(By.cssSelector("input[id*='IndArm']")).click();
		
		
		boolean armyisSelected = d.findElement(By.cssSelector("input[id*='IndArm']")).isSelected();
		System.out.println("Army Checkbox is selected:" +" " +armyisSelected);
		
		
		boolean familyisSelected = d.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected();
		System.out.println("Friends and Family Checkbox is selected:" +" " +familyisSelected);
		
	
	    // Find the common attribute (Type) for all the checkboxes and created Xpath using that attribute 	
		List<WebElement> checkboxsize =  d.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total checkboxes on page" +" " +checkboxsize.size());
		

		//This will print all checkbox values as mentioned below, b'coz your text is tagged with form tag not with input tag:
		//System.out.println(d.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[12]")).getText());
		System.out.println(d.findElement(By.xpath("//div[@id='discount-checkbox']")).getText());
		
		
	}                                        
	}
