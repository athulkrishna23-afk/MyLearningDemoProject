Feature: Test the add and remove from cart functionality
  Scenario: Add two items to cart and remove one from homepage and the second from Cart page
    Given User opens Swag Labs Website
    Then User Enter UserName as "standard_user"
    And User Enters Password as "secret_sauce"
    When User Click on Login Button
    Then User is logged in
    When User click on add to card button for an item
    And User cliks on add to cart button of second item
    Then Item is added to Cart and the User is able to verify that the Button changes to Remove
    When User clicks on remove from cart button
    Then User is able to verify that the number above cart icon is reduced
    When User clicks on Cart icon
    And User click on remove button from cart page
    Then Item is removed and user is able to verify