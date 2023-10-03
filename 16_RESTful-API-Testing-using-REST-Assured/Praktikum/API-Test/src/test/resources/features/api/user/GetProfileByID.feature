Feature: Get User Profile
  As a User
  I want to get complete profile using valid user ID
  So That i can get "200 OK" response

  Scenario: As a user i want to get complete user profile with valid user ID
    Given I set API endpoint to get complete user profile
    When I send request to get user profile
    Then I receive status code 200
    And I receive complete user profile