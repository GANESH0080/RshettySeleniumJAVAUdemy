package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//If any dropdown has SELECT tag then in Selenium one special class is select to handle that select dropdown
public class StaticDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();

		// We are printing the dropdown values 
		String dropdownvalues = d.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")) .getText();
		  System.out.println("Dropdown values are :" + dropdownvalues);
		  
		 // Storing dropdown xpath in webelement "starticdrp" 
		  WebElement staticdrp = d.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		 
		   // Using Select class we are creating the sel object
		  //Storing all the element in staticdrp webelement
		 Select sel = new Select(staticdrp); 
		 // Value is an attribute of option tag
		 sel.selectByValue("AED");
		 // Verified option is selected or not using getFirstSelectedOption method
		 System.out.println(sel.getFirstSelectedOption().getText());
		 
	
		 // Index in dropdown starting from 0 index 
		 sel.selectByIndex(1);
		 System.out.println(sel.getFirstSelectedOption().getText());
		
		 sel.selectByVisibleText("USD");
		 System.out.println(sel.getFirstSelectedOption().getText());
		 
		// Storing all the dropdown element in AllValues variable
	    // Xpath is a parent xpath of dropdown and then we put tag of child xpath which we want (/option)
		// Used find elements to storing all the element values
		List<WebElement> drp = d
				.findElements(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']/option"));
        
		
		// Printing the size of element
		System.out.println(drp.size());

		//Iterating the values from dropdown (All values stored in drp variable)
		for (WebElement value : drp) {
			if (value.getText().equalsIgnoreCase("AED")) {
				
				value.click();
			}

		}

		// We never use isSeleted method with Dropdown that why its giving false
		boolean isSelected = d.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"))
				.isSelected();
		System.out.println("Dropdown is selected : " + isSelected);
	}

}
