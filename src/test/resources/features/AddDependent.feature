Feature: Employee add dependants in their profile
  @UStory49
  Scenario: add one dependant
    #Given user is navigated to HRMS application
    When new employee enters valid username and password
    And new employee clicks on login button
    Then new employee is successfully logged in
    When new employee clicks on My Info Option
    And new employee clicks on Dependents Option
    And new employee clicks on Add button
    When new employee enters dependent name
    And new employee selects the relationship
    And new employee enters the dependent's date of birth
    And new employee clicks on save button
    Then new employee should see the dependent's data
