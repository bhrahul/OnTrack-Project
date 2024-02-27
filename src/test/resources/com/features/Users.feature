Feature: Users Page Functionality

  Background: 
    Given User has already logged in to application for the users page
      | username          | password    |
      | admin@ontrack.com | Admin@12345 |


  Scenario: Users 1. validate that user is on Users page url
    When user should be click on Users at sidebar menu
    Then "https://beta.cisin.com:4991/user_roles/67" user should be on Users page url
    
    Scenario: users 2. Validate user should be able to add title for staff title widget for the user
 When user should be able to click on Settings for the user
 And  user should be able to click on add title button in staff title widget for the user
 And  user should enter the title in add title popup of staff title widget for the user"Automate Admin"
 Then user should be able to see the title on staff title widget for the user"Automate Admin"
    
 Scenario: users 3. user should be able to add user in the user page
When user should be click on Users at sidebar menu 
And user should be click on add user button in the user page 
 And user should be enter fields for adding user in the user page 
 |fullname|title|bdate|role|email|sdate|
 |Automate Test Admin|Automate Admin|February 22, 2024|User|Automate@yopmail.com|February 22, 2024|
 Then user should be able to see the user in the user page"Automate Test Admin"
    
  Scenario: users 4. Validate that user is able to edit the Users info Succesfully
    When user should be click on Users at sidebar menu
    And user able to search the user "Automate Test Admin"
    And user should be click on Automate Test Admin user
    And user click on edit button
    And user clear the filed and enter the updates values in the fields
      |  Email                    |
      |  admin77@mailinator.com |
    And user click on update button at edit user popup
    Then user should be able to see update email"admin77@mailinator.com"
  
  Scenario: users 5. user is able to create company in the user contact page 
  And user should be click on Users at sidebar menu
  And user able to search the user "Test admin"
  And user is able to add company in the user contact page"Test Company"
  Then user should be able to see the company in the user contact page"Test Company"
  
  Scenario: users 6. user should be able to see the staff member in the details tab of the company
  When user should be able to select company in the company page for the user
  And  user should be clicked on Details Tab for the user
  Then staff member details should be displayed on staff detail section for the user"Test admin"
  
  
  
  
  Scenario: users 7. Validate that user is able to Create Template at Template page of task module for the user
    When user should be click on Tasks at sidebar menu for the user page
    And user should be click on tasks template tab for the user
    And user should be click on create template button for the user
    And user should be enter the "QA Automation Template" in the name field at add task template pop up for the user
    And user should be click on add button of task template popup for the user
    Then user should be able to see the template "Qa automation template" at template page for the user
    And user should be able to see valdation message of created template for the user"Task Template was created successfully."
    
  
  
  
   Scenario: users 8. User should be able to create task in the tasks reocurring page for the user page
    When user should be click on Tasks at sidebar menu for the user page
    And user should be able to click on tasks reoccurring tab for the user page
    And user should be able to click on add task button in the tasks reoccuring page for the user page
    And user should be enter all fields of add task popup for the user page
    |task template| taskname|assign|client| repeattask |date|
      |QA Automation Template| Important Work |Test admin|Test Company|         1 |February 29, 2024|
    Then user should see the task in the company of tasks reoccuring page for the page"Important Work"
    
  
    
  Scenario: users 9. user should be able to see the Recurring task in the user page.
   When user should be click on Users at sidebar menu
   And user should be able to click user in the user page
   Then user should be able to see recurring task in the user page"Important Work"
  
   
   Scenario: users 10. User should be able to update fields at recurring tab in the  company task tab for the users
   	When user should be click on Users at sidebar menu
   	And user should be able to click user in the user page
   	And user should be able to click on task of the company at users page Important Task
   And User should be able to update fields at recurring tab in the  company task tab for the users
     | taskname            |
     | Very Important Work |
   Then user should be able to see the task recurring tab in the  company task tab for the users"Very Important Work"
   
    Scenario: users 11. User should be able to edit fields at recurring tab in the  company task tab for the users
   When user should be click on Users at sidebar menu
   	And user should be able to click user in the user page
   	And user should be able to click on task of the company at users page Important Task
   	And user should be able to click on recurring tab of the task tab
   	And User should be able to edit fields in the edit task popup at recurring tab in the  company task tab for the users"Very very Important Work"
    Then user should be able to see the updated task in the task of the company at tasks reoccurring page for the users"Very very Important Work"

  Scenario: users 12. User should be able to delete task at recurring tab in the  company task tab for the users
    When user should be click on Users at sidebar menu
   	And user should be able to click user in the user page
   	And user should be able to click on task of the company at users page Important Task
   	And user should be able to click on recurring tab of the task tab
   	And User should be able to delete task at recurring tab in the  company task tab for the users
   
   	Scenario: users 13. user should be able to delete company in the user page
  When user should be click on Users at sidebar menu
  And user able to search the user "Test admin"
  And user should be able to delete company in the user page
  
  
   Scenario: users  14. user should be able to delete user in the user page for task
  When user should be click on Users at sidebar menu 
  And user should be able to select user in the user for the user"Automate Test Admin"
  And user should be click on edit button in the user page for the user
  And user should be delete the user in the user page for the user
  
  Scenario: users 15. User should be able to delete title for staff title widget for the user
 When user should be able to click on Settings for the user
 And 	User should be able to delete title in staff title widget for the user
 Then user should be able to delete contact title successfully in the staff title widget for the user"Title was successfully deleted."
 
 Scenario: users 16. Validate that user is able to Delete the template from delete button which is inside the template for the user
    When user should be click on Tasks at sidebar menu for the user page
    And user should be click on tasks template tab for the user
    And user should click on QA Automation Template link for the user
    And user should click on delete button at the QA Automation Template Page to delete the template for the user
    Then user should able to delete QA Automation Template Successfully for the user"Task Template was deleted successfully."
 
   	
   Scenario: users 17. user should be able to delete the company in the company page
  When user should be able to delete the company in the company page
  Then user should be able to delete compnay successfully"Company was successfully deleted."
  
  Scenario: users 18. vlaidate user should be logout the application
  When user should be logout the application
  Then user should be on application login page
 