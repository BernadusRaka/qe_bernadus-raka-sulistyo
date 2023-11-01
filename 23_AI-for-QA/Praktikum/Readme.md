Feature: Sign-up Feature

  Scenario: User successfully signs up
    Given the user is on the sign-up page
    When the user fills in a valid username and password
    And clicks the "Sign Up" button
    Then the user is redirected to the homepage
    And a success message "Account created successfully" is displayed
    And the user is logged in with the newly created account

  Scenario: User with an existing username attempts to sign up
    Given the user is on the sign-up page
    And there is an existing user with the username "existing_user"
    When the user fills in the username "existing_user" and a valid password
    And clicks the "Sign Up" button
    Then the user sees an error message "Username already exists"
    And remains on the sign-up page
    And is not logged in

  Scenario: User attempts to sign up with empty username and password
    Given the user is on the sign-up page
    When the user leaves both the username and password fields empty
    And clicks the "Sign Up" button
    Then the user sees an error message "Both username and password are required"
    And remains on the sign-up page
    And is not logged in



Feature: Buy Items Feature

  Scenario: User successfully buys items and checks out
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Buy" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Checkout"
    And the user fills out the confirmation form with valid details:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     | 1234 5678 9012 3456 | 12   | 2024 |
    And the user clicks "Purchase"
    Then the user should receive a confirmation message
    And the user should be redirected to the thank you page

  Scenario: User tries to checkout with an invalid credit card information
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Buy" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Checkout"
    And the user fills out the confirmation form with invalid credit card information:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     | Credit Card Number | 12    | 2024 |
    And the user clicks "Purchase" 
    Then the user should see an error message indicating an invalid credit card number
    And the user should remain on the confirmation form page

  Scenario: User tries to checkout with an empty user information
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Buy" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Checkout"
    And the user fills out the confirmation form with invalid credit card information:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      |                  |              |         | 1234 5678 9012 3456| 12    | 2024 |
    And the user clicks "Purchase" 
    Then the user should see an error message indicating an invalid credit card number
    And the user should remain on the confirmation form page

  Scenario:  User tries to checkout with an empty credit card information
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Buy" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Checkout"
    And the user fills out the confirmation form with valid details:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     |                    |       |      |
    And the user clicks "Purchase"
    Then the user should receive a confirmation message
    And the user should be redirected to the thank you page
