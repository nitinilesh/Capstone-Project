@subscriptionHomePage
Feature: Verify Subscription in home page

  Scenario Outline: Successfully verfied subcription in home page
    Given User is on homePage of eCommerce site
    When User Scroll down to footer
    And User Verify text SUBSCRIPTION
    And User enter "<email>" and click arrow button
    Then Verify success message 'You have been successfully subscribed!'
	Examples:
	| email |
	| nilesh98@gmail.com |
