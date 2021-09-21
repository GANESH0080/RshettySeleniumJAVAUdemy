package Selenium4Examples;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowTabEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();

		// Scenario
		// Go to "https://rahulshettyacademy.com/angularpractice"
		// and fill the name as CourseName which is avaialble
		// "https://rahulshettyacademy.com/"

		d.get("https://rahulshettyacademy.com/angularpractice");
		// Using below statement we are oppening the new TAB
		// d.switchTo().newWindow(WindowType.TAB);
		// Using below statement we are oppening the new Window
		d.switchTo().newWindow(WindowType.WINDOW);

		d.get("https://rahulshettyacademy.com");
		d.manage().window().maximize();


		Set<String> handle = d.getWindowHandles();
		Iterator<String> it = handle.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println("Parent Window ID is:" +parentWindow);
		System.out.println("Child Window ID is:" +childWindow);
		
		Thread.sleep(1000);
		// How to set focus to specific window
		d.switchTo().window(childWindow);
		
		System.out.println(d.findElements(By.xpath("//app-home/div/section[2]/div/div[2]/div/div/div[2]/div/h2/a"))
				.get(0).getText());
		
		// Getting the courseName and storing into the variable
		String courseName = d.findElements(By.xpath("//app-home/div/section[2]/div/div[2]/div/div/div[2]/div/h2/a"))
				.get(0).getText();
		
		System.out.println("Printing CourseName VIA variable : " +" " +courseName);
		
		Thread.sleep(2000);
		
		//Switching to Parent Window
		d.switchTo().window(parentWindow);
		
		
		//Passwint the course name in Name textfield
		d.findElement(By.name("name")).sendKeys(courseName);
				
				
		
	}

}
