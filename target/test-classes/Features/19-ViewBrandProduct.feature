@viewBrandProduct
Feature: Automating add branded product to cart

  Scenario: Successfully add branded product to cart
    Given User is on homePage of eCommerce site
    When User Click on Product button
    And User verify Brands are visible
    And User click on any brand
    And User confirms navigation to brand page.
    And User click on any product link
    Then User confirms navigated to product page
