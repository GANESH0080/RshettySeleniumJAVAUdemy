package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(3000);
		// We are writing Xpath as [2] because same page element in 2 different places and I want to select 2nd one
		// Banglore is in Departure dropdown also which is first
		// as well as in Apprival dropdown also which is 2nd 
		// We want to select which is in Arrival dropdawn which is 2nd dropdown
		
		//d.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//Sometime above indexing approch is not considerable thaty time we will use below approch of xpath
		// In below Xpath we are taking paren xpath till //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// After that we are using xpath of that element  //a[@value='BLR'] with you want to select with one spave
		// This is call Parent - Child relationship technique
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		                            
	}

}