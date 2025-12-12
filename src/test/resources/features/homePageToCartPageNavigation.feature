Feature: Navigate from Cart Page to Product Page by clicking Continue shopping
  Scenario: User should be able to add item to cart and then go to cart and click on continue shopping
    Given User opens Swag Labs Website
    Then User Enter UserName as "standard_user"
    And User Enters Password as "secret_sauce"
    Then User Click on Login Button
    When User click on add to card button for an item
    Then Item is added to cart
    When User clicks on Cart icon
    And User Clicks on continue shopping button
    Then User is taken to the product page