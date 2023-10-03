Feature: Create an user
  As a user
  I want to create a new user
  So that the user data is saved

  Scenario Outline: As a user I can create an user with valid inputs
    Given I set API endpoint for create new user
    When I send request to fill user data with valid id "<id>", userId "<userId>", title "<title>", and body "<body>"
    Then I receive status code 201
    And I receive valid data for create new user
    Examples:
      | id  | userId | title  | body |
      | 1   | 1      | title  | body |