@loginfeature @login
Feature: Orange HRMS Login Feature
  Background:
    Given open the orange hrms page
    @validcredential @regression
  Scenario: Login Scenario
      When user enter username
      And user enter password
      And user click on login button
      Then user should be able to login successfully

  @invalidcredential @regression
  Scenario Outline: Login Invalid Scenario
    When user enter username as "<username>" and password as "<password>"
    And user click on login button
    Then user should be able to see the error message "<message>"


    Examples:
    |username||password||message|
    |Admin||Admin||Invalid credentials|
    |Admin123||Admin||Invalid credentials|
    |Admin||admin234||Invalid credentials|
    |abc||admin123||Invalid credentials|
    |786||Admin||Invalid credentials|

