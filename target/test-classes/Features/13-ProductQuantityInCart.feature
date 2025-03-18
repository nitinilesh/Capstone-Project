@quantityInCart
Feature: Automating product quantity in cart

  Scenario: Increase quantity in cart
    Given User is on homePage of eCommerce site
    When User Click on Product button
    And User click on view product
    And User increase quantity to '4'
    And Click add to cart button
    And Click Continue Shopping  button
    And Verify product quantity in cart
    Then Click View Cart button
     
