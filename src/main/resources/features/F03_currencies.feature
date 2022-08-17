@smoke
Feature: F03_currencies | users could Select Euro currency from the dropdown list
  Scenario: guest user could Select Euro currency from the dropdown list successfully
    When user click on  currency dropdown list and Select Euro currency
    Then  shown on the 4 products displayed in Home page
