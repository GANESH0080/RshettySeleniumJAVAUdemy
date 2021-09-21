package Selenium4Examples;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialScreenShot {

   public static void main(String[] args) throws IOException, InterruptedException {
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

		System.out.println("Parent Window ID is:" + parentWindow);
		System.out.println("Child Window ID is:" + childWindow);

		Thread.sleep(1000);
		// How to set focus to specific window
		d.switchTo().window(childWindow);

		System.out.println(d.findElements(By.xpath("//app-home/div/section[2]/div/div[2]/div/div/div[2]/div/h2/a"))
				.get(0).getText());

		// Getting the courseName and storing into the variable
		String courseName = d.findElements(By.xpath("//app-home/div/section[2]/div/div[2]/div/div/div[2]/div/h2/a"))
				.get(0).getText();

		System.out.println("Printing CourseName VIA variable : " + " " + courseName);

		Thread.sleep(2000);

		// Switching to Parent Window
		d.switchTo().window(parentWindow);

		// Created new webelement and storing name element in that
		WebElement name = d.findElement(By.name("name"));

		// Passing the course name in Name textfield
		name.sendKeys(courseName);
		
		// Using FILE class you can create the file variable
		// Using get scrrenshot method trying to taking the screenshot of name element
		// Saving the output as file
		File file = name.getScreenshotAs(OutputType.FILE);
		
		// Using FilUtils Class we are calling the copyFile method 
		// FileUtils class helong us to save the 
		//FileUtils.copyFile(file, new File("C://Users//GaneshSalunkhe//Downloads//screenshot.png"));
		// If you give only file name in destination then your screenshot gets save under the project
		FileUtils.copyFile(file, new File("screenshot.png"));
	}
}
