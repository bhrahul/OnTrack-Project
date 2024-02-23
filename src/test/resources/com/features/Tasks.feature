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
    
    Scenario: Tasks 4. Validate that user is able to create the section inside the template
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should click on QA Automation Template link
    And user should click on add section button
    And user should be enter the "QA One" in the name field at add section pop up
    And user should be click on add button of create section popup
    Then user should be able to see the section "QA One" inside the created template page
    
   Scenario: Tasks 5. user should be able to add sub task in the task page
 	 When user should be click on Tasks at sidebar menu
  	And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And  user should be able to add sub task in the task page"TASK01-01"
  Then user should be able to see subtask in a task on task page"TASK01-01"
  And user should be able to create sub task successfuly"Sub Task was successfully created."
  
  
  Scenario: Tasks 6. user should be edit subtask of the task in the task page
   When user should be click on Tasks at sidebar menu
  	And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And user should be able to edit sub task in the task page"TASK01-00"
  Then user should be able to see update subtask in a task on task page"TASK01-00"
  
  
    
  Scenario: Tasks 7. user should be delete subtask of the task in the task page
   When user should be click on Tasks at sidebar menu
  And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And user should be able to delete sub task in the task page
  Then user should able delete subtask successfully"Sub Task was successfully deleted."
  
  
  Scenario: Tasks 8. user should be able to update section in the task page
  When user should be click on Tasks at sidebar menu
  And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And user should be able to edit section"QA Two"
  Then user shoule be able to update section successfully"QA Two"
  
   Scenario: Tasks 9. user should be able to delete section in the task page
  When user should be click on Tasks at sidebar menu
  And user should be click on tasks template tab
  And  user should be able to click on task template in the tasks page
  And user should be able to delete section
  Then user shoule be able to delete section successfully"Section was successfully deleted."
  
  
  


  Scenario: Tasks 10. Validate that user is able to Delete the template from delete button which is inside the template
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should click on QA Automation Template link
    And user should click on delete button at the QA Automation Template Page to delete the template
    Then user should able to delete QA Automation Template Successfully"Task Template was deleted successfully."

  Scenario: Tasks 11. validate at user is on tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    Then "https://beta.cisin.com:4991/recurring_task_index" user should be on Task reoccuring page url

  Scenario: Tasks 12. user should be able to see add task popup in the tasks reoccuring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    Then user should be able to see add task popup in the tasks reoccuring page

  Scenario: Tasks 13. User should see an validation message on task name field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on task name field "Task name can't be blank."

  Scenario: Tasks 14. User should see an validation message on Asigned To field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on Asigned To field "Assigned to can't be blank"

  Scenario: Tasks 15. User should see an validation message on client field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on client field "Client must exist"

  Scenario: Tasks 16. User should see an validation message on start date field at the add task popup
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on add button at add task popup
    Then User should see an validation message on start date field "Start date can't be blank."

  Scenario: Tasks 17. User should be able to close  add task popup in the tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be able to click on close icon at add task popup
    Then user should be able to close  add task popup successfully in the tasks reocurring page
    
   Scenario: Tasks 18. user should be able to see the company in the task reocurring tab after adding company in the user at the user page.
   When user should be click on Users at sidebar menu for the task page
   And user is able to add company in the user contact page for the task page"Test Company"
   And user should be click on Tasks at sidebar menu
   And user should be able to click on tasks reoccurring tab
   Then user should be able to see the company in the task reocurring tab after add company in the user at the user page."Test Company"
    

  Scenario: Tasks 19. User should be able to search company in the tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to search company in the tasks reocurring page"Test Company"
    Then user should be able to see the company in the tasks reocurring page"Test Company"
    
 
 Scenario: Tasks 20. Validate that user is able to Create Template at Template page of task module
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should be click on create template button
    And user should be enter the "Qa automation template" in the name field at add task template pop up
    And user should be click on add button of task template popup
    Then user should be able to see the template "Qa automation template" at template page
    And user should be able to see valdation message of created template"Task Template was created successfully."
    
   
    
     Scenario: Tasks 21. User should be able to create task in the tasks reocurring page
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be enter all fields of add task popup
      |task template| taskname|assign|client| repeattask |date|
      |Qa automation template| Important Work |Arjay McCann|Test Company|         1 |February 29, 2024|
    Then user should see the task in the company of tasks reoccuring page"Important Work"
   

  Scenario: Tasks 22. User should be able to redirect to recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    Then user should be see the company name in the company task page

  Scenario: Tasks 23. User should be able to update fields at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And User should be able to update fields at recurring tab in the  company task tab
      | taskname            |template|date|
      | Very Important Work |Qa automation template|February 28, 2024|
   Then user should be able to see the task recurring tab in the  company task tab"Very Important Work"
   And user should be able to update recurring task successfully"Task was successfully updated."

  Scenario: Tasks 24. User should be able to search task by filter at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on add task button in the tasks reoccuring page
    And user should be enter all fields of add task popup for filter
      |task template| taskname|assign|client| repeattask |date|
      |Qa automation template| Important Work |Arjay McCann|Test Company|         1 |February 29, 2024|
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And user should be able to clcik on task reoccurring tab at company task tab
    And User should be able to search task by filter at recurring tab in the  company task tab
    | taskname|assign|
    | Important Work  |Arjay McCann|
    Then user should be able to see the filtered task in the task of the company at tasks reoccurring page

  Scenario: Tasks 25. User should be able to edit fields at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And user should be able to clcik on task reoccurring tab at company task tab
    And User should be able to edit fields in the edit task popup at recurring tab in the  company task tab"Very very Important Work"
    Then user should be able to see the updated task in the task of the company at tasks reoccurring page

  Scenario: Tasks 26. User should be able to delete task at recurring tab in the  company task tab
    When user should be click on Tasks at sidebar menu
    And user should be able to click on tasks reoccurring tab
    And user should be able to click on task of the company at tasks reoccurring page Important Task
    And user should be able to clcik on task reoccurring tab at company task tab
    And User should be able to delete task at recurring tab in the  company task tab
    
    
    
    Scenario: Tasks 27. Validate user should be able to add title for staff title widget for the task
 When user should be able to click on Settings for the task
 And  user should be able to click on add title button in staff title widget for the task
 And  user should enter the title in add title popup of staff title widget for the task"Automate Admin"
 Then user should be able to see the title on staff title widget for the task"Automate Admin"
 
    
    Scenario: Tasks 28. user should be able to add user in the user page for the task 
 When user should be click on user link on sidebar for the task
 And user should be click on add user button in the user page for the task
 And user should be enter fields for adding user in the user page for the task
 |fullname|title|bdate|role|email|sdate|
 |Automate Test Admin|Automate Admin|February 22, 2024|User|Automate@yopmail.com|February 22, 2024|
 Then user should be able to see the user in the user page for the task"Automate Test Admin"
 
    
    
    
   	Scenario: Tasks 27. user should be able to create task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Automate Test Admin|Test Company|1|February 23, 2024|
  Then user should be see the task in the tasks page for the task page"Task12"
  
    
    Scenario: Tasks 28. user should be able to see users today task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Automate Test Admin"
    Then user should be able to see users today task count at My task tab"1"
    
    Scenario: Tasks 29. user should be able to see users today task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
   And user should be able to select assign user at my task tab"Automate Test Admin"
   Then user should be able to see users today task count after the delete task at My task tab"0"
   
 Scenario: Tasks 30. user should be able to create week task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Automate Test Admin|Test Company|1|February 15, 2024|
  Then user should be see the task in the tasks page for the week task page"Task12"
    
    
    
    
    Scenario: Tasks 31. user should be able to see users week task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Automate Test Admin"
    Then user should be able to see users week task count at My task tab"1"
    
    Scenario: Tasks 32. user should be able to see users week task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
   And user should be able to select assign user at my task tab"Automate Test Admin"
   Then user should be able to see users week task count after the delete task at My task tab"0"
   
   Scenario: Tasks 33. user should be able to create Next week task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Automate Test Admin|Test Company|1|February 25, 2024|
  Then user should be see the task in the tasks page for the next week task page"Task12"
    
    
    
    
    Scenario: Tasks 34. user should be able to see users next week task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Automate Test Admin"
    Then user should be able to see users next week task count at My task tab"0"
    
    Scenario: Tasks 35. user should be able to see users next week task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
    And user should be able to select assign user at my task tab"Automate Test Admin"
   Then user should be able to see users next week task count after the delete task at My task tab"0"
   
   
   Scenario: Tasks 36. user should be able to create later week task in the compnay task page
 	 When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
 	 And  user should be click on Add tasks button in the tasks page for the task page
 	 And user should be able to create task in the tasks page for the task page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Automate Test Admin|Test Company|1|February 29, 2024|
  Then user should be see the task in the tasks page for the later week task page"Task12"
    
    
    
    
    Scenario: Tasks 37. user should be able to see users later week task at My task tab
    When user should be click on Tasks at sidebar menu
    And user should be click on my task tab
    And user should be able to select assign user at my task tab"Automate Test Admin"
    Then user should be able to see users later week task count at My task tab"0"
    
    Scenario: Tasks 38. user should be able to see users later week task count after the delete task at My task tab
   When user should be able to select company in the company page for the task page
 	 And  user should be on tasks page for the task page
   And  user should be click on delete btn tasks button in the tasks for the task page
   And user should be click on Tasks at sidebar menu
   And user should be click on my task tab
   And user should be able to select assign user at my task tab"Automate Test Admin"
   Then user should be able to see users later week task count after the delete task at My task tab"0"
   
		Scenario: Tasks 39. Validate that user is able to Delete the template from delete button which is inside the template
    When user should be click on Tasks at sidebar menu
    And user should be click on tasks template tab
    And user should click on QA Automation Template link
    And user should click on delete button at the QA Automation Template Page to delete the template
    Then user should able to delete QA Automation Template Successfully"Task Template was deleted successfully."
   
   Scenario: Tasks 40. user should be able to delete user in the user page for task
  When user should be click on user link on sidebar for the task
  And user should be able to select user in the user for the task"Automate Test Admin"
  And user should be click on edit button in the user page for the task
  And user should be delete the user in the user page for the task
  
  Scenario: Tasks 41. User should be able to delete title for staff title widget for the task
 When user should be able to click on Settings for the task
 And 	User should be able to delete title in staff title widget for the task
 Then user should be able to delete contact title successfully in the staff title widget for the task"Title was successfully deleted."
 #
  #
 #
#
