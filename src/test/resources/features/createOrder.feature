Feature: Test the place order functionality of Swag Labs Website
  Scenario: User adds a Product to cart and places order
    Given User opens Swag Labs Website
    Then User Enter UserName as "standard_user"
    And User Enters Password as "secret_sauce"
    Then User Click on Login Button
    When User click on add to card button for an item
    Then Item is added to cart
    When User clicks on Cart icon
#    Then User is taken to the cart
    When User clicks on Checkout button
#    Then User is taken to Information page
    When User Enters First name as "Athul"
    And User Enters Last name as "Krishna"
    And User enters zip code as "673310"
    And Clicks on Continue button
#    Then User is taken to Payment information page
    When User clicks on Fininsh button
#    Then Order is placed