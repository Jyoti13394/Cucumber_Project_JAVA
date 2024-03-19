
  Feature: Application login

    Scenario: Admin Page login
      Given User is on landing page
      When User login into application
      Then Home Page is displayed