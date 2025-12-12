Feature: Register Page functionality
Scenario: Navigate to Register Page 

Scenario: Enter required data for registration
Given User launches nopcommerse website
When  User hovers over profile icon
And User click on Register option
Then User is taken to Register Page
When User enters the required data firstName as "Athul" and Emailid as "d9581067@gmail.com"
And User enters username "athul229"
And User clicks check availability button
And User clicks Register button
Then User is succefully Registered


Scenario: Selecting fashionn
Given User launches nopcommerse website
When  User hovers over profile icon
And User click on Register option
Then User is taken to Register Page
When User enters the required data firstName as "Athul" and Emailid as "d9581067@gmail.com"
And User enters username "athul229"
And User clicks check availability button
And User clicks Register button
Then User is succefully Registered


