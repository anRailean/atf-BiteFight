@TestLogin
Feature: Test Login Scenario

  Background: BiteFight is opened


  Scenario: Validate login process
    Given User is logged in bite fight
    Then User is on 'Account Page'
