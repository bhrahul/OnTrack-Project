Feature: Users Page Functionality

  Background: 
    Given User has already logged in to application for the users page
      | username          | password    |
      | admin@ontrack.com | Admin@12345 |


  Scenario: 1. validate that user is on Users page url
    When user should be click on Users at sidebar menu
    Then "https://beta.cisin.com:4991/user_roles/23" user should be on Users page url
    
  Scenario: 2. Validate that user is able to edit the Users info Succesfully
    When user should be click on Users at sidebar menu
    And user able to search the user "final check"
    And user should be click on final check user
    And user click on edit button
    And user clear the filed and enter the updates values in the fields
      | Select a Title |  Email                    |
      | QA Automate  |   admin7758@mailinator.com |
    And user click on update button at edit user popup
    Then user should be able to see update email"admin7758@mailinator.com"
    
   
  Scenario: 3. user is able to create company in the user contact page 
  And user should be click on Users at sidebar menu
  And user able to search the user "Test admin"
  And user is able to add company in the user contact page"Test Company"
  Then user should be able to see the company in the user contact page"Test Company"
  
	Scenario: 4. user should be able to delete company in the user page
  When user should be click on Users at sidebar menu
  And user able to search the user "Test admin"
  And user should be able to delete company in the user page
  
  
   Scenario: 5. user should be able to add company in the user page.
   When user should be click on Users at sidebar menu
   And user able to search the user "Test admin"
   And user is able to add company in the user contact page for the task recurring"Test Company"
  Then user should be able to see the company in the user contact page for the task recurring"Test Company"
    
  Scenario: 6. User should be able to create task in the tasks reocurring page for the user page
    When user should be click on Tasks at sidebar menu for the user page
    And user should be able to click on tasks reoccurring tab for the user page
    And user should be able to click on add task button in the tasks reoccuring page for the user page
    And user should be enter all fields of add task popup for the user page
    |task template| taskname|assign|client| repeattask |date|
      |Qa template101| Important Work |Test admin|Test Company|         1 |February 29, 2024|
    Then user should see the task in the company of tasks reoccuring page for the page"Important Work"
    
    
  Scenario: 7. user should be able to see the Recurring task in the user page.
   When user should be click on Users at sidebar menu
   And user should be able to click user in the user page
   Then user should be able to see recurring task in the user page"Important Work"
  
   
   Scenario: 8. User should be able to update fields at recurring tab in the  company task tab for the users
   	When user should be click on Users at sidebar menu
   	And user should be able to click user in the user page
   	And user should be able to click on task of the company at users page Important Task
   And User should be able to update fields at recurring tab in the  company task tab for the users
     | taskname            |
     | Very Important Work |
   Then user should be able to see the task recurring tab in the  company task tab for the users"Very Important Work"
   
    Scenario: 9. User should be able to edit fields at recurring tab in the  company task tab for the users
   When user should be click on Users at sidebar menu
   	And user should be able to click user in the user page
   	And user should be able to click on task of the company at users page Important Task
   	And user should be able to click on recurring tab of the task tab
   	And User should be able to edit fields in the edit task popup at recurring tab in the  company task tab for the users"Very very Important Work"
    Then user should be able to see the updated task in the task of the company at tasks reoccurring page for the users"Very very Important Work"

  Scenario: 10. User should be able to delete task at recurring tab in the  company task tab for the users
    When user should be click on Users at sidebar menu
   	And user should be able to click user in the user page
   	And user should be able to click on task of the company at users page Important Task
   	And user should be able to click on recurring tab of the task tab
   	And User should be able to delete task at recurring tab in the  company task tab for the users
   	
   Scenario: 11. user should be able to delete the company in the company page
  When user should be able to delete the company in the company page
  Then user should be able to delete compnay successfully"Company was successfully deleted."
  
  Scenario: 12. vlaidate user should be logout the application
  When user should be logout the application
  #Then user should be on application login page
 