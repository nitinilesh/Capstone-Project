@signupExistingEmail
Feature: Signup using existing email id

  Scenario Outline: Signup is not successful
    Given User verifies that the home page is visible
    When User verifies "New User Signup!" is visible
    And User enters "<name>", "<email>"
    Then User verify error message

    Examples: 
      | name     | email                |
      | John Doe | johnDoe123@gmail.com |
