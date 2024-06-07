Feature: Employee search related scenarios

  Background:
   # Given user is navigated to HRMS application => we no longer need this bc we have hooks
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Employee list option

  @smoke @sprint2 @ana @regression
  Scenario: Search employee by id
   # Given user is navigated to HRMS application
  #  When user enters valid username and password
   # And user clicks on login button
   # Then user is successfully logged in
  #  When user clicks on PIM option
  #  And user clicks on Employee list option
    When user enters valid employee id
    And user clicks on search button
    Then user see the employee information

  @regression @ali @sprint3
  Scenario: Search employee by name
    When user enters valid employee name
    And user clicks on search button
    Then user see the employee information