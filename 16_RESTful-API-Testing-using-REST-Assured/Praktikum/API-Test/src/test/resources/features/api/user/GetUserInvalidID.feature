Feature: Get user
  As a user
  I want to input invalid user id
  So that I can receive "404 not found" response

  Scenario: As a user i can try to send invalid id to get nothing
    Given I set API endpoint with an invalid ID
    When I send request using invalid ID
    Then I receive error message and "404 Not Found" response
