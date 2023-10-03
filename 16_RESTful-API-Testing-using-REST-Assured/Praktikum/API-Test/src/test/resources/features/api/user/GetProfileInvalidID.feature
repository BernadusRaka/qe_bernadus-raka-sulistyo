Feature: Get User Profile Using Invalid ID
  As a user
  I want to input invalid user id to get profile
  So that I can receive "404 not found" response

  Scenario: As a user i want to get complete user profile with invalid user ID
    Given I set API endpoint with an invalid ID to get user profile
    When I send request to get user profile using invalid ID
    Then I receive error message and "404 Not Found" response
