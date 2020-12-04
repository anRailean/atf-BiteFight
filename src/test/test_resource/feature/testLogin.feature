@TestLogin
Feature: Test Login Scenario

  Background: BiteFight is opened
    Given User clicks on 'Login' button
    When User clicks on close button
    Then User is on 'Login Page'

  Scenario: Validate login process
    Given User is logged
    And User clicks on direct
    When User is available
    Then Close the window