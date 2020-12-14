@LoginProcess
Feature: Test Login Process

  Background: BiteFight is opened

#  Scenario Outline: Validate login process with invalid credentials
#    Given User is on "Main Page"
#    And User selects <game round> from Game Round Drop Down
#    And User provides <user name> in User Name Field
#    And User provides <password> in Password Field
#    And User clicks in "Login Button"
#    And User is on "Login Page"
#    Then "Error Message" is displayed
#    Examples:
#      | user name | password   | game round |
#      | MrBoolean | Endava@12  | County 34  |
#      | MrBoolea  | Endava@123 | County 34  |
#      | MrBoolean | Endava@123 | County 33  |

  Scenario: Validate login process with valid credentials
    Given User is on "Main Page"
    And User selects County 34 from Game Round Drop Down
    And User provides MrBoolean in User Name Field
    And User provides Endava@123 in Password Field
    And User clicks in "Login Button"
    Then User is on "Overview Page"
    And "Overview Header" is displayed
