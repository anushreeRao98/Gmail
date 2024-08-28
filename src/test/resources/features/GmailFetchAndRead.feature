@Gmail
Feature: Gmail Search and Read
  Background:
  Given User launches the Gmail application
    And User enters valid credentials to login

  Scenario: Search for a mail and Read the contents for that email in Gmail
    Given User searches for the email
    Then User clicks on the email found
    And User verifies the navigation to the email selected
    Then User reads the contents of the email and prints
