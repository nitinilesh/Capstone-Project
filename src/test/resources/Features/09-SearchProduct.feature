@searchProduct
Feature: Automate Search Products 

  Scenario: User Search Product Successfully 
    Given User is on homePage of eCommerce site
    When User click on Products button
    And User is navigated to ALL PRODUCTS page successfully
    And User search product and click search button
    And User Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to search are visible