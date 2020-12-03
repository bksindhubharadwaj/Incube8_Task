Feature: To navigate to IMDB and create account

  Scenario Outline: Create accounts
    Given Landing page navigation
    Then click on create new account
    Then user enters name, email and password with prefix as "<prefix>"
    Then user clicks on submit

    Examples:
    |prefix|
    |dummy|

