@smoke
Feature: Check Login functionality for the application
  As a user 
  I want to test the login page.
  So that i can validate the login functionality.

  @Smoke @login
  Scenario: Login into application with valid credentials
    Given Open Test application on the browser
    When User click in make appointment
    And User enter the username
    And User Enter the password
    And User click on login
    Then Verify user should be login successfully
