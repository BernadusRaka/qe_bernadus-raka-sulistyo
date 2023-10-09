@LoginSteps
Feature: Login
  As a user
  I want to login
  So that I can access products page

  Background:
    Given I am on the login page

  Scenario: Login with valid credentials
    When I fill the form with valid username
    And I fill the form with valid password
    And I click on the "Login" button
    Then I should be redirected to the home page



Scenario: As a locked user I cannot access products page
    When I fill the form with locked username
    And I fill the form with valid password
    And I click on the "Login" button
    Then I received error message "Epic sadface: Sorry, this user has been locked out."

