Feature: User-1 Scenario


  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Human resources position categories create
    Given Navigate to position categories
    When Create position categories
    Then Success message should be displayed

  @Regression
  Scenario: Human resources position edit
    Given Navigate to position categories
    When Edit user position
    Then Success message should be displayed
  @Regression
  Scenario: Human resource position delete
    Given Navigate to position categories
    When Delete user position
    Then Success message should be displayed