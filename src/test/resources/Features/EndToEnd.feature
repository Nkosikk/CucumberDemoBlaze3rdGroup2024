@EndToEnd
Feature: End to End

  Scenario Outline: As a user i want to login to demo blaze and verify that i can see the home page
    Given login page is displayed
    And I enter username <username>
    And I enter password <password>
    When I click login button
    Then verify that the user has logged in
    And select product
    And add to cart
    And I click ok on the alert
    When I click on Cart at the menu
    Then Verify I am on cart
    And I want to click on the order button
    And I enter order details
    And I click the purchase button
    Examples:
      | username  | password|
      | admin     | admin   |

