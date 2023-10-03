Feature: Change user data
  As a user
  I want to change user data
  So that the user data is changed

  Scenario Outline: As a user I can update user data with valid inputs
    Given I set API endpoint for change user data
    When I send request to fill user data with valid id "<id>", userId "<userId>", title "<title>", and body "<body>"
    Then I receive status code 200
    And I receive valid data for changed user data
    Examples:
    |id |userId |title  |body |
    |1  |1      |title  |body |
