Feature: admin creating login details for an employee
  @groupProject
  Scenario: create login for an employee
    #Given user is navigated to HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When  user clicks on PIM option
    And  user clicks on Add Employee option
    When  user enters firstname and middlename and lastname
    And  Admin clicks on Create Login Details box
    Then Create Login Details box is enabled
    When  Admin create username and password and confirm password
   When Admin select status from status drop down
    And Admin clicks on save button
   # And Admin clicks on logout button
    Then Admin is successfully creating a login details for new employee

    @loginTest
 Scenario: trying new login
   #Given user is navigated to HRMS application
  When new employee enters valid username and password
   And new employee clicks on login button
   Then new employee is successfully logged in
