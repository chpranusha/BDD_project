Feature:

Scenario Outline: Login Functionlaity with valid credentials
Given user opens the browser
And user enter the url
And user clicks on Login button
When user enters username from datatable "<username>"
And user enters password from datatable "<password>"
And user clicks on Sign in button
Then user should get successfully loggedin
And browser should get closed

Examples:
|	username   |	password		|
|	prc			 	 |	Prc@123466	|
|	prc2			 |	Prc@123455	|
|	prc3			 |	Prc@ 				|
|	prc4			 |	Prc@123444	|		
