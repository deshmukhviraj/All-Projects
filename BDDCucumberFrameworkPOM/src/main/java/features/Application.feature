Feature: Perfom CRUD operations on Address Book website 

#Scenario: Open Address Book website & Sign up 
#	Given User is already on the TestAddressBook page 
#	When User clicks on the Sign in link 
#	Then the Sign in page is displayed 
#	When User clicks on SignUp link 
#	Then the Sign Up page is displayed 
#	When User enters the Email address and Password on SignUp page
#	And Clicks on the Sign up button 
#	Then User navigates to the Welcome page 
	
Scenario: Sign in and sign out 
	Given User is already on the TestAddressBook page 
	When User clicks on the Sign in link 
	Then the Sign in page is displayed 
	When User enters the Email address and Password on SignIn page 
	And Clicks on the Sign in button 
	Then User navigates to the Welcome page 
	When User clicks on the Sign out link 
	Then the Sign in page is displayed

	