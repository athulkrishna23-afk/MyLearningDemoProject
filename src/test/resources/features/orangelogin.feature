Feature: Login and Logout Functionality from Orange HRM website

 Scenario: Enter correct login details and login and loggs out
 
 Given User opens OrangeHRM website
 When User enters Correct username
 And user enters correct password
 And  user clicks on login button
 Then user is successfully logged in
 When   User clicks on profile icon
 And User clicks on Logout option
 Then user is logged out
 
