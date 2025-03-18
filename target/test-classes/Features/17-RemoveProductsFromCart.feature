@removeProductFromCart
Feature: Automating remove products from cart

  Scenario: Successfully removed product from cart
    Given User is on homePage of eCommerce site
    And User Click on Product button
    And User Scroll page down by few pixels
    And User click Add to cart a product
    And Click Continue Shopping  button
    And Click View Cart button
    Then User remove product from cart
