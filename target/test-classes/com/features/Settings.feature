Feature: Settings Page Functionality

  Background: 
    Given User has already logged in to application for settings
      | username          | password    |
      | admin@ontrack.com | Admin@12345 |
   
  Scenario: Settings 1. user should be on settings page
   When user should be able to click on Settings
  Then  user should be on settings page"Contact Title"
  
 Scenario: Settings 2. User should see an validation message for Title fieled in the contact title widget
 When user should be able to click on Settings
 And  click on add button in the contact title widget
 And 	User should be clicked on add button in the title popup in the contact title widget
 Then User should see an validation message for Title fieled in the contact title widget"Title can't be blank."
 
 Scenario: Settings 3. User should be able to close add title popup for contact title widget
 When user should be able to click on Settings
 And  click on add button in the contact title widget
 And 	User should be able to close add title popup for contact title widget
 Then close add title popup for contact title widget successfully"Contact Title"
 
 
 Scenario: Setting 4. Validate user should be able to add title for contact title widget
 When user should be able to click on Settings
 And  user should be able to click on add title button in contact title widget
 And  user should enter the title in add title popup of contact title widget"Automate Admin"
 Then user should be able to see the title on contact title widget"Automate Admin"
 
 Scenario: Settings 5. User should be able to edit title for contact title widget
 When user should be able to click on Settings
 And 	User should be able to edit title for contact title widget"Auto Admin"
 Then user should be able to see contact title in the contact title widget"Auto Admin"
 
 
 Scenario: Settings 6. User should be able to delete title for contact title widget
 When user should be able to click on Settings
 And 	User should be able to delete title in contact title widget
 Then user should be able to delete contact title successfully in the contact title widget"Title was successfully deleted."
 
 
 
  Scenario: Settings 7. User should see an validation message for Title fieled in the staff title widget
 When user should be able to click on Settings
 And  click on add button in the staff title widget
 And 	User should be clicked on add button in the title popup in the staff title widget
 Then User should see an validation message for Title fieled in the staff title widget"Title can't be blank."
 
 Scenario: Settings 8. User should be able to close add title popup for staff title widget
 When user should be able to click on Settings
 And  click on add button in the staff title widget
 And 	User should be able to close add title popup for staff title widget
 Then close add title popup for staff title widget successfully"Staff Title"
 
 Scenario: Setting 9. Validate user should be able to add title for staff title widget
 When user should be able to click on Settings
 And  user should be able to click on add title button in staff title widget
 And  user should enter the title in add title popup of staff title widget"Automate Admin"
 Then user should be able to see the title on staff title widget"Automate Admin"
 
 
 Scenario: Settings 10. User should be able to edit title for staff title widget
 When user should be able to click on Settings
 And 	User should be able to edit title for staff title widget"Auto Admin"
 Then user should be able to see staff title in the staff title widget"Auto Admin"


 Scenario: Settings 11. User should be able to delete title for staff title widget
 When user should be able to click on Settings
 And 	User should be able to delete title in staff title widget
 Then user should be able to delete contact title successfully in the staff title widget"Title was successfully deleted."
 


 
 #Scenario: Settings 12. User should be able to close add signature popup for email signature widget
 #When user should be able to click on Settings
 #And  click on add button in the email signature widget
 #And 	User should be able to close add signature popup for email signature widget
 #Then close add title popup for email signature widget successfully"Email Signature"
 #
 #
 #Scenario: Settings 13. User should be able to add signature for email signature widget
 #When user should be able to click on Settings
 #And  click on add button in the email signature widget
 #And 	User should be able to add signature for email signature widget"Automate Email Signature","Automate Message"
 #Then user should be able to see signature in the email signaturewidget"Automate Email Signature"
 #
 #Scenario: Settings 14. User should be able to edit signature for email signature widget
 #When user should be able to click on Settings
 #And  click on edit button in the email signature widget
 #And 	User should be able to update signature for email signature widget"Automate Signature","Automate New Message"
 #Then user should be able to see updated signature in the email signaturewidget"Automate Signature","Automate New Message"
 #
 #Scenario: Settings 15. User should be able to delete signature for email signature widget
 #When user should be able to click on Settings
 #Then 	User should be able to delete signature for email signature widget
 #
  Scenario: Settings 16. User should see an validation message for Title field in the Reports widget
 When user should be able to click on Settings
 And  click on add button in the Reports widget
 And 	User should be clicked on add button in the title popup in the Reports widget
 Then User should see an validation message for Title field in the Reports widget"Title can't be blank."
 
 Scenario: Settings 17. User should be able to close add title popup for reports widget
 When user should be able to click on Settings
 And  click on add button in the Reports widget
 And 	User should be able to close add title popup for reports widget
 Then close add title popup for reports widget successfully"Reports"
 
 
 
 Scenario: Setting 18. Validate user should be able to add report for Reports widget
 When user should be able to click on Settings
 And  user should be able to click on new report button in report widget
 And  user should enter the title in add report popup of report widget"Automate Report"
 Then user should be able to see the title on report widget"Automate Report"
 
 
 Scenario: Settings 19. User should be able to edit title for Reports widget
 When user should be able to click on Settings
 And 	User should be able to edit title for Reports widget"Auto Report"
 Then user should be able to see report title in the reports widget"Auto Report"
 
 
 Scenario: Settings 20. User should be able to delete report for report widget
 When user should be able to click on Settings
 And 	User should be able to delete report for report widget
 Then user should be able to delete report successfully"Report was successfully deleted."
 #
#
 