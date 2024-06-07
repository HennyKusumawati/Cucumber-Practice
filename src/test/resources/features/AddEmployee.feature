Feature: Adding employees using different techniques

  Background:
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee option

  @add_employee @regression @failed
  Scenario: Adding an employee in HRMS system
    When user enters firstname and middlename and lastname
    And user clicks on save button
    Then employee added successfully

    @cucumber @regression
  Scenario: Adding employee from feature file
      When user enters "Dhienny" "MS" "Itsme"
      And user clicks on save button
      Then employee added successfully

    @ddt @regression
 Scenario Outline: Adding employees using data driven testing
      When user enters "<firstname>" and "<middlename>" and "<lastname>"
      And user clicks on save button
      Then employee added successfully
      Examples:
        | firstname | middlename | lastname |
        |Dhienny    |MS          |Aku       |
        |Fouad      |MS          |Oliinyk   |
        |Hermione   |MS          |Granger   |

      @datatable @regression
 Scenario: Adding multiple employees using data table
   When user enters firstname and middlename and lastname from data table and verify
   |firstname|middlename|lastname|
   |harry    |MS        |potter  |
   |hermione |MS        |granger |
   |ron      |MS        |weasley |

  @excel @regression
  Scenario: Adding employees from excel file
    When user adds multiple employees from excel and validate them