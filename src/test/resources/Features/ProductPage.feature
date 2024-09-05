@productPage
Feature: Product Page
  Background:
    Given login page is displayed
    And I enter username admin
    And I enter password admin
    When I click login button

  Scenario: As a user i want to add a product to the cart on demo blaze product page
    Given that the user has logged in
    And select product
    And add to cart

