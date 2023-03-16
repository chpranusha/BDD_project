package project_Stepdefinition;


import io.cucumber.java.en.*;
import pages_Methods.Books_Methods;

public class LoginValidationSteps {
	
	Books_Methods methods=new Books_Methods();
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
	   methods.OpenBrowser();
	}

	@Given("user enter the url")
	public void user_enter_the_url() {
		methods.enterUrl();
		methods.navigateToBookStoreApp();
	}
	@Given("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    methods.clickOnLoginoption();
	}
	@When("user enters username {string}")
	public void user_enters_username(String uname) {
		methods.EnterUsername(uname);
	  	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    methods.EnterPassword(password);
	}

	@When("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	    methods.clickOnSignInButton();
	}

	@Then("user should get successfully loggedin")
	public void user_should_get_successfully_loggedin() {
	    methods.validateLogin();
	}

	@Then("browser should get closed")
	public void browser_should_get_closed() {
	    methods.closeBrowser();
	}
  //if you miss any step it will show the error in console  as undefined stepdefination 
}
