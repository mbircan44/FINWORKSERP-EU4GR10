
Feature: Calendar

  Background:
    Given the user is on the login page
    When the user enters the inventory manager information


  Scenario: Calendar functionality
    When User goes to Calendar page
    And Click any cell, create note as Team Meeting and click create
    Then Verify that Open: Team Meeting is displayed
