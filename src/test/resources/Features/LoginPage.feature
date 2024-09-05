@loginPage
  Feature: Login Page
    Scenario Outline: As a user i want to login to demo blaze and verify that i can see the home page
      Given login page is displayed
      And I enter username <username>
      And I enter password <password>
      When I click login button
      Then verify that the user has logged in
      Examples:
        | username  | password
        | admin     | admin
