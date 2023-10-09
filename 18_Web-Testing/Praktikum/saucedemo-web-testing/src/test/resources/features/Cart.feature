@AddProductToCart
Feature: Cart
  As a user
  I want to add item to the cart
  So that I can buy the item

  Background:
    Given I am on the login page
    When I fill the form with valid username
    And I fill the form with valid password
    And I click on the "Login" button

  Scenario: As a user I can add item to the cart
    Given I should be redirected to the home page
    When I add item to the cart
    Then Product is added to the cart
