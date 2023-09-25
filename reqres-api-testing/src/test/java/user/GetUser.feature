Feature: Retrieve User Data from API

  Scenario: Retrieve User Data using the GET Method
    Given I have access to the user API
    When I make a GET request to retrieve user data with id 123
    Then the response status code should be 200
    And the JSON response should contain:
      | id         | 123             |
      | name       | John Doe        |
      | email      | john@example.com|
      | first_name | John            |
      | last_name  | Doe             |
