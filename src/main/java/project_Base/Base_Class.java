package project_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import project_Driver.SelectDrivers;
import project_Utilities.All_Constants;

public class Base_Class {

	public static WebDriver driver; // selenium java provided this //its commaon webdriver
	public static Properties prop;//can use this webdriver,properties in the entire project given by selenium
	
	public static void Initialization() { //initilazing the property file i,e
		//to access these method name by using class name u have to keept static before every method
		prop=new Properties();
		try {
			FileInputStream fileInput=new FileInputStream(All_Constants.PropertirsFilePathg);//to open pirticular file use fileinput stream
			//it will get the details of browser,url 
		//load this file 
			prop.load(fileInput);
		
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		String browser=prop.getProperty("browser");//will get the value from my_config1.propertiy file as string variable
		//send this browser value to selectdriver.java class
		SelectDrivers.driverInitialize(browser);
		
	}
	public static void insertURL() { //to access these method name by using class name u have to keept static before every method
		
		//will vet the url from my_config1.propertiy file 
		driver.get(prop.getProperty("url")); //getting url value from my_config1.propertiy file
	}
	public static void tearDown() {
		//to access these method name by using class name u have to keept static before every method
		//no need to create object for thi smethod
		driver.quit();
	}
}
