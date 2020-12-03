Feature: To navigate to IMDB and sign in

  Scenario Outline: Sign In
    Given Sign In Landing page navigation
    Then user clicks on sign in
    Then user enters  email as "<email>" and password as "<password>"
    Then user clicks on login
    Then check if user name as "<name>" is displayed

    Examples:
      |email|password|name|
      |bksindhubharadwaj@gmail.com|airtest123|Sindhu|
