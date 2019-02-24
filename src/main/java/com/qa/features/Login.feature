Feature: Login to OpenSourceCMS Application 

Scenario: Login with User Credentials 

	Given User is in OpenSourceCMS Login Page 
	When User is in LoginPage 
	Then User Enters UserName, Password and Clicks on Login Button 
	Then User Navigates to HomePage
	