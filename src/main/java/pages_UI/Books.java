package pages_UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_Base.Base_Class;

/* 
 * define each element on page using @FindBy(page factory)
 * Define each webelement as public and static
 * Extends to Base class to initiliaze the driver
 * create constructor to load the wenelements
 * initiate all webelements inside constuctore using pagefactory.
 * init methos with object creation then all webelement values will initilize when the browser initilize*/
public class Books extends Base_Class {
	@FindBy(xpath="//h5[contains(text(),'Book')]") public static WebElement BookStorePagelink;
	@FindBy(id="login") public static WebElement Button_Login;
	@FindBy(id="userName") public static WebElement Txt_UserName;
	@FindBy(id="password") public static WebElement Txt_Password;
	@FindBy(id="login") public static WebElement Button_Signin;
	@FindBy(id="userName-value") public static WebElement Lbl_UserName;
	
public Books() {
	PageFactory.initElements(driver, this); 
}
}
