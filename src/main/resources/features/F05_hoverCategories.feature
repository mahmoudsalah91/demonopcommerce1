@smoke
Feature:F05_hoverCategories | users could hover on one of main categories then click on
  sub category
  Scenario:guest user could hover main categories then click on
    Given user hover on the selected category
    When  user select Desktops sub cateogries
    Then  Assert that Desktops title is equal or contains
