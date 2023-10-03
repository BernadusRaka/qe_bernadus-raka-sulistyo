Feature: Create an user
  As a user
  I want to create a new user using invalid ID
  So that the user data is saved

  Scenario : As a user I can create an user with valid inputs
    Given I set API endpoint for create new invalid user
    When I send request to create user with empty body
    Then I receive error message and "404 Not Found" response