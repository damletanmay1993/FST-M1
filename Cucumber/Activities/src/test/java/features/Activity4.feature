@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given Open Homepage
    When User enters "username" and "password" to login
    Then Read the page title and confirmation message for assertion
    And Close the Browser