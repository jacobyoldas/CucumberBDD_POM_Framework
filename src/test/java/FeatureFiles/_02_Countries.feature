Feature: Countries Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully

  Scenario: Create Country

    When User create country
    Then Success message should be displayed

    Scenario: Edit Country

      When User edit country
      Then Success message should be displayed

  Scenario: Delete Country

    When User delete country
    Then Success message should be displayed
