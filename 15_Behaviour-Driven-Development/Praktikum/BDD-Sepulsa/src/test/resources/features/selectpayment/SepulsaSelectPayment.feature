@SepulsaSelectPayment
Feature: Choose Payment Method
  As a user
  I want to be able to choose various payment methods
  So that I can complete my purchase

  Background:
    Given the application is open
    And I have selected the products to purchase

  Scenario: Guest Payment Without Providing Buyer Details
    When I choose the "Guest" payment mode
    And I proceed with payment without providing buyer details
    Then I should be able to complete the payment

  Scenario: Guest Payment with Promo without Login
    When I choose the "Guest" payment mode
    And I apply a promo code without logging in with a registered account
    Then I should be able to complete the payment with the applied promo

  Scenario: Guest Payment with Invalid Email
    When I choose the "Guest" payment mode
    And I enter an invalid email address
    And I proceed with payment
    Then I should see an error message indicating an invalid email

  Scenario: Guest Payment with Valid Email
    When I choose the "Guest" payment mode
    And I enter a valid email address
    And I proceed with payment
    Then I should be able to complete the payment

  Scenario: Guest Payment with Registered Email
    When I choose the "Guest" payment mode
    And I enter an email address that is already registered
    And I proceed with payment
    Then I should be able to complete the payment

  Scenario: Continue Payment for Logged-In User
    Given I am logged in with my account
    When I choose to continue with the payment
    Then I should be able to complete the payment

  Scenario: Continue Payment for Logged-In User with Invalid Promo
    Given I am logged in with my account
    When I choose to continue with the payment
    And I apply an invalid promo code
    Then I should see an error message indicating an invalid promo code
    And I should not be able to complete the payment

  Scenario: Continue Payment for Logged-In User with Valid Promo
    Given I am logged in with my account
    When I choose to continue with the payment
    And I apply a valid promo code
    Then I should be able to complete the payment with the applied promo

  Scenario: Continue Payment for Logged-In User with Other Payment Options
    Given I am logged in with my account
    When I choose to continue with the payment
    And I select a payment method other than those available on the initial page
    Then I should be able to complete the payment using the selected method

  Scenario: View Payment Details
    When I choose to view the payment details
    Then I should be able to see the details of my payment before completing it
