@registrationTest
Feature: Automating User Registration

  Scenario Outline: Successful User Registration
    When User verifies that the home page is visible
    And User verifies "New User Signup!" is visible
    And User enters "<name>", "<email>"
    And User verify "ENTER ACCOUNT INFORMATION" is visible
    And User enters account information "<password>", "<day>", "<month>", "<year>"
    And User enters address information "<firstName>", "<lastName>", "<company>", "<address>", "<address2>", "<country>", "<state>", "<city>", "<zipcode>", "<mobileNumber>"
    And User submits the create account form
    And User verifies that "ACCOUNT CREATED!" is visible
    And User clicks on the continue button
    And User verifies that LoggedIn is visible
    And User clicks on the 'Delete Account' button and continue
    Then User should see home page is visible
    Examples:
      | name         | firstName | lastName | email             | password  | day | month | year | company | address | address2 | country | state     | city   | zipcode | mobileNumber |
      | Nilesh Patel | Nilesh    | Patel    | nilesh1@gmail.com | nilesh123 |  15 | March | 2014 | ola     | tg road | kota     | India   | Rajasthan | jaipur |  700554 |    584579654 |
