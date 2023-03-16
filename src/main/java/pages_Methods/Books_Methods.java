package pages_Methods;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import pages_UI.Books;
import project_Base.Base_Class;

/*
 * write actions what ever your performing on ui page 
 * when using ui elements make sure to crete object first then only you can access webelements i,e locators
 * extend base_class for common driver api 
 * i,e initilize browser,maximize,teardown,getting url,browser values from config file */


public class Books_Methods  extends Base_Class
{
	 String checkUsername=null;
	public void OpenBrowser() {
		Base_Class.Initialization();
	}
	public void enterUrl() {
		Base_Class.insertURL();
	}
	public void navigateToBookStoreApp() {
		Books objBooks = new Books();
		//if the element is not clickable at this moment then use javascript executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", Books.BookStorePagelink);
		//Books.BookStorePagelink.click();
	}
	public void clickOnLoginoption() {
		Books.Button_Login.click();
	}
	public void EnterUsername(String username) {
		checkUsername=username;
		Books.Txt_UserName.clear();
		Books.Txt_UserName.sendKeys(username);
	}
	public void EnterPassword(String password) {
		Books.Txt_Password.clear();
		Books.Txt_Password.sendKeys(password);
	}
	public void clickOnSignInButton() {
		Books.Button_Signin.click();
	}
	public void validateLogin() {
		String actualUsername=Books.Lbl_UserName.getText();
		Assert.assertEquals(actualUsername, checkUsername);
		System.out.println("Login is Successful");
	}
	public void closeBrowser() {
		Base_Class.tearDown();
	}
}

