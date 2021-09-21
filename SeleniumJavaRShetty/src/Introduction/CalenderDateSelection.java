package Introduction;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDateSelection {
	

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.path2usa.com/travel-companions");
		
		
		
	    // Cl;icking on Calender field
		d.findElement(By.id("travel_date")).click();
		
		// Saving month & year in variable 
		// Created CSSSelector using Parent - Child 
		String monthYear = d.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText();
		//Printing Month & year
		System.out.println("Initial Month & year" +" " +monthYear);
		
		// If Month Yes is equal to "September then false because og negation
		// If Month Yes is not equal to "September then true because of negation
		while(!monthYear.contains("September"))
		{
			Thread.sleep(2000);
			// Clicking on this link when above is true
			d.findElement(By.cssSelector("[class ='datepicker-days'] th[class='next']")).click();
            
			//Getting updated text and saving into the variable
			String abc = d.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
			
			
			monthYear =abc ;
			
			System.out.println("Updated month and Year is" +" "+monthYear);
		}
		
		// One More Method
		
		/*d.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September");
		while(!d.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September"))
		{
			Thread.sleep(2000);
			d.findElement(By.cssSelector("[class ='datepicker-days'] th[class='next']")).click();
			
			
		}*/
		
		
		//Trying to Select 10th September
        // Saving all the dates in LIST
		List<WebElement> dates = d.findElements(By.cssSelector(".day"));
		// Printing total dates in List
		System.out.println(dates.size());
		
		// Loogping all the dates and storing into the day variable
		for (WebElement day : dates)
		{
			// Printing the dates
			System.out.println(day.getText());
			//Thread.sleep(1000);
			// If date is equal to 30
			if(day.getText().equalsIgnoreCase("10"))
			{
				// Checking the attribute of that date to identifiy the date is enabled or not
				String isdisabled = day.getAttribute("class");
				System.out.println(isdisabled);
				// If attribute value is day means date is enabled then 
				if(isdisabled.contentEquals("day"))
				{
					// Clickng on specific date
				day.click();
				// Ending the loop
				break;
				}
				
				}

			}

		
		}
		
		
		
		
		

	}


