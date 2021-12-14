Feature: validating login function of facebook application

Scenario: validating with incorrect user name and incirrect password 
Given i am going launch facebook application on chrome browser 
When i am entering in correct user name and incorrect password 
And i am clicking login button
Then i going to verfiy the error message
And Close the browser





