package HowAccessGlobalValue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AccessGlobalValues {

	public static void main(String args []) throws IOException
	{
		Properties prod = new Properties();
		FileInputStream filesrc = new FileInputStream("D:\\SeleniumWorkspace\\GlobalValuesAccessRShetty\\src\\GlobalData.properties");
	    prod.load(filesrc);
		System.out.println(prod.getProperty("URL"));
		System.out.println(prod.getProperty("browser"));
		prod.setProperty("browser", "firefox");
		System.out.println(prod.getProperty("browser"));
		
		
		FileOutputStream filedest = new FileOutputStream("D:\\SeleniumWorkspace\\GlobalValuesAccessRShetty\\src\\GlobalData.properties");
	
	
		 
		prod.store(filedest, null);
	}
}
