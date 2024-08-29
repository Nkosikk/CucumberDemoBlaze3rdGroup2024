Feature: Login Page

  Scenario Outline: As a user i want to verify that i can successfully login using valid login details
    Given User clicks Login page modal
    When  User enters username <username>
    And  User enters password <password>
    And  User clicks login button
    Then User to verify they are successfully logged in to site.
    Examples:
      | username | password |
      | admin    | admin    |