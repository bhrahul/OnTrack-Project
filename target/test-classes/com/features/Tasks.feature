Feature: Tasks Page Functionality

  Background: 
    Given User has already logged in to application for the tasks page
      | username          | password    |
      | admin@ontrack.com | Admin@12345 |
    And User is on Companies page url "https://beta.cisin.com:4991/" for the tasks page

  Scenario: Tasks 1. validate at user is on Tasks page url
    When user should be click on Tasks at sidebar menu
    Then "https://beta.cisin.com:4991/tasks" user should be on Task page url

  Scenario: Tasks 2. Validate that user is on Template page of Task Module
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    Then "https://beta.cisin.com:4991/task_templates" user should be on Template page of task module url
    
  
  Scenario: Task 3. Validate that user is able to Create Template at Template page of task module
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should be click on create template button
    And user should be enter the "QA Automation Template" in the name field at add task template pop up
    And user should be click on add button of task template popup
    Then user should be able to see the template "Qa automation template" at template page
    And user should be able to see valdation message of created template"Task Template was created successfully."
    
     Scenario: Tasks 4. user should be able to add sections in the task page
 	 When user should be click on Tasks at sidebar menu
  	And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And  user should be able to add sections in the task page"TASK01"
  Then Sections should be displayed on task page"TASK01"
  And user should be able to create Section successfuly"Section was successfuly created."
  
   Scenario: Tasks 6. user should be able to add sections in the task page
 	 When user should be click on Tasks at sidebar menu
  	And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And  user should be able to add sub task in the task page"TASK01-01"
  Then user should be able to see subtask in a task on task page"TASK01-01"
  And user should be able to create sub task successfuly"Sub Task was successfully created."
  
  Scenario: Tasks 7. user should be able to update sub task in the task page
  When user should be click on Tasks at sidebar menu
  And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And user should be able to update sub task"Important Work"
  Then user shoule be able to update sub task successfully"Sub Task was successfully updated."

  Scenario: Tasks 8. Validate that user is able to create the section inside the template
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should click on QA Automation Template link
    And user should click on add section button
    And user should be enter the "QA One" in the name field at add section pop up
    And user should be click on add button of create section popup
    Then user should be able to see the section "QA One" inside the created template page

  Scenario: Tasks 9. Validate that user is able to Delete the template from delete button which is inside the template
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should click on QA Automation Template link
    And user should click on delete button at the QA Automation Template Page to delete the template
    Then user should able to delete QA Automation Template Successfully"Task Template was deleted successfully."

  Scenario: Tasks 10. validate at user is on tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    Then "https://beta.cisin.com:4991/recurring_task_index" user should be on Task reoccuring page url

  Scenario: Tasks 11. user should be able to see add task popup in the tasks reoccuring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    Then user should be able to see add task popup in the tasks reoccuring page

  Scenario: Tasks 12. User should see an validation message on task name field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on task name field "Task name can't be blank."

  Scenario: Tasks 13. User should see an validation message on Asigned To field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on Asigned To field "Assigned to can't be blank"

  Scenario: Tasks 14. User should see an validation message on client field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on client field "Client must exist"

  Scenario: Tasks 15. User should see an validation message on start date field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on start date field "Start date can't be blank."

  Scenario: Tasks 16. User should be able to close  add task popup in the tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on close icon at add task popup
    Then user should be able to close  add task popup successfully in the tasks reocurring page
    
   Scenario: Tasks 17. user should be able to see the company in the task reocurring tab after adding company in the user at the user page.
   When user should be click on Users at sidebar menu for the task page
   And user is able to add company in the user contact page for the task page"Test Company"
   And user should be click on Tasks at sidebar menu
   And user should be able to click on tasks reoccurring tab
   Then user should be able to see the company in the task reocurring tab after add company in the user at the user page."Test Company"
    

  Scenario: Tasks 18. User should be able to search company in the tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to search company in the tasks reocurring page"Test Company"
    Then user should be able to see the company in the tasks reocurring page"Test Company"
    
 
 Scenario: Tasks 19. Validate that user is able to Create Template at Template page of task module
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should be click on create template button
    And user should be enter the "Qa automation template" in the name field at add task template pop up
    And user should be click on add button of task template popup
    Then user should be able to see the template "Qa automation template" at template page
    And user should be able to see valdation message of created template"Task Template was created successfully."
    
   
    
     Scenario: Tasks 20. User should be able to create task in the tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be enter all fields of add task popup
      |task template| taskname|assign|client| repeattask |date|
      |Qa automation template| Important Work |Test admin|Test Company|         1 |February 29, 2024|
    Then user should see the task in the company of tasks reoccuring page"Important Work"
   

  Scenario: Tasks 21. User should be able to redirect to recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    Then user should be see the company name in the company task page

  Scenario: Tasks 22. User should be able to update fields at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And User should be able to update fields at recurring tab in the  company task tab
      | taskname            |template|date|
      | Very Important Work |Qa automation template|February 28, 2024|
   Then user should be able to see the task recurring tab in the  company task tab"Very Important Work"
   And user should be able to update recurring task successfully"Task was successfully updated."

  Scenario: Tasks 23. User should be able to search task by filter at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be enter all fields of add task popup for filter
      |task template| taskname|assign|client| repeattask |date|
      |Qa automation template| Important Work |Test admin|Test Company|         1 |February 29, 2024|
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And user should be able to clcik on task reoccurring tab at company task tab
    And User should be able to search task by filter at recurring tab in the  company task tab
    | taskname|assign|
    | Important Work  |Test admin|
    Then user should be able to see the filtered task in the task of the company at tasks reoccurring page

  Scenario: 24. User should be able to edit fields at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And user should be able to clcik on task reoccurring tab at company task tab
    And User should be able to edit fields in the edit task popup at recurring tab in the  company task tab"Very very Important Work"
    Then user should be able to see the updated task in the task of the company at tasks reoccurring page

  Scenario: 25. User should be able to delete task at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And user should be able to clcik on task reoccurring tab at company task tab
    And User should be able to delete task at recurring tab in the  company task tab
    
    
   	Scenario: 26. user should be able to create task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Testing 201|Test Company|1|February 15, 2024|
  Then user should be see the task in the tasks page for the task page"Task12"
  
    
    Scenario: 27. user should be able to see users today task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Testing 201"
    Then user should be able to see users today task count at My task tab"1"
    
    Scenario: 29. user should be able to see users today task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
   And user should be able to select assign user at my task tab"Testing 201"
   Then user should be able to see users today task count after the delete task at My task tab"0"
   
 Scenario: 30. user should be able to create week task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Testing 201|Test Company|1|February 15, 2024|
  Then user should be see the task in the tasks page for the week task page"Task12"
    
    
    
    
    Scenario: 31. user should be able to see users week task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Testing 201"
    Then user should be able to see users week task count at My task tab"1"
    
    Scenario: 32. user should be able to see users week task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
   And user should be able to select assign user at my task tab"Testing 201"
   Then user should be able to see users week task count after the delete task at My task tab"0"
   
   Scenario: 33. user should be able to create Next week task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Testing 201|Test Company|1|February 16, 2024|
  Then user should be see the task in the tasks page for the next week task page"Task12"
    
    
    
    
    Scenario: 34. user should be able to see users next week task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Testing 201"
    Then user should be able to see users next week task count at My task tab"1"
    
    Scenario: 35. user should be able to see users next week task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
    And user should be able to select assign user at my task tab"Testing 201"
   Then user should be able to see users next week task count after the delete task at My task tab"0"
   
   
   Scenario: 36. user should be able to create later week task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Testing 201|Test Company|1|February 25, 2024|
  Then user should be see the task in the tasks page for the later week task page"Task12"
    
    
    
    
    Scenario: 37. user should be able to see users later week task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Testing 201"
    Then user should be able to see users later week task count at My task tab"1"
    
    Scenario: 38. user should be able to see users later week task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
   And user should be able to select assign user at my task tab"Testing 201"
   Then user should be able to see users later week task count after the delete task at My task tab"0"
   
		Scenario: Tasks 39. Validate that user is able to Delete the template from delete button which is inside the template
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should click on QA Automation Template link
    And user should click on delete button at the QA Automation Template Page to delete the template
    Then user should able to delete QA Automation Template Successfully"Task Template was deleted successfully."
   

