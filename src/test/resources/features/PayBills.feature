
  Feature: Pay Bills Page
    Background: User logged in with valid credentials
      Given the user is on the loginPage
      And the user logins with valid userName and passWord information
      And Account summary page is displayed

      Scenario: User completes a successful Pay operation
        When the user clicks Pay Bills tab
        And the user selects "Apple" from Payee
        And the users selects "Loan" from Account
        And the user enters amount as "100"
        And the user enters date as "15/09/2021"
        And the user enters description as "phone"
        And the user clicks Pay button
        Then the successful payment message is shown as "The payment was successfully submitted."