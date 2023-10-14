@orangehrms
Feature: Home Page
  @smoke @regression @home
  Scenario: Home Page
    Given open the orange hrms page
    Then verify the login name

  @smoke @regression @login
  Scenario: Home Page
    Given open the orange hrms page
    When I verify the username label
    And I verify the username text box
    When I verify the password label
    And I verify the password text box
    And I verify the login button
    When I verify the forgot password link

