@registerWhileCheckout
Feature: Automate Place Order: Register while Checkout

  Scenario Outline: User Successfully register while checkout
    Given User is on homePage of eCommerce site
    When User Click on Product button
    And Hover over first product and click Add to cart
    And Click Continue Shopping  button
    And Click View Cart button
    And Click Proceed To Checkout
    And Click on Register/login button
    And User verifies "New User Signup!" is visible
    And User enters "<name>", "<email>"
    And User verify "ENTER ACCOUNT INFORMATION" is visible
    And User enters account information "<password>", "<day>", "<month>", "<year>"
    And User enters address information "<firstName>", "<lastName>", "<company>", "<address>", "<address2>", "<country>", "<state>", "<city>", "<zipcode>", "<mobileNumber>"
    And User submits the create account form
    And User verifies that "ACCOUNT CREATED!" is visible
    And User clicks on the continue button
    And User verifies that LoggedIn is visible
    And User Click on Cart button
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message 'Congratulations! Your order has been confirmed!'
    Then User clicks on the 'Delete Account' button and continue

    Examples: 
      | name         | firstName | lastName | email             | password  | day | month | year | company | address | address2 | country | state     | city   | zipcode | mobileNumber |
      | Nilesh Patel | Nilesh    | Patel    | nilesh25@gmail.com | nilesh123 |  15 | March | 2014 | ola     | tg road | kota     | India   | Rajasthan | jaipur |  700554 |    584579654 |
