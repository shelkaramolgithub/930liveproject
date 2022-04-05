  @tag
Feature: Calculator adition feature
  I want to use this template for addition feature
  
  @tag1
  Scenario Outline: Addition of two numbers
    Given get <a> and <b>
    When calculate a+b 
    Then print the reults

    Examples: 
     |a|b|
     |13|56|
     |200|457|
     |346|300|
