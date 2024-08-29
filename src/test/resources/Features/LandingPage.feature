Feature: Landing Page

  Scenario: As a user i want to verify that i am on landing page
    Given Landing page is displayed
    When  User verifies login page link visible
    And  User clicks login page link
    Then  Login page pop-up is displayed 
