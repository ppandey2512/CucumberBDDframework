

Feature: feature to test login functionality

@smoketest

  Scenario: Check login is successful with valid credentials
  
    Given user is on login page
    When user enters username and password
    And clcik on login buitton
    Then user is navigated to the home page
    
    
