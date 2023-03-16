package project_Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import project_Base.Base_Class;
import project_Utilities.All_Constants;

public class SelectDrivers extends Base_Class
{
	//WebDriver driver; //this is getting from base class 
	@SuppressWarnings("deprecation")
	public static void driverInitialize(String browsername) {
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", All_Constants.ChromeDriverFilePath);
		driver = new ChromeDriver(); //initial the chrome driver for that first use webDriver driver;
	}
		
//		else if(browsername.equals("firefox")){
//				System.setProperty("webdriver.gecko.driver", All_Constants.FirefoxDriverFilePath);
//				DesiredCapabilities cp=DesiredCapabilities.firefox();
//				cp.setCapability("marionette", true);
//				driver = new ChromeDriver(); //initial the chrome driver for that first use webDriver driver;			
//	}
//		else if(browsername.equals("IE")){
//			System.setProperty("webdriver.gecko.driver", All_Constants.IEDriverFilePath);
//			driver = new InternetExplorereDriver(); //initial the chrome driver for that first use webDriver driver;			
//		}
//		else
//			System.out.println("Browser not found");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
}
