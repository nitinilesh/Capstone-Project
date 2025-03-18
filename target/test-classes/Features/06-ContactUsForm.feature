@contactUs
Feature: Automating contact us form

  Scenario Outline: Title of your scenario outline
    Given User is on homePage of eCommerce site
    When User Click on Contact us button
    And User verify GET IN TOUCH is visible
    And User enters "<name>" "<email>" "<subject>" "<description>"
    And User click on submit button of contact us form
    And User accept alert pop up window
    And Verify success message "Success! Your details have been submitted successfully." is visible
    Then User Click on Home button

    Examples: 
      | name   | email              | subject          | description                   |
      | Rohit  | rohit99@gmail.com  | fix login button | login button is not clickable |
      | Nilesh | nilesh99@gmail.com | fix home page    | home is not visible properly  |
