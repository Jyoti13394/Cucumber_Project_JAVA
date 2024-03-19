
  Feature: Application login

    Scenario: Admin Page login
      Given User is on landing page
      When User login into application using "admin_user_name" and "paswword"
      Then Home Page is displayed

    Scenario: User Login
      Given User is on landing page
      When User login into application using "generic_user_name" and "paswword"
      Then Home Page is displayed