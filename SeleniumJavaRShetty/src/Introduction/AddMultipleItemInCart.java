package Introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleItemInCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		d.manage().window().maximize();
		Thread.sleep(2000);

	    // Added variable for stopping the loop once all array element added in cart
		int k = 0;
		
		// Created an array and storing the values in that
		String products[] = {"Cauliflower","Brocolli","Cucumber"};
		//Printing arrays length
		System.out.println("Length of Product array is:" + " " + products.length);

		// Storing all the product on the page in List
		List<WebElement> totalProducts = d.findElements(By.cssSelector("h4.product-name"));
		//Printing the size of total product on the page 
		System.out.println("Total product on the page is:" + " " + totalProducts.size());
		
	
		// Interate the total products on page using for loop
		for (int j = 0; j < totalProducts.size(); j++) {
			
			// Get the text of every product and storing into the variable
			String exactproduct = totalProducts.get(j).getText();
			
			// You can split the string direct using above statement also
			//String[] eproduct = totalProducts.get(j).getText().split("-");
			
			//Printing product which is on the page
			System.out.println("Printing the exact name of product:" + " " + exactproduct);
			
			
			// We are getting product name as "Product name - 1 kg" and we are comparing with only product name which is in array
			// We can split the product which we get from page	
			// Created Array and saving the splited string in STRING
			String splitData[] = exactproduct.split(" ", 2);
			String SplitProduct = (splitData[0]);
			System.out.println(SplitProduct);
		      		
		
			// Converting above array into arraylist for easy search
			List productArrayList = Arrays.asList(products);
			
	
        		Thread.sleep(2000);
				// Checking application product and array prodyct is same or not
				// If same then clicking on ADD CART button of that specific product
				if (productArrayList.contains(SplitProduct)) {
					Thread.sleep(1000);
					// Incrementing with one once one element added in cart
					k++;
					System.out.println(k);
					Thread.sleep(1000);
					// If same then clicking on ADD CART button of that specific product
					
					//*[text()='ADD TO CART'] - We can use this Xpath also but sometime script will fail because ADD TO CART button text will change
					// as Added
					// So we created customisbale Xpath with Parent child traversing 
					// //div[@class='product-action'] and /button is child xpath
					d.findElements(By.xpath("//div[@class='product-action']/button")).get(j).click();
				
					// If all array element added in cart then 
					if(k==products.length)
					
					{
                    // Stoping the execution
					break;
				}
					
				}

			
	}
		}
	}
	
	
