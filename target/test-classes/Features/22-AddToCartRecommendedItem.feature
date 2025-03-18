@AddToCartRecommendedItems
Feature: Automating add product to cart recommended items

  Scenario: add to cart recommended item functionality
    Given User is on homePage of eCommerce site
    When User scroll to bottom of page
    And User verify "RECOMMENDED ITEMS" are visible
    And User click on Add to cart recommended item
    And Click View Cart button from popup
    Then Verify that product is displayed in cart page
