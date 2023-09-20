Feature: feature to test login functionality

@smoketest
#Scenario: Check login successful with valid credentials
#For Parameterization we can change Scenario to Scenario Outline
Scenario Outline: Check login successful with valid credentials

Given user is on login page
#When user enters username and password
#For Parameterization we can change username and password like this
When user enters <username> and <password>
And clicks on login button
Then user is navigated to home page


Examples: 
| username | password |
| standard_user | secret_sauce|