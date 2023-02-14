Feature: Attestations under Human Resources Setup Functionality

  Background: Login with valid username and password
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Admin User should be able to Add Attestations
    Given Navigate to Attestations
     When Create a Attestetions name
     Then Success message should be displayed
  @Regression
  Scenario: Admin User should be able to Edit Attestations
    Given Navigate to Attestations
    When Edit a Attestetions name
    Then Success message should be displayed
  @Regression
  Scenario:  Admin User should be able to Delete Attestations
    Given Navigate to Attestations
    And Delete a Attestetions name
    Then Success message should be displayed


