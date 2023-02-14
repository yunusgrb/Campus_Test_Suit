Feature: User-3 Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Document Types create

    Given Navigate to documents type
    When Create documents type
    Then Success message should be displayed
  @Regression
  Scenario: Document Types edit

    Given Navigate to documents type
    When edit documents type
    Then Success message should be displayed
  @Regression
  Scenario: Document Types delete

    Given Navigate to documents type
    When delete documents type
    Then Success message should be displayed