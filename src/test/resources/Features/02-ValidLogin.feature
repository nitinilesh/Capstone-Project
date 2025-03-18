@login
Feature: Automating login functionality

  Background: 
    Given User is on homePage of eCommerce site
    And User is on login/signup page of eCommerce site
    Then User verify Login to your account is visible

  @validLogin
  Scenario Outline: User successfully loggedin
    When User enter valid "<email>" and "<password>";
    And User click on login button
    Then Verify that Logged in as username is visible

    Examples: 
      | email                | password |
      | johnDoe123@gmail.com | john123  |

