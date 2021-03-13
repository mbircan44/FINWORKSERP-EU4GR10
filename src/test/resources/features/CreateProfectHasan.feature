@smoke
Feature: Create a Project
  Background:
    Given  user should be able to login As a Postmanager

  Scenario: User should be able to Create a new Project
    When user should enter Project and clicks the create
    Then user should be able to see Project Box
    Then Project Name message box contains “e.g Office Party” text
    Then user can type a project name and save


    Scenario: User should be able to provide an email
      Then user can provide an email


  @wip
    Scenario: User should be able to verify Project Box
    Then if user does not give a name the project there is an error message about invalid box
    Then “Project Name” text and box get red if no name given
    Then created Project appears in the project dashboard
    Then total projects number increased 1 after creating a new project