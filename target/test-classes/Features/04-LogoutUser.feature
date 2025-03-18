@logout
Feature: Lougout functionality

  Background: 
    Given User is on homePage of eCommerce site
    And User is on login/signup page of eCommerce site
    Then User verify Login to your account is visible

  Scenario Outline: User successfully logout
    When User enter valid "<email>" and "<password>";
    And User click on login button
    And Verify that Logged in as username is visible
    And User click on logout button
    Then User is on homePage of eCommerce site

    Examples: 
      | email                | password |
      | johnDoe123@gmail.com | john123  |
