@loginBeforeCheckout
Feature: Automating login before checkout functionality

  Background: 
    Given User is on homePage of eCommerce site
    And User is on login/signup page of eCommerce site
    Then User verify Login to your account is visible

  @validLogin
  Scenario Outline: User successfully loggedin before checkout
    When User enter valid "<email>" and "<password>";
    And User click on login button
    Then Verify that Logged in as username is visible
    And User Click on Product button
    And User Scroll page by few pixels
    And User click Add to cart of product
    And User click Continue Shopping  button
    And Click View Cart button
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    Then Verify success message 'Congratulations! Your order has been confirmed!'

    Examples: 
      | email                | password |
      | johnDoe123@gmail.com | john123  |
