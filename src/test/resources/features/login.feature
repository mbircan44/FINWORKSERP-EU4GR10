@login
Feature:Users should be able to login

  Background:
    Given the user is on the login page
@wip
    Scenario: Login as a sales manager
      When the user enters the sales manager information
      Then the user should be able to login as sales manager

@wip
  Scenario: Login as a pos manager
     When the user enters the pos manager information
     Then the user should be able to login as pos manager

  Scenario: Login as a inventory manager
    When the user enters the inventory manager information
    Then the user should be able to login as inventory manager
@wip
  Scenario: login as a expenses manager
    When the user enters the expenses manager information
    Then the user should be able to login as expenses manager

  Scenario: login as a manufacturing User
    When the user enters the manufacturing User information
    Then the user should be able to login as manufacturing User