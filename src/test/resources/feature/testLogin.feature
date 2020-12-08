@TestLogin
Feature: Test Login Scenario

  Background: BiteFight is opened


  Scenario: Validate login process
    Given User is logged in bite fight
    And User is on 'Overview Page'
    When User is available
    Then Close the window