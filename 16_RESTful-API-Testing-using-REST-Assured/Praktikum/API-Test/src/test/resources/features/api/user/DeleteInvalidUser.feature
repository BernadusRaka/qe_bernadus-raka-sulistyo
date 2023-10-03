Feature: Delete user
  As a user
  I want to delete user data
  So that the user data can be removed

  Scenario: As a user I can delete user with valid ID
    Given I set API endpoint for delete user with invalid id
    When I send request to delete user with invalid ID
    Then I receive error message and "404 Not Found" response
