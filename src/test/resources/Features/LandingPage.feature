@EndToEnd @Login
Feature: Landing Page

  Scenario: As a user i want to click the login button on the landing page
    Given Landing page is displayed
    And I click on the Log in Button
    Then The log in pop up  Alert must be displayed
    And I enter the username admin
    And I enter the password admin
    And I click on the Log in  on the pop up
    And Verify the I am logged in
    And I click on the Cart button
    Then I empty the Cart
    And I click on the home page
    Then I click on the Samsung galaxy sSix
    And I click add to cart
    And I click on the Cart button
    Then I click the Place Order button to order
    And I enter my username
    And I enter country
    And I enter city
    And I enter my Credit Card number
    And I enter the month
    And I enter the year
    Then I click the Purchase Button