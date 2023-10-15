@dashbaordfeature
Feature: Orange HRMS Dashboard
  Background:
    Given open the orange hrms page
    Given open the orange hrms page        # steps.HomePagedefs.
@regression @smoke @dashboard
  Scenario: Dashboard
    When I verify the user dashboard
