
Feature: Datadriven Testing
  

 
  Scenario Outline: Login With different Username and Password
    Given user on login page
    When user enter "<username>" and "<password>"
    When user click on login button
    Then user gets error message

    Examples: 
      | username  | password |
      | sreesunil@gmail.com |     235 |  
      | 1234@gmail.com |    hellojava|
