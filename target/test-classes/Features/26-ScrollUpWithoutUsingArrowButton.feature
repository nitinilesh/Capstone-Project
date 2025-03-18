@scrollUpWithoutArrow
Feature: Automating scroll using arrow button

  Scenario Outline: Successfully scroll up using arrow
    Given User is on homePage of eCommerce site
    And User Scroll down to footer
    And User Verify text SUBSCRIPTION
    And User scroll up without arrow button
    Then User verify Full-Fledged practice website for Automation Engineers is visible
