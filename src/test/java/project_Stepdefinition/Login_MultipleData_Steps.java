package project_Stepdefinition;

import io.cucumber.java.en.*;
import pages_Methods.Books_Methods;

public class Login_MultipleData_Steps {

	Books_Methods method=new Books_Methods();
	@When("user enters username from datatable {string}")
	public void user_enters_username_from_datatable(String uname) {
	    method.EnterUsername(uname);
	}
	@When("user enters password from datatable {string}")
	public void user_enters_password_from_datatable(String upass) {
	    method.EnterPassword(upass);
	}
	
}
