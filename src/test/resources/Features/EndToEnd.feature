@EndToEnd
Feature: End to End

  Scenario Outline: As a user I want to purchase an item od dem Blaze
    Given Login modal is displayed
    And user enters username <username>
    And user enters password <password>
    When click login button
    Then verify that the user has logged in
    And select product
    And add to cart
    Examples:
      | username | password |
      | admin    | admin    |