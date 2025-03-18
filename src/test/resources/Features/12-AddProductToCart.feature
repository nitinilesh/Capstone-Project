@addToCart
Feature: Automating add product to cart

  Scenario: add to cart functionality
    Given User is on homePage of eCommerce site
    When User Click on Product button
    And Hover over first product and click Add to cart
    And Click Continue Shopping  button
    And Hover over second product and click Add to cart
    And Click Continue Shopping  button
    And Click View Cart button
    And Verify both products are added to Cart
    Then Verify their prices, quantity and total price
