Feature: Users should be able to login

  Background: Navigate to url
    Given the user is on the loginPage

  Scenario: Login with valid credentials
    When the user logins with valid userName and passWord information
    Then Account summary page is displayed


  Scenario Outline: Login with invalid credentials
    When the user logins with invalid "<Username>" and "<Password>" credentials
    Then the user should be see error message

    Examples:
      | Username                   | Password        |
      | wrongUsername              | password        |
      | username                   | wrongPassword   |
      | wrongUsername              | wrongPassword   |
      |                            | password        |
      | username                   |                 |
      |                            |                 |
