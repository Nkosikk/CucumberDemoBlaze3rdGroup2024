Feature: Landing Page

  Scenario Outline: As a user i want to verify that i am on landing page
    Given Landing page is displayed
    Then click login on navigation bar
    And enter username <username>
    And enter password <password>
    Then click login button
    Examples:
      | username | password |
      | admin    | admin    |

  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the login page
    When the user enters an invalid username or password
    And clicks the login button
    Then an error message should be displayed

  Scenario: Login attempt with an empty username
    Given the user is on the login page
    When the user leaves the username field empty
    And enters a valid password
    And clicks the login button
    Then an error message indicating the username is required should be displayed

  Scenario: Login attempt with an empty password
    Given the user is on the login page
    When the user enters a valid username
    And leaves the password field empty
    And clicks the login button
    Then an error message indicating the password is required should be displayed
