Feature: Add Items to cart and remove some items and Place order for remaining
  Scenario: User should be able to add items to cart and remove few items from cart and place order for remaining
    Given User opens Swag Labs Website
    Then User Enter UserName as "standard_user"
    And User Enters Password as "secret_sauce"
    When User Click on Login Button
    And User click on add to cart button for multiple items
    And User clicks on Cart icon
    And User removed items from cart
    And User clicks on Checkout button
    When User Enters First name as "Athul"
    And User Enters Last name as "Krishna"
    And User enters zip code as "673310"
    And Clicks on Continue button
    When User clicks on Fininsh button