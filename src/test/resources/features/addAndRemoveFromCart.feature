Feature: Add and Remove from Cart functionality of Swag Labs
  Scenario: User Should be able to add and then remove the item from cart
    Given User opens Swag Labs Website
    Then User Enter UserName as "standard_user"
    And User Enters Password as "secret_sauce"
    When User Click on Login Button
    Then User is logged in
    When User click on add to card button for an item
    Then Item is added to Cart and the User is able to verify that the Button changes to Remove
    When User clicks on remove from cart button
    Then Item is removed and user is able to verify
#    And Test
