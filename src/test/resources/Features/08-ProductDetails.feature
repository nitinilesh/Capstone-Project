@productDetails
Feature: Automate All Products and product detail page

  Scenario: User Successfully product page
    Given User is on homePage of eCommerce site
    When User click on Products button
    And User is navigated to ALL PRODUCTS page successfully
    And User Click on View Product of first product
    And User verify product page is visible
    Then Verify detail is visible: product name, category, price, availability, condition, brand
    
