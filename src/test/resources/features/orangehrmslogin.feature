@loginfeature @login
Feature: Orange HRMS Login Feature
  Background:
    Given open the orange hrms page
    @validcredential @regression
  Scenario: Login Scenario
      When user enter username 'Admin' and password 'admin123'
      Then user should be able to login successfully

  @invalidcredential @regression
  Scenario Outline: Login Invalid Scenario
    When user enter username as "<user>" and password as "<password>"
    Then user should be able to see the error message "<errormessage>"


    Examples:
    |user||password||errormessage|
    |Admin||Admin||Invalid Credentials|
    |Admin123||Admin||Invalid Credentials|
    |Admin||admin234||Invalid Credentials|
    |abc||admin123||Invalid Credentials|
    |786||Admin||Invalid Credentials|

