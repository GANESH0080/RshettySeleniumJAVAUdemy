package Introduction;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		d.findElement(By.cssSelector(".blinkingText")).click();

		// To get the total windows or set of windows
		Set<String> handle = d.getWindowHandles();

		// Using Iterator interface we can Iterate the Windows
		Iterator<String> it = handle.iterator();
		// Control will go to Parent or first window or 0th index
		String parentID = it.next();
		// Control will go to Parent or first window or 1st index
		String childID = it.next();

		// Switching to Child window
		d.switchTo().window(childID);

		String emailID = d.findElement(By.xpath("//*[text()='mentor@rahulshettyacademy.com']")).getText();
		System.out.println(emailID);

		// Getting the full text
		String fulltext = d.findElement(By.cssSelector("p.im-para.red")).getText();
		// Printing the Full text
		System.out.println(fulltext);

		//Creating array and storing splited text
		String[] Splited = fulltext.split("at", 2);

		// Created another arrayc and storying trimed and whitespaces splited 1st index text in str
		String[] str = Splited[1].trim().split(" ");

		// Printing the oth index string 
		System.out.println(str[0]);

		// Switching to Parent window.
		d.switchTo().window(parentID);
		d.findElement(By.name("username")).sendKeys(emailID);

	}

}
