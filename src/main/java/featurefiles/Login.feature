Feature: Login feature

  
  @tag1
  Scenario: Login with valid Credentials
    Given User is on Login Page
    When User enter valid Username and Password
    And user click on Login
    Then User on Home page
    
    
    
    
   @tag2
  Scenario: Wrong Credentials
    Given User is on Login Page
    When User enter wrong username and password
    And  user click on Login 
    Then  user get error message
    
    
    
    
@tag3
  Scenario: Forgot Password
    Given User is on Login Page
    When User enter username 
    When user click on forgot password
    Then user provide gmail id
    And click on continue
    Then  user should get password setting message
    