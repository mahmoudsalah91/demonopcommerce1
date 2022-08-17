@smoke
Feature: F04_Search | user could search using product name
  Scenario: guest user could search using book name successfully
    When  user search for book
    Then  each result contains the search word book

  Scenario:guest user could search using laptop name successfully
    When  user search for laptop
    Then  each result contains the search word laptop

  Scenario:guest user could search using nike name successfully
    When  user search for nike
    Then  each result contains the search word nike


  Scenario: guest user could search using product SKU successfully
    When  user search for items by SKU
    Then  verify it contains the sku using in search











