@UserLogin
Feature: Login
  As a user
  I want to login
  So that I can access products page

  Background:
    Given I am on the home page

  Scenario: Login with valid credentials
    When I click on the "Login" button in home page
    And I fill the form with valid email
    And I fill the form with valid password
    And I click on the "Login" button
    Then I should be redirected to the home page


