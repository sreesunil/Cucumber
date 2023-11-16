Feature:Salesforce Contact 
  @tag1
  Scenario: Add contact 
    Given User is on Login Page
    When User enter valid Username and Password
    And user click on Login
    Then User on Home page
    Then user move to contact page
    Then user create new contact

 