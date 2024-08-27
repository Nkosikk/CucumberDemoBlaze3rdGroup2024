@EndToEnd @Login
Feature: Landing Page

  Scenario: As a user i want to verify that i am on landing page
    Given Landing page is displayed


  Scenario: As a user i want to click the login button on the landing page
    Given Landing page is displayed
    And I click on the Log in Button
    Then The log in pop up  Alert must be displayed