Feature: Contact Page Functionality

Background: 
    Given User has already logged in to application for contact page
      | username          | password    |
      | admin@ontrack.com | Admin@12345 |
    And User is on Companies page url for contact page "https://beta.cisin.com:4991/" 
    
  Scenario: Contact 1. Contact page tab is clickable
  	When user should be able to click on contact tab
    Then User is on Contact page url "https://beta.cisin.com:4991/contacts"
    
    
   Scenario: Contact 2. Admin Email is displayed
	When user should be able to click on contact tab
	Then Admin Email is displayed
    
    
   Scenario: Conatct 3. Add Contact Button should be displayed
	When user should be able to click on contact tab
	Then Add Contact button should be displayed
   
   Scenario: Conatct 4. Searchbox should be displayed
    When user should be able to click on contact tab
    Then Searchbox field should be displayed
    
   Scenario: Contact 5. Edit Button should be displayed 
    	When user should be able to click on contact tab
   	Then Edit button should be displayed
   	
   Scenario: Contact 6. Contact list should be displayed
 	When user should be able to click on contact tab
    Then Contact list should be displayed 
    
   Scenario: Conatct 7. Contact list should be displayed
   	When user should be able to click on contact tab
    Then Contact list should be displayed 
    
   Scenario: Contact 8. User details should be displayed
    	When user should be able to click on contact tab
    Then User details should be displayed 
    
   Scenario: Contact 9. Upload photo Button should be displayed
   	When user should be able to click on contact tab
   	Then Upload photo button should be displayed
   	
   	Scenario: Contact 10. user should be able to close add contact popup.
   	When user should be able to click on contact tab
   	And  click on add contact button in the contact page
   	Then user should be able to close add contact popup successfully
   
   
   
   Scenario: Contact 11. User should see an validation message for First Name
  	When user should be able to click on contact tab
   	And  click on add contact button in the contact page
   	And User should be clicked on add button in the add contact popup of the contact
  	Then  User should see an validation message for First Name for contact"First name can't be blank."
 
  Scenario: Contact 12. User should see an validation message for Last Name
  	When user should be able to click on contact tab
   	And  click on add contact button in the contact page
  	And User should be clicked on add button in the add contact popup of the contact
 	Then  User should see an validation message for Last Name for contact"Last name can't be blank."
  
  
  Scenario: Contact 13. User should see an validation message for Title Name
	 	When user should be able to click on contact tab
   	And  click on add contact button in the contact page
   	And User should be clicked on add button in the add contact popup of the contact
  	Then  User should see an validation message for Title Name for contact"Title must exist."
  
  Scenario: Contact 14. User should see an validation message for Company Name
 		When user should be able to click on contact tab
   	And  click on add contact button in the contact page
   	And User should be clicked on add button in the add contact popup of the contact
  	Then  User should see an validation message for Company Name for contact"Company ids can't be blank."
  	
  	
  	Scenario: 15. Validate user should be able to add title for contact title widget fot he contact
 When user should be able to click on Settings fot the contact
 And  user should be able to click on add title button in contact title widget for the contact
 And  user should enter the title in add title popup of contact title widget for the contact"Automate Contact"
 Then user should be able to see the title on contact title widget for the contact"Automate Contact"
 
   
   
   Scenario: Contact 16. validate user should be able to add contact in the contact page
   When user should be able to click on contact tab
   And  user should be click on add contact btn in the contact tab
   And user should be able to enter contact details in the contact popup
   |firstname|lastname|email           |phonenumber|company|
  	|Test   |Contact  |Automate@gmail.com|9856321047 |Test Company|
   Then user should be able to see contact in the contact page"Test Contact"
   
   
   
   Scenario: Contact 17. validate user should be able to search contact
   When user should be able to click on contact tab
   And user able to search the contact "Test Contact"
   Then user should be able to see contact in the contact page"Test Contact"
   
   
    Scenario: Contact 18. user should be able to edit contact at add contact popup.
 		When user should be able to click on contact tab
    And user click on edit button for the contact
    And user clear the filed and enter the updates values in the fields for the contacts
      | Select a Title | Email                    |company|
      | Automate Contact  | admin7758@mailinator.com |Test Company|
    And user click on update button at edit contact popup
   Then user should be able to see update contact details"Automate Contact"
 
  Scenario: Contact 19. user should be able to delete contact
  	When user should be able to click on contact tab
    And user click on edit button for the contact
    And click on delete button in the conatct popup
    Then user should be able to delete contact sucessfully"Contact was successfully deleted."
    
    
    Scenario: Contact 20. User should be able to delete title for contact title widget for the contact
 When user should be able to click on Settings fot the contact
 And 	User should be able to delete title in contact title widget for the contact
 Then user should be able to delete contact title successfully in the contact title widget for the contacts"Title was successfully deleted."
    #
    #
   