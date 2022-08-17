@smoke
Feature: F08_Wishlist | users could add products in their wishlist
  Scenario: user could add products in their wishlist
    When user click on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop"
    Then user see success message


  Scenario: user could add HTC in their wishlist
    When user click on wishlist button HTC
    And user click on Wishlist Tab
    Then Verify user product add in wichlistpage


