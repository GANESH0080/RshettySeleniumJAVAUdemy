package DataProviderExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideTesting {

	@Test(priority = 6)
	public void three() {
		System.out.println("Three");

	}

	@Test(priority = 9, dataProvider = "getData")
	public void four(String un, String pass) {
		System.out.println(un);
		System.out.println(pass);
		System.out.println("Four");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//Created multi dimentional array suing Object class 
		// 3 means how many combinations of data you have to test
		// 2 means how many calues you are going to test 
		// We are testing 3 different combinations of username and password 
		// We are using 2 values Username and password
		Object [] [] data = new Object[3][2];
		
		//First combination is
		data[0][0] ="firstusername" ;
		data[0][1] ="firstpassword" ;
		
		// Second combination is
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		// Third combination
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		//Using below statement we are returning the data
		return data;
		
	}
}
