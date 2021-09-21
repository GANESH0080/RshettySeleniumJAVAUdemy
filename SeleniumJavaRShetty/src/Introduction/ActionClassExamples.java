package Introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionClassExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		
		//Created MOVE variable and store element into that
		//Create Xpath using CSS Selector	
		WebElement move = d.findElement(By.cssSelector("a#nav-link-accountList"));
		//d.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		//d.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
				
		// Created object using Actions class
		Actions act = new Actions(d);
		//used move variable here
		
		// Mouseover specific element using MoveToElement 
		// Build is saying Script is ready to execute
		// Perform is saying please execute the script
		// Contextclick is Rightclicking on specific element
	    act.moveToElement(move).contextClick().build().perform();
	    
	    
	    // Entering text in capital leeter using KeyDown Method 
	    // Using KeyUp we are releasing the Shift key or else every text will be in Capital letter only
	    act.moveToElement(d.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").keyUp(Keys.SHIFT).build().perform();
	    Thread.sleep(2000);
	    d.findElement(By.cssSelector("input#twotabsearchtextbox")).clear();
	    
	    
	    // Entering new text and duuble Clicking 
        act.moveToElement(d.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().sendKeys("hello").doubleClick().build().perform();
	   
		
      
 	   
        
		
		
		

	}

}
