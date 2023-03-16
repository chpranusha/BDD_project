Feature: LOgin Valdation

Scenario: Login Functionlaity with valid credentials
Given user opens the browser
And user enter the url
And user clicks on Login button
When user enters username "prc"
And user enters password "Prc@123456"
And user clicks on Sign in button
Then user should get successfully loggedin
And browser should get closed


