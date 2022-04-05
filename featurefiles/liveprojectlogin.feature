@tag
Feature: ERP Login Feature
  I want to use this template for ERP login feature

  @TC-1
  Scenario Outline: Verify admin user is able to login with valid credential
    Given open browser
    When launch application
    And enter valid "<username>" and valid "<password>" and click on login
    Then validate the login page with "<expectedresult>"
    
    Examples:
    |username|password|expectedresult|
    |Admin|master|Dashboard|
    |Admin|master|Dashboardil|
    