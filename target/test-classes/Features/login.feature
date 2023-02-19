#Author
#Date
#Description

@zoom
Feature: To Test Login Functionality

  @tag1
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login button

    Examples: 
      | username  | password  |
      | testuser@safemail.icu | valgen |