package Selenium4Examples;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleRelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/angularpractice");
		
		// Getting the label which is avaialble ABOVE the Name textfield
		// Getting using ABOVE locator technique
		// Storing the Name textfield in WebElement variable
		WebElement NameTextField = d.findElement(By.name("name"));
		// Syntax : diver.findlement(withTagName(what you find).above(Webelement on which you want to find)
	    System.out.println("Field name is :" +d.findElement(withTagName("label").above(NameTextField)).getText());
	    
	    
	    // Using BELOW technique, We are clicking on specific field which is checkbox
	    d.findElement(withTagName("input").below(d.findElement(By.id("exampleInputPassword1")))).click();
	    
	    
	    // Getting the DOB text using BELOW locator technique
	    System.out.println("Field name is :" +d.findElement(withTagName("label").below(d.findElement(By.cssSelector("div[class='form-check form-check-inline']")))).getText());
	   
	    
	    //Using DOB locator
	    WebElement DOB = d.findElement(withTagName("label").below(d.findElement(By.cssSelector("div[class='form-check form-check-inline']"))));
	    //We are trying to click the BELOW locator                                                                                   
	    d.findElement(withTagName("input").below(DOB)).sendKeys("10/02/2020");
	    
	    
	    
	    Thread.sleep(4000);
	    // Creating webElement
	    WebElement IceText = d.findElement(By.xpath("//*[text()='Check me out if you Love IceCreams!']"));
	    // Clicking on specific field which is left of IceText webelement
	    d.findElement(withTagName("input").toLeftOf(IceText)).click();
	    
	    
	    
	    
	    
	    Thread.sleep(2000);
	    // Creating webElement
	    WebElement checkbox1 = d.findElement(By.id("inlineRadio1"));
	    // Clicking on specific field which is left of IceText webelement
	    d.findElement(withTagName("input").toRightOf(checkbox1)).click();
	   
		
		
	}

}
