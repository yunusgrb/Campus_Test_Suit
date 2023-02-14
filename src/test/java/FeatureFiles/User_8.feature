Feature: Departments under School Setup Functionality

  Background: Login with valid username and password
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Admin User should be able to Add-Edit-Delete Departments
    Given Navigate to Departments
    When Create a Departments name
    Then Success message should be displayed
    When Edit a Departments name
    Then Success message should be displayed
    When Delete a Departments name
    Then Success message should be displayed