package Introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkURL {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		// STEPS 1 : Get the url which tideup with link using selenium
		// Using get attribute method we can get the value of link
		// Created css for specific link using regular expression concept
		// rest is avaialable in link so usind rest and * means anything
		String nonBrokenURL = d.findElement(By.cssSelector("a[href*='rest']")).getAttribute("href");
		//Printing the URL
		System.out.println("Non Broken URL is : " +" " +nonBrokenURL);
		
		String brokenURL = d.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		//Printing the URL
		System.out.println("Broken URL is : " +" " +brokenURL);
		
		
		// Creating object for URL class and pass the page non broken url as parameter
		URL nu = new URL(nonBrokenURL);
		
		// Creating object for URL class and pass the page broken url as parameter
		URL bu = new URL(brokenURL);
		
		
		
		//HttpURLConnection is the return type of Openconnection method
		//OpenConnection is the method of URL class
		//HttpURLConnection conn = (HttpURLConnection) nu.openConnection();
		HttpURLConnection conn = (HttpURLConnection)bu.openConnection();
		//Sending request using HEAD method
		conn.setRequestMethod("HEAD");
		conn.connect();
		//Printing the ResponseCode of that URL
		System.out.println(conn.getResponseCode());
		
		
		



		
	}

}
