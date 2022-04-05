@tag
Feature: ERP Login Feature
  I want to use this template for ERP login feature

  @TC-1
  Scenario: Verify admin user is able to login with valid credential
    Given open browser
    When launch application
    And enter valid username and valid password and click on login
    Then validate the login page
    
    @TC-2
    Scenario: Verify admin user able to logout
    Given open browser
    When launch application
    And enter valid username and valid password and click on login
    And click on the logout button
    Then validate the logout 