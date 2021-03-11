Feature: Create a Project

  Scenario: User should be able to log in postmanager
    When user should enter Project and clicks the create
    Then user should be able to see Project Box
    Then Project Name message box contains “e.g Office Party” text
    Then user can type a project name and save
    Then user can provide an email
    Then if user does not give a name the project there is an error message about invalid box
    Then “Project Name” text and box get red if no name given
    Then created Project appears in the project dashboard
    Then total projects number increased 1 after creating a new project