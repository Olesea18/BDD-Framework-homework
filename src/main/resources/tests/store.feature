Feature: feature

  @regression
  Scenario: Buy a phone on the online store
    Given the online store is open
    When user clicks on the phone
    And adds it to the cart
    And confirms the action
    And navigates to cart
    And checks that the phone is in the cart
    And clicks on place order button
    And fills in the form
    And clicks on purchase button
    Then success message is displayed