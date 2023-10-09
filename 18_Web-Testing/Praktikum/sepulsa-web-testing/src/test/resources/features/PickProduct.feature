@PickProduct
Feature: Pick product
  As a user
  I want to pick product for myself
  So that I can buy the item

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
    Then I should be redirected to the payment page
