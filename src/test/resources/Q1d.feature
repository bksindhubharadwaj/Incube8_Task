Feature: Assertions

  Scenario Outline: Assertions for attributes
    Given Home page navigation
    Then assert for title of episode as "<title>"
    Then assert for the rating as "<rating>"
    Then assert for number of reviews

    Examples:
    |title|rating|
    |Game of Thrones|9.3|
    |Friends        |8.9|

