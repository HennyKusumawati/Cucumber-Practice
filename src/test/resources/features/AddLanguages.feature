Feature: Admin adding different languages from qualifications
  @UStory13
  Scenario: Add Languages
   # Given user is navigated to HRMS application
    When user enters valid username and password
   And user clicks on login button
  And user is successfully logged in
    When user clicks on Admin button
    And Admin navigated to qualifications
    And Admin clicks on Languages
    And Admin add any language
   And Admin clicks save button
    Then Admin user successfully add languages

    #Scenario: Add many languages from data table
   # And Admin add many languages
     # |Languages|
     # |Bahasa   |
     # |Korean   |
     # |Japanese |
