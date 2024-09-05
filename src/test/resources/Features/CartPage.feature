@cartPage
Feature: Cart Page
  Background:
    Given login page is displayed
    And I enter username admin
    And I enter password admin
    When I click login button

  Scenario: As a user i want to add a product to the cart on demo blaze product page
    Given that the user has logged in
    When I click on Cart at the menu
    Then Verify I am on cart
    And I want to click on the order button
    And I enter order details
    And I click the purchase button

