@searchProductVerifyAfterLogin
Feature: Automate search products and verify cart after login

  Scenario Outline: Successfully search products and verify cart after login
    Given User is on homePage of eCommerce site
    When User click on Products button
    And User is navigated to ALL PRODUCTS page successfully
    And User search product and click search button
    And User Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    And Add all those products to cart also click Continue button
    And User click Cart button
    And User verify that products are visible in cart
    And User is on login/signup page of eCommerce site
    And User enter valid "<email>" and "<password>";
    And User click on login button
    And User click Cart button
    And User verify that products are visible in cart
    And Remove all products that have been added
    Then Verify 'Cart is empty! Click here to buy products.' is visible

    Examples: 
      | email                | password |
      | johnDoe123@gmail.com | john123  |
