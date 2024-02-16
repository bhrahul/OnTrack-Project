Feature: Login Page Functionality

  Background: 
    Given I am on the OnTrack App Login Page
    
 Scenario: 1.  Check login successfully with valid credentials
    Given I have entered a valid "admin@ontrack.com" and "Admin@12345"
    When I click on Login button
    Then title shhould be "OnTrack"
 	

	
	Scenario: 2. Check Forget Your Password Link is being displayed
	Given I am on the OnTrack App Login Page
	Then forget your password link should be Displayed 