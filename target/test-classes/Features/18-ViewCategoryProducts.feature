@viewCategory
Feature: Automating view category products funtionality

  Scenario: View category products successfully
    Given User is on homePage of eCommerce site
    When User verify that categories are visible on left side bar
    And User click on Women category
    And User click on Dress link under Women category
    And User verify that category page is displayed
    And User confirm text 'Sleeveless Dress'
    And User click on any sub-category link of Men category
    Then Verify that user is navigated to that category page
