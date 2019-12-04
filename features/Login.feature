Feature: Login

  Background:
    Given the following users exist in the system:
      | Username | Password     |
      | testuser | testpassword |

  Scenario: Successful Login
    When logging in as user "testuser" with password "testpassword"
    Then the login MUST be successful

  Scenario: Failed Login
    When logging in as user "testuser" with password "wrongpassword"
    Then the login MUST have failed
