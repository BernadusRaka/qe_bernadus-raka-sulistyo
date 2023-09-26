@LinkedIn
Feature: LinkedIn Home Page for Non-Premium Users
  As a user
  I want to verify the functionality of various features on the LinkedIn home page
  So that I can ensure a seamless experience as a non-Premium member

  Background:
    Given I is logged in to my LinkedIn account
    And I does not have LinkedIn Premium

  Scenario:   My Network feature
    When I clicks on "My Network"
    Then I should be taken to the "My Network" pages
    And I should see suggestions for connecting with other LinkedIn members
    And I should be able to send connection requests

  Scenario:   Jobs feature
    When I clicks on "Jobs"
    Then I should be taken to the "Jobs" page
    And I should be able to search for job listings
    And I should be able to view job details and apply for jobs

  Scenario:   Messaging feature
    When I clicks on "Messaging"
    Then I should be taken to the "Messaging" page
    And I should be able to send and receive messages to and from connections
    And I should be able to start new conversations

  Scenario:   Notifications feature
    When I clicks on "Notifications"
    Then I should be taken to the "Notifications" page
    And I should see notifications related to their network and activity

  Scenario:   My Profile feature
    When I clicks on the profile picture
    Then I should be taken to their own profile page
    And I should be able to edit their profile information

  Scenario:   LinkedIn for Business feature
    When I clicks on "LinkedIn for Business"
    Then I should be taken to the "LinkedIn for Business" page
    And I should see information and resources related to business and marketing on LinkedIn

  Scenario:   Try Premium feature
    When I clicks on "Try Premium"
    Then I should be taken to the Premium upgrade page
    And I should see information about Premium features and pricing
    And I should have the option to upgrade to LinkedIn Premium

  Scenario: Creating a Post
    When I clicks on "Create Post"
    And I can selects content type
    And I clicks on "Post"
    Then The post should be created and visible in the user's feed

  Scenario: Creating a Post by click "Media" Button
    When I clicks on "Media"
    Then I redirected to "upload media" page

  Scenario: Creating a Post by click "Event" Button
    When I clicks on "Event"
    And I fills in the event details
    And I clicks on "Create"
    Then the event "My Networking Event" should be created
    And I should be redirected to the event page
    And the event details should be accurate

  Scenario: Creating a Post by click "Article" Button
    When I clicks on "Article"
    Then I redirected to "upload from computer" page




