Feature: To test Google Search functionality

Scenario: Validate Google Search

Given browser is open
And user is on google search page
When user enters text on search bar
And hits
Then user is navigated to page