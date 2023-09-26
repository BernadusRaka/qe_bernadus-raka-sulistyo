@SepulsaLogin
Feature: Login to Application
  As a user
  I want to be able to log in to my account
  So that I can access my personalized content

  Background:
    Given the application is open

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter my valid username "myusername" and password "mypassword"
    And I click the "Login" button
    Then I should be logged in successfully

  Scenario: Login with invalid credentials
    Given I am on the login page
    When I enter my invalid username "invaliduser" and password "wrongpass"
    And I click the "Login" button
    Then I should see an error message "Invalid username or password"

  Scenario: Forgotten password
    Given I am on the login page
    When I click the "Forgot Password" link
    Then I should be redirected to the password reset page

  Scenario: Locked account
    Given I am on the login page
    When I enter my valid username "myusername" and password "lockedpassword"
    And I click the "Login" button
    Then I should see an error message

  Scenario: Account not activated
    Given I am on the login page
    When I enter my valid username "myusername" and password "inactivepass"
    And I click the "Login" button
    Then I should see an error message

  Scenario: Guest Login
    Given I am on the login page
    When I choose to log in as a guest
    Then I should be logged in as a guest user

  Scenario: User Toggles Password Visibility
    WWhen I enter my valid username "myusername" and password "mypassword"
    And I click the eye button
    Then I should see my password displayed in plain text

