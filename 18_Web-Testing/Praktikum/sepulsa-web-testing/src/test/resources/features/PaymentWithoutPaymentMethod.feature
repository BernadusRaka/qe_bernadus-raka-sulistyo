@PaymentFailed
Feature: Payment
  As a user
  I want to pay my item
  So that I can pay my item

  Background:
    Given I am on the home page

  Scenario: Login with valid credentials
    When I click on the "Login" button in home page
    And I fill the form with valid email
    And I fill the form with valid password
    And I click on the "Login" button
    And I must be redirected to the home page
    And I click "Pulsa"
    And I fill the form with my phone number
    And I choose "Rp 5000"
    And I must be redirected to the payment page
    And I click "payment"
    Then I see error message "Kamu belum memilih metode pembayaran"
