@login
Feature: Automating login functionality

  Background: 
    Given User is on homePage of eCommerce site
    And User is on login/signup page of eCommerce site
    Then User verify Login to your account is visible

  @invalidLogin
  Scenario Outline: User is not loggedin
    When User enter invalid "<email>" and "<password>";
    And User click on login button
    Then Verify error message "Your email or password is incorrect!"

    Examples: 
      | email                     | password |
      | invalidEmail123@gmail.com | john123  |
