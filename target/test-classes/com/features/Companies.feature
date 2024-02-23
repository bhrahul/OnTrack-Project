Feature: Companies Page Functionality

  Background: 
    Given User has already logged in to application
      | username          | password    |
      | admin@ontrack.com | Admin@12345 |
    And User is on Companies page url "https://beta.cisin.com:4991/"
  Scenario: 1. Companies page title
  Then Page title should be "OnTrack"
  
  Scenario: 2. Companies link should be displayed in the company page
  Then "Companies" link should be displayed on sidebar in the company page
  
  Scenario: 3. Tasks link should be displayed in the company page
  Then "Tasks" link should be displayed on sidebar in the company page
  
  Scenario: 4. Email link should be displayed in the company page
  Then "Email" link should be displayed on sidebar in the company page
  
  Scenario: 5. Users link should be displayed in the company page
  Then "Users" link should be displayed on sidebar in the company page
  
  Scenario: 6. Logout button should be displayed in the company page
  Then "Logout" link should be displayed on sidebar in the company page
  
  Scenario: 7. Setting link should be displayed in the company page
  Then setting link should be displayed on sidebar in the company page
  
  Scenario: 8. Profile link should be displayed in the company page
  Then profile icon should be displayed on sidebar in the company page
  
  Scenario: 9. Comapnies tab should be displayed in the company page
  Then "companies" tab should be displayed in the company page
  
  Scenario: 10. Contact tab should be displayed in the company page
  Then "contact" tab should be displayed in the company page
  
  Scenario: 11. SearchBox should be displayed in the company page
  Then Search field should be displayed in the company page
  
  Scenario: 12. Add Contact button should be displayed in the company page
  Then add contact button should be displayed in the company page
  
  Scenario: 13. Add Contact title should be displayed in the add contact popup
  When user should be clicked on AddContact button in the company page
  Then "Add Contact" title should be displayed in the add contact popup
  
  Scenario: 14. Add company button should be displayed in the add contact popup
  When user should be clicked on AddContact button in the company page
  Then Add company button should be displayed in the add contact popup
  
  Scenario: 15. Add contact button should be displayed in the add contact popup
  When user should be clicked on AddContact button in the company page
  Then Add contact button should be displayed in the add contact popup
  
  Scenario: 16. Reset button should be displayed in the add contact popup
  When user should be clicked on AddContact button in the company page
  Then Reset button should be displayed in the add contact popup
  
  Scenario: 17. user should be able to close Add contact popup  successfully in the company page
  When user should be clicked on AddContact button in the company page
  And user should be clicked on Reset button in the add contact popup 
  Then  Add contact popup close successfully in the company page
  
  Scenario: 18. User should be able to add contact popup close successfully by click on close Icon
  When user should be clicked on AddContact button in the company page
  And User should be closed the add contact popup in the company page
  Then add contact popup close successfully by click on close Icon in the company page
  
  Scenario: 19 User should be clicked on Add Contact button in the page
  When user should be clicked on AddContact button in the company page
  And  User should be clicked on Add Company button in the add contact popup of the company page
  Then user should able to see the add company popup in the company page
  
  Scenario: 20. User should be able to create the Company in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And User should be enter the fields for the company in the add company popup
  | companyname | phonenumber |ext| website       |email            |address                                                       | city       | state          | zipcode |sdate       |
  | TestCompany     |  9874563210 |9| www.google.com|support@ontrack-financial.com| 29-2-20, Rama Mandiram St, Venkateswara Rao St, Governor Peta | Vijayawada | Andhra Pradesh |  520002 |February 17, 2024|
   Then User should be able to see the company from company list"TestCompany"
  
  
  
  Scenario: 21. user should be able to close the add company popup successfully
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And  User should be clicked on Close button in the add company popup
  Then user should be able to close the add company popup successfully
  
  
  Scenario: 22. User should see an validation message on company name field the add company popup
  When user should be clicked on AddContact button in the company page 
  And User should be clicked on Add Company button in the add contact popup of the company page
  And  click on add button in the add company popup
  Then User should see an validation message on company name field "Company name can't be blank."
  
  Scenario: 23. User should see an validation message on phone number field in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And click on add button in the add company popup
  Then User should see an validation message on phone number field"Phone number can't be blank."
  
  
  Scenario: 24. User should see an validation message on address field in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And click on add button in the add company popup
 Then User should see an validation message on address "Address can't be blank."
  
  Scenario: 25. User should see an validation message on city field in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And click on add button in the add company popup
  Then User should see an validation message on city "City can't be blank."
  
  Scenario: 26. User should see an validation message on state field in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And click on add button in the add company popup
  Then User should see an validation message on state "State can't be blank."
  
  Scenario: 27. User should see an validation message on zipcode field in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And click on add button in the add company popup
  Then User should see an validation message on zipcode "Zip code can't be blank."
  
  Scenario: 28. User should see an validation message on start date field in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And click on add button in the add company popup
  Then User should see an validation message on start date "Start date can't be blank."
  
  
  Scenario: 29. User should see an validation message on report time field in the add company popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add Company button in the add contact popup of the company page
  And click on add button in the add company popup
  Then User should see an validation message on report time "Report time can't be blank."
  
  Scenario: 30. User should be searched a company in the company page
  		When  User should be searched a company "TestCompany" in the company page
  		And  User click on search button in the company page
	  	Then User should be searched a company in the company page
  		
  Scenario: 31. User should be update company name in the edit item popup
  	When  User should be searched a company "TestCompany" in the company page
  	And   User click on search button in the company page
  	And   User should be click on edit button in the company page
  	And   user should be upadted company name"Test Company" in the edit item popup
  	And   User should be click on update button in the edit item popup
  	Then  user should see the updated company in the company page"Test Company"
  	
 

  Scenario: 32. User should be able to see Add Contact popup title in the add contact popup
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add contact button of company
  Then  User should be able to see Add Contact popup title in the add contact popup
  
  
  
  Scenario: 33. User should see an validation message for First Name
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add contact button of company
  And User should be clicked on add button in the add contact popup of the company
  Then  User should see an validation message for First Name"First name can't be blank."
  
  
  Scenario: 34. User should see an validation message for Last Name
   When user should be clicked on AddContact button in the company page
  And User should be clicked on Add contact button of company
  And User should be clicked on add button in the add contact popup of the company
  Then  User should see an validation message for Last Name"Last name can't be blank."
  
  
  Scenario: 35. User should see an validation message for Title Name
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add contact button of company
  And User should be clicked on add button in the add contact popup of the company
  Then  User should see an validation message for Title Name"Title must exist."
  

  
  Scenario: 36. User should see an validation message for Company Name
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add contact button of company
  And User should be clicked on add button in the add contact popup of the company
  Then  User should see an validation message for Company Name"Company ids can't be blank."
  
  
  
  Scenario: 37. Validate user should be able to add title for contact title widget for the company page
 When user should be able to click on Settings for the company page
 And  user should be able to click on add title button in contact title widget for the company page
 And  user should enter the title in add title popup of contact title widget for the company page"Automate Admin"
 Then user should be able to see the title on contact title widget for the company page"Automate Admin"
  
  
  Scenario: 38. User should be able create contact
  When user should be clicked on AddContact button in the company page
  And User should be clicked on Add contact button of company
  And User should be enter the fields for the contact
  	|firstname|lastname|title|email           |phonenumber|company|
  	|Test  |Contact  |Automate Admin|Amit@gmail.com|9856321047 |Test Company|
  Then user should be see the contact name in the company list page"Test Contact"
  
  
  Scenario: 39. user should be able to filtered company in the company page
  When user should be filtered company in the company page
  |company|contact|
  |Test Company|Test Contact|
  Then user should be able to see the company which is filtered"Test Company"
  
  Scenario: 40. User should be able to select company from company list
  When user should be able to select company in the company page
  Then User should see the Company Name "Test Company"
  
    
###########################################COMPANIES>>DASHBOARD>>STATISTICs##########################################

	Scenario: 41. user should be on Statistics tab in the company
	When user should be able to select company in the company page
	Then user should be on Statistics tab in the company"Statistics"
	
  Scenario: 42. Royalty & Fidesic widget should be displayed
  When user should be able to select company in the company page
  Then "Royalty & Fidesic" widget should be displayed
  
  Scenario: 43. Add button should be displayed
  When user should be able to select company in the company page
  Then Add button should be displayed
  
  Scenario: 44. Create Royalty & Fidesic record title should be displayed on PopUp
  When  user should be able to select company in the company page
  And  user should be clicked on add button of Royalty & Fidesic record
  Then "Create Royalty & Fidesic record" title should be displayed
  
  Scenario: 45. add button should be displayed on Royalty & Fidesic PopUp
  When  user should be able to select company in the company page
  And  user should be clicked on add button of Royalty & Fidesic record
  Then  add button should be displayed on Royalty & Fidesic PopUp
  
  Scenario: 46. close button should be displayed on Royalty & Fidesic PopUp
  When  user should be able to select company in the company page
  And  user should be clicked on add button of Royalty & Fidesic record
  Then  close button should be displayed on Royalty & Fidesic PopUp
  
  
  Scenario: 47. Licence number error message should be displayed on Royalty & Fidesic PopUp
  When  user should be able to select company in the company page
  And  user should be clicked on add button of Royalty & Fidesic record
  And  user should be clicked add button on Royalty & Fidesic PopUp
  Then user should be able to see the licence error message"License number can't be blank.License number is not a number"
  
  Scenario: 48. user should be able to Create Royalty & Fidesic record
  When  user should be able to select company in the company page
  And  user should be clicked on add button of Royalty & Fidesic record
  And  user should be able to enter all the fields of Royalty & Fidesic record
  |title|royalty filed date|royalty audit date|royaly paid date|royalty invoice date|
  |12345|February 20, 2024|February 20, 2024|February 20, 2024|February 20, 2024|
  Then Royalty & Fidesic record should be displayed on Royalty & Fidesic widget
  
  Scenario: 49. user should be able to update Royalty & Fidesic record
  When  user should be able to select company in the company page
  And  user should be clicked on edit button
  And  user should be able to update Royalty & Fidesic record
  |title|royalty filed date|royalty audit date|royaly paid date|royalty invoice date|
  |45689|February 21, 2024|February 21, 2024|February 21, 2024|February 21, 2024|
  Then user should be able to see the update Royalty & Fidesic record
  
  Scenario: 50. user should be able to delete Royalty & Fidesic record
  When  user should be able to select company in the company page
  And  user should be able to delete Royalty & Fidesic record
  
  Scenario: 51. user should be able to close Check Off List PopUp
  When  user should be able to select company in the company page
  And  user should be clicked on add button of check of list
  And  user should be able to close Check Off List PopUp
  Then user should be close check off list popup successfully
  
  Scenario: 52. User should see an validation message for Name
  When  user should be able to select company in the company page
  And  user should be clicked on add button of check of list
  And  user shoudl be clicked on add button of check of list popup
  Then User should see an validation message for Name"Name can't be blank."
  
  Scenario: 53. User should see an validation message for Date
  When  user should be able to select company in the company page
  And  user should be clicked on add button of check of list
  And  user shoudl be clicked on add button of check of list popup
  Then User should see an validation message for Date"Date can't be blank."
  
  Scenario: 54. User should be able to create Check Off List Record
  When  user should be able to select company in the company page
  And  user should be clicked on add button of check of list
  And user should be able to enter all the fields of Check Off List
  |name|date|
 	|Ravi|February 20, 2024|
  Then user should be able to see the check off list"Ravi"
  
  Scenario: 55. user should be able to update Check Off List record
  When  user should be able to select company in the company page
  And  user should be clicked on edit button of Check Off List
  And  user should be able to update Check Off List record
  |name|date|
  |Janvi|February 21, 2024|
  Then user should be able to see the update Check Off Listc record"Janvi"
  
  Scenario: 56. user should be able to delete check off list record
  When  user should be able to select company in the company page
  And  user should be able to delete check off list record
  
  
  
   
  Scenario: 57. user should be able to close Reconciled Date PopUp
  When  user should be able to select company in the company page
  And  user should be clicked on add button of Reconciled Date
  And  user should be able to close Reconciled Date PopUp
  Then user should be close Reconciled Date popup successfully
  
  
  
     Scenario: 58. User should see an validation message for Account Name
  When  user should be able to select company in the company page
  And  user should be clicked on add button of Reconciled Date
  And  user shoudl be clicked on add button of Reconciled Date popup
  Then User should see an validation message for Account Name"Account name can't be blank."
  
  
  
  
  Scenario: 59. User should be able to create Reconciled Dates record
  When  user should be able to select company in the company page
 	And  user should be clicked on add button of Reconciled Date
  And  User should be able to create Reconciled Dates record
  |AccountName|report date|auditor date|
  |ICICI0000456123|February 20, 2024|February 20, 2024|
  Then user should be able to see the Reconciled Dates record"ICICI0000456123"
  
  
   Scenario: 60. User should be able to Edit Reconciled Dates record
  When  user should be able to select company in the company page
 	And  user should be clicked on edit button of Reconciled Date
  And  User should be able to edit Reconciled Dates record
   |AccountName|report date|auditor date|
  |ICICI0000356214|February 21, 2024|February 21, 2024|
  Then user should be able to see the update Reconciled Dates record"ICICI0000356214"
  
   Scenario: 61. user should be able to delete Reconciled Date record
  When  user should be able to select company in the company page
  And  user should be able to delete Reconciled Date record
  
  Scenario: 62.  user should be able to close New Loan Payment PopUp
  When  user should be able to select company in the company page
  And  user should be clicked on add button of New Loan Payment
  And  user should be able to close New Loan Payment PopUp
  Then user should be close New Loan Payment popup successfully
  
     Scenario: 63. User should see an validation message for Loan Name
  When  user should be able to select company in the company page
  And  user should be clicked on add button of New Loan Payment
  And  user should be clicked on add button of New Loan Payment popup
  Then User should see an validation message for Loan Name"Loan name can't be blank."
  
   	Scenario: 64. User should see an validation message for Payment Date
  When  user should be able to select company in the company page
  And  user should be clicked on add button of New Loan Payment
  And  user should be clicked on add button of New Loan Payment popup
  Then User should see an validation message for Payment Date"Payment date can't be blank."
  
   	Scenario: 65. User should see an validation message for Amount
  When  user should be able to select company in the company page
  And  user should be clicked on add button of New Loan Payment
  And  user should be clicked on add button of New Loan Payment popup
  Then User should see an validation message for Amount"Amount can't be blank."
  
   Scenario: 66. User should be able to create loan payment Record
  When  user should be able to select company in the company page
  And  user should be clicked on add button of New Loan Payment
  And user should be able to enter all the fields of new loan payment
  |loan name|payment date|loan amount|
  |Ravi|February 20, 2024|10000|
  Then user should be able to see the loan payment
 
 
   Scenario: 67. User should be able to edit loan payment Record
  When  user should be able to select company in the company page
  And  user should be clicked on edit button of New Loan Payment
  And user should be able to edit all the fields of new loan payment
  |loan name|payment date|loan amount|
  |Janvi|February 21, 2024|20000|
  Then user should be able to see the edit loan payment
  
   Scenario: 68. user should be able to delete Loan Payment record
  When  user should be able to select company in the company page
  And  user should be able to delete Loan payment record
  
  
# ############## COMPANIES>>DASHBOARD>>DAILY RECONCILED##########################################
  
  Scenario: 69. user should be able to redirect to  Daily Reconciled page of compnay dashboard
   When user should be able to select company in the company page
	And user should be clicked on Daily Reconciled Tab
  Then user should be on daily reconciled page of company page"Daily Reconciled"
  
  Scenario: 70. user should be see the error message on Add Account PopUp
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And user should be clicked on add account button in the Daily Reconciled Tab
  And user should be able to click add button on Add Account PopUp
  Then "Name can't be blank." Error message should be displayed
  
   Scenario: 71. User should be able to add account name at Daily Reconciled page
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And user should be clicked on add account button in the Daily Reconciled Tab
  And user should be able to add account name"Automate DR"
  Then user should be able to see add Account name in the daily reconciled page
  
  Scenario: 72. User should be able to edit account name at Daily Reconciled page
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And  user should be click on edit button on Daily Reconciled page
  And user should be able to update account name
  |Update Account Name|
  |Auto DR|
  And user should be able to click add button on Add Account PopUp
  Then user should be able to see Update Account name in the daily reconciled page
  When user should be change the account in the daily reconciled Page"Automate DR"

  Scenario:  73. user should be able to add New Payment in the account at daily reconciled page
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And user should be able to click on add button in the account at daily reconciled page
  And user should be able to enter the field for new payment at add new payment popup
  |payee|date|amount|
  |P01|February 20, 2024|1000|
  Then user should be able to see the Transaction at the account in the daily reconciled page"P01 (02/20/2024)"
  
  Scenario: 74. User should be able to see the count of Unclreared Transactions in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of Unclreared Transactionsin statistics page"1"
  
  Scenario:  75. user should be able to close New Payment popup in the account at daily reconciled page
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And user should be able to click on add button in the account at daily reconciled page
  Then user should be able to  close New Payment popup in the account at daily reconciled page
  
  Scenario:  76. user should be able to update New Payment in the account at daily reconciled page
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And user should be able to click on edit button in the account at daily reconciled page
  And user should be able to update the field for new payment at add new payment popup
  |payee|date|amount|
  |P001|February 21, 2024|1000|
  Then user should be able to see the update Transaction at the account in the daily reconciled page"P001 (02/21/2024)"
  
  Scenario:  77. user should be able to delete the payment in the account at daily reconciled page
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And user should be able to delete the payment in the account at daily reconciled page
  
  Scenario: 78. User should be able to see the count of Unclreared Transactions in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of Unclreared Transactions after delete in statistics page"0"
  
  Scenario: 79. user should be able to delete the account in the daily reconciled page
  When user should be able to select company in the company page
  And user should be clicked on Daily Reconciled Tab
  And user should be able to delete the account in the daily reconciled page
  
######    COMPANIES>>DASHBOARD>>TRANSACTIONS##########################################
  
 Scenario: 80. user should be able to redirect to  Transaction page of compnay dashboard
   When user should be able to select company in the company page
	And user should be clicked on Transaction Tab
  Then user should be on transaction page of company page"Transaction"
  
  Scenario: 81. user should be able to close the Add Transaction of Payment Deposited but not Received 
   When user should be able to select company in the company page
	And user should be clicked on Transaction Tab
	And user should be able to click on add button in the Payment Deposited but not Received widget
	Then  user should be able to close the Add Transaction of Payment Deposited but not Received successfully
	
	Scenario: 82. User should see an validation message for vendor Name
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Payment Deposited but not Received widget
  And  user should be clicked on add button in add transaction popup of Payment Deposited but not Received widget
  Then User should see an validation message for vendor Name"Customer name can't be blank."
  
  Scenario: 83. User should see an validation message for date
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Payment Deposited but not Received widget
  And  user should be clicked on add button in add transaction popup of Payment Deposited but not Received widget
  Then User should see an validation message for date"Date can't be blank."
  
    Scenario: 84. User should see an validation message for amount
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Payment Deposited but not Received widget
  And  user should be clicked on add button in add transaction popup of Payment Deposited but not Received widget
  Then User should see an validation message for amount"Amount can't be blank."
  
  
   
   Scenario: 85. User should be able to create Payment Deposited but not Received Record
  When  user should be able to select company in the company page
 And user should be clicked on Transaction Tab
 And user should be able to click on add button in the Payment Deposited but not Received widget
  And user should be able to enter all the fields in add transaction popup of Payment Deposited but not Received widget
  |vendor name|Bank Account|date|Amount|
  |Ravi|ICICI10000|February 20, 2024|10000|
  Then user should be able to see record of the Payment Deposited but not Received widget"Ravi(ICICI10000)"
  
  Scenario: 86. User should be able to see the count of Payment Not Received in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of Payment Not Received in statistics page"1"
  
   Scenario: 87. User should be able to edit Payment Deposited but not Received Record
  When  user should be able to select company in the company page
 And user should be clicked on Transaction Tab
 And user should be able to click on edit button in the Payment Deposited but not Received widget
  And user should be able to update all the fields in add transaction popup of Payment Deposited but not Received widget
  |vendor name|Bank Account|date|Amount|
  |Janvi|ICICI3000|January 21, 2024|20000|
  Then user should be able to see updated record of the Payment Deposited but not Received widget"Janvi(ICICI3000)"
  
  Scenario: 88. user should be able to delete  Payment Deposited record
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
  And  user should be able to  delete  Payment Deposited record
  
   Scenario: 89. User should be able to see the count of Payment Not Received in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of Payment Not Received in statistics page"0"
  
   Scenario: 90. user should be able to close the Add Transaction of Payment Received but not Deposited
	When user should be able to select company in the company page
	And user should be clicked on Transaction Tab
	And user should be able to click on add button in the Payment Received but not Deposited widget
	Then  user should be able to close the Add Transaction of Payment Received but not Deposited successfully
	
	Scenario: 91. User should see an validation message for vendor Name of Payment Received but not Deposited widget
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Payment Received but not Deposited widget
  And  user should be clicked on add button in add transaction popup of Payment Received but not Deposited widget
  Then User should see an validation message for vendor Name of Payment Received but not Deposited widget"Customer name can't be blank."
  
  Scenario: 92. User should see an validation message for date of Payment Received but not Deposited widget
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Payment Received but not Deposited widget
  And  user should be clicked on add button in add transaction popup of Payment Received but not Deposited widget
  Then User should see an validation message for date of Payment Received but not Deposited widget"Date can't be blank."
  
   Scenario: 93. User should see an validation message for amount
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Payment Received but not Deposited widget
  And  user should be clicked on add button in add transaction popup of Payment Received but not Deposited widget
  Then User should see an validation message for amount of Payment Received but not Deposited widget
  
   
   Scenario: 94. User should be able to create Payment Received but not Deposited widget
  When  user should be able to select company in the company page
 And user should be clicked on Transaction Tab
 And user should be able to click on add button in the Payment Received but not Deposited widget
  And user should be able to enter all the fields in add transaction popup of Payment Received but not Deposited widget
  |vendor name|Bank Account|date|Amount|
  |Ravi|ICICI10000|February 20, 2024|10000|
  Then user should be able to see record of the Payment Received but not Deposited widget"Ravi(ICICI10000)"
  
  Scenario: 95. User should be able to see the count of Payment Not yet deposited in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of Payment Not yet deposited in statistics page"1"
  
  
   Scenario: 96. User should be able to edit Payment Received but not Deposited widget
  When  user should be able to select company in the company page
 And user should be clicked on Transaction Tab
 And user should be able to click on edit button in the Payment Received but not Deposited widget
  And user should be able to update all the fields in add transaction popup of Payment Received but not Deposited widget
  |vendor name|Bank Account|date|Amount|
  |Janvi|ICICI3000|February 21, 2024|20000|
  Then user should be able to see updated record of the Payment Received but not Deposited widget"Janvi(ICICI3000)"
  
  Scenario: 97. user should be able to delete  Payment Received  record
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
  And  user should be able to delete Payment Received record
  
   Scenario: 98. User should be able to see the count of Payment Not yet deposited in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of Payment Not yet deposited after delete transaction in statistics page"0"
  
   Scenario: 99. user should be able to close the Add Transaction of Unknown Transactions
	When user should be able to select company in the company page
	And user should be clicked on Transaction Tab
	And user should be able to click on add button in the Unknown Transactions widget
	Then  user should be able to close the Add Transaction of Unknown Transactions successfully
	
	Scenario: 100. User should see an validation message for vendor Name of Unknown Transactions widget
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Unknown Transactions widget
  And  user should be clicked on add button in add transaction popup of Unknown Transactions widget
  Then User should see an validation message for vendor Name of Unknown Transactions widget"Customer name can't be blank."
  
  Scenario: 101. User should see an validation message for date of Unknown Transactions widget
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Unknown Transactions widget
  And  user should be clicked on add button in add transaction popup of Unknown Transactions widget
  Then User should see an validation message for date of Unknown Transactions widget"Date can't be blank."
  
   Scenario: 102. User should see an validation message for amount
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
 	And user should be able to click on add button in the Unknown Transactions widget
  And  user should be clicked on add button in add transaction popup of Unknown Transactions widget
  Then User should see an validation message for amount of Unknown Transactions widget
  
   
   Scenario: 103. User should be able to create Unknown Transactions widget
  When  user should be able to select company in the company page
 And user should be clicked on Transaction Tab
 And user should be able to click on add button in the Unknown Transactions widget
  And user should be able to enter all the fields in add transaction popup of Unknown Transactions widget
  |vendor name|Bank Account|date|Amount|
  |Ravi|ICICI10000|February 20, 2024|10000|
  Then user should be able to see record of the Unknown Transactions widget"Ravi(ICICI10000)"
  
   Scenario: 104. User should be able to see the count of unkown transactions in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of unkown transactions in statistics page"1"
  
  
   Scenario: 105. User should be able to edit Unknown Transactions widget
  When  user should be able to select company in the company page
 And user should be clicked on Transaction Tab
 And user should be able to click on edit button in the Unknown Transactions widget
  And user should be able to update all the fields in add transaction popup of Unknown Transactions widget
  |vendor name|Bank Account|date|Amount|
  |Janvi|ICICI3000|February 21, 2024|20000|
  Then user should be able to see updated record of the Unknown Transactions widget"Janvi(ICICI3000)"
  
  Scenario: 106. user should be able to delete Unknown Transactions widget record
  When  user should be able to select company in the company page
  And user should be clicked on Transaction Tab
  And  user should be able to delete Unknown Transactions widget record
  
    Scenario: 107. User should be able to see the count of unkown transactions in statistics page
  When  user should be able to select company in the company page
  Then  user should be able to see the count of unkown transactions after delete transaction in statistics page"0"
  
###############COMPANIES>>DASHBOARD>>Bills.con &QBO##########################################
  
  Scenario: 108. user should be able to redirect to  Bills.com page of compnay dashboard
   When user should be able to select company in the company page
	And user should be clicked on Bills.com Tab
  Then user should be on bills.com page of company page"Bill.com VS QBO"
  
 	Scenario: 109. User should see an validation message for vendor Name
  When  user should be able to select company in the company page
  And user should be clicked on Bills.com Tab
 	And user should be able to click on add button in the Bills in Bills.com that are not sync in QBO widget
  Then User should see an validation message for vendor Namein the add transactionPopup"Vendor name can't be blank." 
  
  
  Scenario: 110. User should see an validation message for vendor Name
  When  user should be able to select company in the company page
  And user should be clicked on Bills.com Tab
 	And user should be able to click on add button in the Bills in Bills.com that are not sync in QBO widget
  Then User should see an validation message for date in the add transactionPopup"Date can't be blank." 
  
  
   
   Scenario: 111. User should be able to create transaction in the Bills in Bills.com that are not sync in QBO widget
  When  user should be able to select company in the company page
 And user should be clicked on Bills.com Tab
 And user should be able to click on add button in the Bills in Bills.com that are not sync in QBO widget
  And user should be able to enter all the fields in add transaction popup ofBills in Bills.com that are not sync in QBO widget widget
  |vendor name|Bank Account|date|Amount|
  |Ravi|ICICI10000|February 20, 2024|10000|
  Then user should be able to see record of the Bills in Bills.com that are not sync in QBO widget"Ravi"
  
  Scenario: 112. user should be able to delete Bills in Bills.com that are not sync in QBO widget widget record
  When  user should be able to select company in the company page
  And user should be clicked on Bills.com Tab
  And  user should be able to delete Bills in Bills.com that are not sync in QBO widget record
  
  
   	Scenario: 113. User should see an validation message for vendor Name
  When  user should be able to select company in the company page
  And user should be clicked on Bills.com Tab
 	And user should be able to click on add button in the Bills in Bills.com that are not outstanding in Bills.com widget
  Then User should see an validation message for vendor Name in the add transactionPopup Bills in Bills.com that are not outstanding in Bills.com"Vendor name can't be blank." 
  
  
  Scenario: 114. User should see an validation message for vendor Name
  When  user should be able to select company in the company page
  And user should be clicked on Bills.com Tab
 	And user should be able to click on add button in the Bills in Bills.com that are not outstanding in Bills.com widget
  Then User should see an validation message for date in the add transactionPopup Bills in Bills.com that are not outstanding in Bills.com"Date can't be blank." 
  
  Scenario: 115. User should be able to create transaction in the Bills in Bills.com that are not outstanding in Bills.com widget
  When  user should be able to select company in the company page
 	And user should be clicked on Bills.com Tab
 	And user should be able to click on add button in the Bills in Bills.com that are not outstanding in Bills.com widget
  And user should be able to enter all the fields in add transaction popup of Bills.com that are not outstanding in Bills.com widget
  |vendor name|Bank Account|date|Amount|
  |Ravi|ICICI10000|February 20, 2024|10000|
  Then user should be able to see record of Bills.com that are not outstanding in Bills.com widget"Ravi"
  
  Scenario: 116. user should be able to delete Bills.com that are not outstanding in Bills.com widget record
  When  user should be able to select company in the company page
  And user should be clicked on Bills.com Tab
  And  user should be able to delete Bills.com that are not outstanding in Bills.com widget record
  
  
  Scenario: 117. user should be calculate difference between bills.com and QBO
  When  user should be able to select company in the company page
  And user should be clicked on Bills.com Tab
  And user should be enter the amount in bills.com calculate widget"200"
  And user should be enter the amount in QBO calculate widget."100"
  Then user should be able to see the difference between bills.com and QBO"$ 100.00"
  
    ####COMPANIES>>DASHBOARD>>ROYALTY DIFFERENCE##########################################
  
   Scenario: 118. user should be able to redirect to  Royalty Difference page of compnay dashboard
   When user should be able to select company in the company page
	And user should be clicked on Royalty Difference Tab in the company dashboard tab
  Then user should be on royalty difference page of company page"Royalty Difference"
  
  
  Scenario: 119. user should be able to see add franchise popup in Royalty Difference page
  When  user should be able to select company in the company page
  And user should be clicked on Royalty Difference Tab in the company dashboard tab
  And user should be clicked on edit franchise button in Royalty Difference page
  Then user should be able to see add franchise popup in Royalty Difference page
  
  Scenario: 200. Error message should be displayed for franchise name in Royalty Difference PopUp
  When  user should be able to select company in the company page
  And user should be clicked on Royalty Difference Tab in the company dashboard tab
  And user should be clicked on edit franchise button in Royalty Difference page
  And User should be click on add button on Royalty and Difference PopUp
  Then "Franchise number can't be blank." message should be displayed for franchise name in Royalty Difference PopUp
  
  Scenario: 201. user should be able to clicked on close button in Royalty Difference PopUp
	 When user should be able to select company in the company page
  And user should be clicked on Royalty Difference Tab in the company dashboard tab
  And user should be clicked on edit franchise button in Royalty Difference page
  And user should be able to clicked on close button in Royalty Difference PopUp
  Then Royalty Difference PopUp closed successfully"Test Company"
  
  Scenario: 202. user should be able to Add franchise in Royalty Difference
 	When user should be able to select company in the company page
  And user should be clicked on Royalty Difference Tab in the company dashboard tab
  And User should be enter the fields for franchise in the Royalty Difference page
 |franchisenumber|servpronet|QBO|
 |2586 |56985|10000|
  Then user should be able to see the franchise in the Royalty Difference page
 

  
  Scenario: 203. user should be able to edit franchise in Royalty Difference
 	When user should be able to select company in the company page
  And user should be clicked on Royalty Difference Tab in the company dashboard tab
  And User should be enter the fields for update franchise in the Royalty Difference page
  |franchisenumber|servpronet|QBO |
  |1234          |58965|20000|
  Then user should be able to see the updated franchise in the Royalty Difference page
  
  Scenario: 204. user should be able to search franchise according to  year from year dropdown
 	When user should be able to select company in the company page
  And user should be clicked on Royalty Difference Tab in the company dashboard tab
  And user should be select year from year dropdown in the dashboard Royalty Difference page of the company 
  Then user should be able to see the franchise according to year
  
  Scenario: 205. validate user should be able to delete franchise in royalty difference tab
  When user should be able to select company in the company page
  And user should be clicked on Royalty Difference Tab in the company dashboard tab
  And user should be able to click on expand button of the month
  And user should be able to delete the franchise
  Then user should be able to see the validation message after deleting the franchise"Franchise was deleted successfully."
  
  
  
  #####################COMPANIES>>DETAILS##########################################
  


  Scenario:  206. user should be able to click Details Tab
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  Then user should be on details page"Details"
  
  Scenario:  207. user should be able to update company details
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be click on edit button of company details
  And  user should be able to update companies details
  | website |
  |www.yahoo.com|
  Then user should be able to see update website"www.yahoo.com"
  When  user should be able to change companies details
  | website |
  |www.google.com|
  
  Scenario:  208. user should be able to close the edit item popUp
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be click on edit button of company details
  And  user should be click on close btn
  
  Scenario: 209. user should be able to add links
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be able to click on add button on link section
  And  user should be enter all fields of link popup
  |link|website|
  |Google|www.google.com|
  Then links should be displayed on link section"www.google.com"
  
  Scenario: 210. user should be able see error on links popup
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be able to click on add button on link section
  And user should click on add button on link popup
  Then  user should be able to see error message for link
  And user should be able to see error message for website
  
  Scenario: 211. user should be able to click on close button links popup
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be able to click on add button on link section
  And user should click on close button on link popup
  
  
  Scenario: 212. user should be able to edit links Details
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user should be click on edit button link section
  And user should be edit website detail on link section
 |link|website|
  |Yahoo|www.yahoo.com|
  Then user should able to see edit details on link section"www.yahoo.com"
  
  Scenario: 213. user should be able to delete links
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user should be able to delete links
  
   Scenario: 214. user should be able delete company contact details
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user able to delete company contact detils
  
  
  Scenario: 215. user should be able to add companies contact
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be able to click on add button on companies contact section
  And  user should be enter all fields of contacts popup
  |firstname|lastname|title|email              |phonenumber|company|
  |Test  |Contact |Automate Admin|ravi@mailinator.com|9856321047 |Test Company|
  Then company contact should be displayed on companies contact section"Test Contact"
 
  
  
  
  Scenario: 216. Validate user should be able to add report for Reports widget for the company
 When user should be able to click on Settings for the company page
 And  user should be able to click on new report button in report widget for the company
 And  user should enter the title in add report popup of report widget for the compnay"Automate Report"
 Then user should be able to see the title on report widget for the company"Automate Report"
  
  
  Scenario: 217. user should be able add company details
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user should be click on add button company detail section
  And  user should be able add contact details
  |contact|report|
  |Test Contact|Automate Report|
  Then contact should be displayed on company detail section"Test Contact"
  
  Scenario: 218. user should be able close contact detailpopup
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user should be click on add button company detail section
  And user should be able close contact detailpopup
  
 Scenario: 219. user should be able update company detail
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user should be click on edit button company detail section
  And user should be able update contact detail"Automate@yahoo.com"
  Then user should be see the update contact details
  
  Scenario: 220. user should be able delete company detail
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user able to delete company detail

  Scenario: 221. user should be able to update companies contact
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be able to click on edit button on companies contact section
  And  user should be update all fields of contacts popup
  |firstname|lastname|email              |phonenumber|company|
  	|Test   |Contact |ravi@mailinator.com|9856321047 |Test Company|
  Then update company contact should be displayed on companies contact section"Test Contact"
  
  
  Scenario: 222. user should be able delete company contact details
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user able to delete company contact detils
  
  
  Scenario: 223. User should be able to delete title for contact title widget for the company
 When user should be able to click on Settings for the company page
 And 	User should be able to delete title in contact title widget for the company
 Then user should be able to delete contact title successfully in the contact title widget for the company"Title was successfully deleted."
 
  
  
  Scenario: 224. User should be able to delete report for report widget
 When user should be able to click on Settings for the company page
 And 	User should be able to delete report for report widget for the company page
 Then user should be able to delete report successfully for the company"Report was successfully deleted."
 
  Scenario: 225. User should be able to add title for staff title widget
 When user should be able to click on Settings for the company page
 And user should be able to click on add title button in staff title widget for the company
 And user should enter the title in add title popup of staff title widget for the company"Automate Admin"
 Then user should be able to see the title on staff title widget for the company"Automate Admin"
 
 
 
 Scenario: 226. user should be able to add user in the user page for the company
 When user should be click on user link on sidebar for the company
 And user should be click on add user button in the user page for the company
 And user should be enter fields for adding user in the user page for the company
 |fullname|title|bdate|role|email|sdate|
 |Automate Test Admin|Automate Admin|February 22, 2024|User|Automate@yopmail.com|February 22, 2024|
 Then user should be able to see the user in the user page for the compnay"Automate Test Admin"
 
 
  Scenario: 227. user should be able add staff member
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user should be click on add button staff member section
  And  user should be able add staff details"Automate Test Admin"
  Then staff member details should be displayed on staff detail section"Automate Test Admin"
  
   Scenario: 228. user should be able edit staff member
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user should be click on edit button staff member section
  And  user should be able update staff details
  |title|
  |Automate Test Admin|
  Then updated staff member details should be displayed on staff detail section"Automate Test Admin"
 
  
  Scenario: 229. user should be able delete staff member details
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user able to delete staff member details
  
 Scenario: 230. user should be able to add notes
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be able to click on add button in the notes section
  And  user should be enter all fields of notes popup
  |subject|notes|
  |DEXT|Automate Notes|
  Then notes should be displayed in the notes section"Automate Notes"
 
 
  Scenario: 231. user should be able to edit notes
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be able to click on edit button in the notes section
  And  user should be edit enter all fields of notes popup"AutomateNotes"
  Then updated notes should be displayed in the notes section"AutomateNotes"
 
  Scenario: 232. user should be able delete notes
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user able to delete notes
  
  
  
  
########################COMPANIES LOGINS###################################
  Scenario: 233. user should be on the logins page
  When  user should be able to select company in the company page
  And  user should be on logins page
  Then user should check url of the page "Logins"
  
  Scenario: 234. user should be get errormsg on website field
  When  user should be able to select company in the company page
  And  user should be on logins page
  And  user should be click on Add logins button
  And user should be able to add button on login popup
  Then user should be get errormsg on website field "Website can't be blank."
  
  Scenario: 235. user should be get errormsg on userid field
  When  user should be able to select company in the company page
  And  user should be on logins page
  And  user should be click on Add logins button
  And user should be able to add button on login popup
  Then user should be get errormsg on name field "Name can't be blank."
  
  
  Scenario: 236. user should be able to add logins
  When  user should be able to select company in the company page
  And  user should be on logins page
  And  user should be click on Add logins button
  And  user should be add logins
  |name|website|companycode|password|notes|accountnumber|securityques|answer|
  |admin@ontrack.com|www.google.com|12|Admin@12345|New login|235647891|Test1|test|
  Then user should see the logins detials"Admin@ontrack.com"
  
  
  Scenario: 237. user should be able to update logins details
  When  user should be able to select company in the company page
  And  user should be on logins page
  And  user should be click on edit button on logins list
  And   user should be able to update logins details
  |name|website|companycode|notes|accountnumber|securityques|answer|
  |Admin Automate|www.yahoo.com|1|New |0123456789|Test2|testautomate|
  Then user should see the edit logins detials"Admin Automate"
  
  Scenario: 238. user should be able to delete security ques in the logins details
  When  user should be able to select company in the company page
  And  user should be on logins page
  And  user should be click on edit button on logins list
  And   user should be able to delete security ques in the logins details
  Then user should see the edit logins detials after delete security ques in the logins details"Admin Automate"
  
  
  Scenario: 239. user should be able delete logins
  When  user should be able to select company in the company page
  And  user should be on logins page
  Then user should be able delete logins

  
  
######   COMPANIES TASKS###################################
  Scenario: 240. user should be on the Tasks page
  When user should be able to select company in the company page
  And  user should be on tasks page
  Then user should check url of the tasks page "Tasks"
  
  Scenario: 241. user should be get errormsg on task name field at add task popup
  When user should be able to select company in the company page 
  And  user should be on tasks page
  And  user should be click on Add tasks button in the tasks page 
  And user should be able to add button on tasks popup
  Then user should be get errormsg on task name field "Task name can't be blank."
  
  Scenario: 242. user should be get errormsg on asigned to field at add task popup
  When user should be able to select company in the company page
  And  user should be on tasks page
  And  user should be click on Add tasks button in the tasks page
  And user should be able to add button on tasks popup
  Then user should be get errormsg on asigned to field "Assigned to can't be blank"
  
  Scenario: 243. user should be get errormsg on client field at add task popup
  When user should be able to select company in the company page
  And  user should be on tasks page
  And  user should be click on Add tasks button in the tasks page
  And user should be able to add button on tasks popup
  Then user should be get errormsg on client field "Client must exist"
  
  
  Scenario: 244. user should be get errormsg on start date field in the add task popup
  When user should be able to select company in the company page
  And  user should be on tasks page
  And  user should be click on Add tasks button in the tasks page
  And user should be able to add button on tasks popup
  Then user should be get errormsg on start date field "Start date can't be blank."
  
  
  
  Scenario: 245. user should be able to create task template in the tasks page
   When user should be click on Tasks at sidebar menu for the company task
   And user should be click on tasks template tab for the company task
   And user should be click on create template button for the compnay task
   And user should be enter the "Qa automation template" in the name field at add task template pop up for the compnay task
   And user should be click on add button of task template popup for the company task
 	
 	Scenario: 246. user should be able to create task in the compnay task page
 	 When user should be able to select company in the company page
 	 And  user should be on tasks page 
 	 And  user should be click on Add tasks button in the tasks page
 	 And user should be able to create task in the tasks page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Automate Test Admin|Test Company|1|February 20, 2024|
  Then user should be see the task in the tasks page"Feb 26 | Task12"
  
  Scenario: 247. user should be on task page
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  Then  user should be on task page
  
  Scenario: 248. validate user should be able to see company details on detail tab
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  And user should be able to click on client link on a task
  Then user should be able to see company details on detail tab"Test Company"
  
   Scenario: 249. validate user should be able to see user details on detail tab
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  And user should be able to click on assignee link on a task
  Then user should be able to see user details on detail tab"Automate Test Admin"
  
  
  Scenario: 250. user should be able to add staff member for the notes in the Task tab
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And  user should be click on add button staff member section
  And  user should be able add staff details"Automate Test Admin"
  Then staff member details should be displayed on staff detail section"Automate Test Admin"
 
  Scenario: 251. user should be able to add notes in the task tab
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  And  user should be add notes in the task tab
  |assign|subnotes|notedetail|
  |Automate Test Admin|Test|Hello|
  Then  Notes should be displayed in the notestab
  
  
   Scenario: 252. user should be able to add coachings in the notes of Task tab
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  And  user should be add coachings in the notes of Task tab
  |assign|subnotes|notedetail|
  |Automate Test Admin|Test|Hello|
  Then  coachings should be displayed in the notestab
  
  Scenario: 253. user should be able to add sections in the task page
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  And  user should be able to add sections in the task page "TASK01"
  Then Sections should be displayed on task page
  
  Scenario: 254. User should be create subtask of task in the task page
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  And  User should be create subtask of task in the task page"Task01-01"
 	Then user should be able to see the subtask of the task"Task01-01"
 	
 Scenario: 255. User should be able to see completed task in the task page
  When user should be able to select company in the company page
  And  user should be on tasks page 
  And  user should be able to click on task in the tasks page
  And  user should be able to complete task
  Then User should be able to see completed task in the task page"Feb 26 | Task12"
	
	Scenario: 256. User should be delete task at complete task in the tasks page
  When user should be able to select company in the company page
  And  user should be on tasks page
  And  User should be delete task at complete task in the tasks page
 	
  
  
Scenario: 257. user should be able to create task in the compnay task page
 	 When user should be able to select company in the company page
 	 And  user should be on tasks page 
 	 And  user should be click on Add tasks button in the tasks page
 	 And user should be able to create task in the tasks page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Automate Test Admin|Test Company|1|February 20, 2024|
  Then user should be see the task in the tasks page"Feb 26 | Task12"
  
  
  
  Scenario: 258. user should be able to create task in the tasks page
  When user should be able to select company in the company page
  Then user should be should open task widget count"1"
  
  
	  
  Scenario: 259. User should be delete task in the tasks page
  When user should be able to select company in the company page
  And  user should be on tasks page
  And  user should be click on delete btn tasks button in the tasks page
  
   Scenario: 260. user should be able to create task in the tasks page
  When user should be able to select company in the company page
  Then user should be should open task widget count"0"
  
   Scenario: 261. User should be delete task in task recurring tab in the tasks page
  When user should be able to select company in the company page
  And  user should be on tasks page
  And  user should be click on delete btn in task recurring tab in the tasks page
  
  Scenario: 262. user should be able to create task in the compnay task page
 	 When user should be able to select company in the company page
 	 And  user should be on tasks page 
 	 And  user should be click on Add tasks button at recurring tab in the tasks page
 	 And user should be able to create task at task recurring in the tasks page
  |task template         |name  |assign     |company       |taskrepeat|date|
  |Qa automation template|Task12|Automate Test Admin|Test Company|1|February 20, 2024|
  Then user should be see the task at task recurring tab in the tasks page"Task12"
  
  
  Scenario: 263. user should be able to update task in the compnay task page
 	 When user should be able to select company in the company page
 	 And  user should be on tasks page 
 	 And user should be click on edit button on task recurring tab
 	 And user should be able to update task at task recurring in the tasks page
  |name  |assign|taskrepeat|date|
  |Task20|Automate Test Admin|1|February 20, 2024|
  Then user should be see the Update task at task recurring tab in the tasks page"Task20"
  
  Scenario: 264. user should be able to create task in the tasks page
  When user should be able to select company in the company page
  Then user should be should recurring task widget count"2"
  
  
    Scenario: 265. User should be able to update fields at recurring tab in the  company task tab
		When user should be able to select company in the company page
 	 And  user should be on tasks page 
   And user should be able to click on task of the company at tasks reoccurring page Task20
    And User should be able to update fields at recurring tab in the  company task tab for task tab
      | taskname            |template|date|
      | Task21 |Qa automation template|February 29, 2024|
   Then user should be able to see the task recurring tab in the  company task tab for task tab"Task21"
  
  
   Scenario: 266. User should be delete task in task recurring tab in the tasks page
  When user should be able to select company in the company page
  And  user should be on tasks page
  And  user should be click on delete btn in task recurring tab in the tasks page
  
   Scenario: 267. user should be able to create task in the tasks page
  When user should be able to select company in the company page
  Then user should be should recurring task widget count"1"
  
 
   Scenario: 268. Validate that user is able to Delete the template from delete button which is inside the template for the company task
    When user should be click on Tasks at sidebar menu for the company task
    And user should be click on tasks template tab for the company task
   And user should click on delete button at the QA Automation Template Page to delete the template for the compnay task
   
  
  
  
 ########################################  COMPANIES NOTES###################################
  
  
  Scenario: 269. validate user should be on company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  Then user should be on company notes page"Notes"
  
  Scenario: 270. validate user should be able to see the add notes popup
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to click on add notes button in the company notes tab
  Then user should be able to see the add notes popup
  
  Scenario: 271. validate user should be able to close the add notes popup
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to click on add notes button in the company notes tab
  And  user should be able to click on reset button at add notes popup
  Then user should be able to close the add notes popup
  
  Scenario: 272. user should be able to see the error on Assign To field at  add notes popup
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to click on add notes button in the company notes tab
  And  user should be able to click on add button at add notes popup
  Then user should be able to see the error on Assign To field "Assigned to can't be blank."
  
  
 Scenario: 273. user should be able to create notes in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to click on add notes button in the company notes tab
  And  user should be able to create notes in the company notes page
  |assign|subject|notes|
  |Automate Test Admin|work|important task|
  Then user should be see the notes at company notes page
  
  
  Scenario: 274. validate user should be able to reply the notes in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to reply the notes in the company notes page
  Then user should be able to see the reply of the notes"Testing Notes"
  
   Scenario: 275. validate user should be able to edit reply notes in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to edit reply the notes in the company notes page
  Then user should be able to see the edit reply of the notes"TestingNotes"
  
   Scenario: 276. validate user should be able to delete reply notes in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to delete reply the notes in the company notes page
  Then user should be able to delete reply successfully of the notes"Reply was deleted successfully"
  
  
   Scenario: 277. user should be able to create Coaching notes in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to click on add notes button in the company notes tab
  And  user should be able to create coaching notes in the company notes page
  |assign|subject|notes|
  |Automate Test Admin|work|important task|
  Then user should be see the coaching notes at company notes page
  
  
  Scenario: 278. user should be able to see the coaching notes at company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to click on coaching tab in the company notes tab
  Then user should be able to see the coaching notes at company notes page
  
  
   Scenario: 279. validate user should be able to reply the notes of coaching tab in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on coaching tab company notes tab
  And  user should be able to reply the notes of coaching tab in the company notes page
  Then user should be able to see the reply on coaching tab of the notes"Testing Notes"
  
   Scenario: 280. validate user should be able to edit reply notes coaching in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on coaching tab company notes tab
  And  user should be able to edit reply the notes Coaching in the company notes page
  Then user should be able to see the edit reply of the notes Coaching"TestingNotes"
  
  
   Scenario: 281. validate user should be able to delete reply notes in the company notes page
  When user should be able to select company in the company page
  And  user should be able to click on coaching tab company notes tab
  And  user should be able to delete reply the notes coaching in the company notes page
  Then user should be able to delete reply successfully of the notes coaching"Reply was deleted successfully"
  
  Scenario: 282. user should be able to search notes at company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to text in the search field  at company notes page"work"
  Then user should be able to see search notes at company notes page
  
  
   Scenario: 283. user should be able to search notes by filter at company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to search notes by filter at company notes page
  Then user should be able to see search notes by filter at company notes page
  
  Scenario: 284. user should be able to reset filter at company notes page
  When user should be able to select company in the company page
  And  user should be able to click on company notes tab
  And  user should be able to reset filter at company notes page
  Then user should be able to see all notes at company notes page
  
  Scenario: 285. user should be able delete staff member details
  When user should be able to select company in the company page
  And  user should be clicked on Details Tab
  And user able to delete staff member details
  
  
  Scenario: 286. user should be able to delete user in the user page for company
  When user should be click on user link on sidebar for the company
  And user should be able to select user in the user for the company"Automate Test Admin"
  And user should be click on edit button in the user page for the company
  And user should be delete the user in the user page for the company
 
 
  Scenario: 287. User should be able to delete title for staff title widget for the company
 When user should be able to click on Settings for the company page
 And 	User should be able to delete title in staff title widget for the company
 Then user should be able to delete contact title successfully in the staff title widget for the company"Title was successfully deleted."
 
  
  
  ##########################COMPANIES>>DOCUMENTS TAB################################
  Scenario: 288. user should be on the document page
  When user should be able to select company in the company page
  And  user should be able to click on document page
  Then user should be on the document page"Documents"
  
  Scenario: 289. user should be able to create folder in the document 
  When user should be able to select company in the company page
  And  user should be able to click on document page
  And user should be able to create folder in the document"Automate Folder"
  Then user should be able to see the folder in the document page"Automate Folder"
  
  Scenario: 290. user should able to edit folder name in the document page
  When user should be able to select company in the company page
  And  user should be able to click on document page
  And  user should be able to click on edit button in the document page
  And  user should be able to update folder name in the document page"ImportantDoc"
  Then user should be able to see the updated name of folder in the document page"ImportantDoc"
  When  user should be able to click on edit button in the document page
  And  user should be able to change the folder name in the document page"Text"
  
  
  Scenario: 291. User should be able to validate document name at upload documents popup in the folder of document page
 	When user should be able to select company in the company page
  And  user should be able to click on document page
  And  user should be able to click on folder of document page
  Then user should be able to validate document name at upload documents popup in the folder of document page "Name can't be blank."
  
  
  Scenario: 292. User should be able to upload document in the folder of document page
 	When user should be able to select company in the company page
  And  user should be able to click on document page
  And  user should be able to click on folder of document page
  And  User should be able to upload document in the folder of document page"Document1"
  Then user should be able to see the upload document in the document folder"Document1"
  
  
  Scenario: 293. User should be able to search document in the folder of document page
 	When user should be able to select company in the company page
  And  user should be able to click on document page
  And  user should be able to click on folder of document page
  And  User should be able to upload document in the folder of document page for search"Document2"
  And  User should be able to search document in the folder of document page"Document2"
  Then user should be able to see the search document in the document folder"Document2"
  
  
  Scenario: 294. User should be able to edit document in the folder of document page
 	When user should be able to select company in the company page
  And  user should be able to click on document page
  And  user should be able to click on folder of document page
  And  User should be able to edit document in the folder of document page"Document"
  Then user should be able to see the updated document in the document folder"Document"
  
  Scenario: 295. User should be able to delete document in the folder of document page
 	When user should be able to select company in the company page
  And  user should be able to click on document page
  And  user should be able to click on folder of document page
  And  User should be able to delete document in the folder of document page
  
  Scenario: 296. Validate user should be able to click on logo in sidebar and navigates to companies list page
  	When user should be able to select company in the company page
  	And  user should be able to click on document page
  	And  user should be click on logo in sidebar
  	Then user should be navigate to companies list page"https://beta.cisin.com:4991/companies"
 
 Scenario: 297. Validate user should be able to click on profile in sidebar and navigates to user profile
 	 When user should be able to select company in the company page
   And  user should be able to click on document page
   And  user should be click on profile in sidebar
   Then user should be able to navigate to user profile"Test admin"
 