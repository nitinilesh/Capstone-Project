@addReviewProduct
Feature: Automating add review on product

  Scenario Outline: User Successfully added review to product
    Given User is on homePage of eCommerce site
    When User click on Products button
    And User is navigated to ALL PRODUCTS page successfully
    And User Click on View Product
    And User Verify 'WRITE YOUR REVIEW' is visible
    And User enter "<name>" "<email>" and "<review>"
    And User click Submit button
    Then Verify message after review 'Thank you for your review.'
    Examples:
    | name | email | review |
    | Nilesh | nilesh90@gmail.com | Project quality of very good |