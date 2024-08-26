@LandingPage
Feature: End to End

  Scenario: As a user i want to verify that i am on landing page
    Given Landing page is displayed
    Then  click login on navigation bar


#
#  Scenario Outline:
#    Given Login modal is displayed
#    And user enters username <username>
#    And user enters password <password>
#    Then click login button
#    Examples:
#      | username | password |
#      | admin    | admin    |
#

