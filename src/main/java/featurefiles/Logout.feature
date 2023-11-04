
Feature: Logout feature
  

  @tag1
  Scenario: Logout
    Given User is on Login Page
    When User enter valid Username and Password
    And user click on Login
    Then User on Home page
    And user select profile name
    Then User click on Logout
    

  