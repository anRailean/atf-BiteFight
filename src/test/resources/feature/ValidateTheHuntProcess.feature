@HuntProcess
Feature: Validate the hunt process

  Background: BiteFight is opened

  Scenario: Validate the all Man Hunt processes
    Given User is logged in bite fight
    And User is on "Overview Page"
    And User clicks on "Hunt Button" in "Account Page"
    And User is on "Hunt Page"
    When User clicks in "Farm Button"
    Then "Battle Report" is displayed