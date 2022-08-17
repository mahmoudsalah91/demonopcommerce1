@smoke
Feature: D07_followUsStepDef | users could navigate followUs pages that in home page
  Scenario: user opens facebook link
    When user click on facebook link
    Then user verify that facebook page display

  Scenario: user opens twitter link
    When user click on twitter link
    Then user verify that twitter page display

  Scenario: user opens RSS link
    When user click on RSS link
    Then user verify that RSS page display

  Scenario: user opens youtube link
    When user click on youtube link
    Then user verify that youtube page display

