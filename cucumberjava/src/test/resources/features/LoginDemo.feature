Feature: Test Login functionality

  Scenario: Check login is successfulwith valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user click on login 
    Then user navigate to home page

    
    
    
    
    
  