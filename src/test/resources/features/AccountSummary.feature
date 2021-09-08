
Feature: Account Summary Page

  Background: User logged in with valid credentials
    Given the user is on the loginPage
    And the user logins with valid userName and passWord information


  Scenario: Verify account summary page title is "Zero – Account summary"
    When Account summary page is displayed
    Then Account summary page title is "Zero – Account summary"


  Scenario: Verify account summary page account types
    When Account summary page is displayed
    Then Account summary page have to following account types
    | Cash Accounts       |
    | Investment Accounts |
    | Credit Accounts     |
    | Loan Accounts       |


  Scenario:
    When Account summary page is displayed
    Then Credit Accounts table have following columns
    | Account    |
    | Credit Card|
    | Balance    |