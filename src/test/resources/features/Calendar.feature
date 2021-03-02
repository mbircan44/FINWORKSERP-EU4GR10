
Feature: Calendar

  Background:
    Given User goes to login page
    Then User login with valid credentials


  Scenario: Calendar functionality
    When All users can go to Calendar page
    And Click any cell, create note as Team Meeting and click create
    Then Verify that Open: Team Meeting is displayed
