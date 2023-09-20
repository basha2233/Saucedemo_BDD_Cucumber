Feature: Check login Functionality

  Scenario: 
    Given user is on login page
    When user enters valid username and password
    And click on login button
    Then user is navigated to the homepage
