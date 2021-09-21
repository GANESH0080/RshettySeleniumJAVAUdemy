package Introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://jqueryui.com/droppable/");
		
		int totalframes = d.findElements(By.tagName("iframe")).size();
		System.out.println(totalframes);
		
		//How to switch frame using frame index
		d.switchTo().frame(0);		
		// Using below code we are switching to specific frame
		// We can switch using ID / index / name as above but If all are not available then we use frame xpath
		// d.switchTo().frame(d.findElement(By.cssSelector(".demo-frame")));        
				
		
		WebElement source = d.findElement(By.id("draggable"));

		WebElement target = d.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(d);
		
		act.dragAndDrop(source,target).build().perform();
	
		d.switchTo().defaultContent();
		
		d.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Ganesh");
	}

}
