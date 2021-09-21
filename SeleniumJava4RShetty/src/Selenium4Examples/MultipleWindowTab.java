package Selenium4Examples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowTab {

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

		//Clicking on LOGIN button of newly opened window
		d.findElement(By.cssSelector("a[class='theme-btn register-btn']")).click();
		
		
		// Using this program you can not able to switch back to parent window
		// for that we have to used window handling concept
		// so using window id, we can switch to specific window
		// Please Refer MultipleWindowTabEX program
		
		}
	}

