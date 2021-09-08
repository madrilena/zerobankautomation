  @wip
  Feature: Account Activity

    Background: User logged in with valid credentials
      Given the user is on the loginPage
      And the user logins with valid userName and passWord information
      And Account summary page is displayed

      Scenario: Account dropdown default option Savings
        When the user clicks Account Activity tab
        Then the account dropdown default option is "Savings"

      Scenario: Verify Account dropdown options
        When the user clicks Account Activity tab
        And the user clicks Account dropdown button
        Then the dropdown has following options
        | Savings     |
        | Checking    |
        | Savings     |
        | Loan        |
        | Credit Card |
        | Brokerage   |

