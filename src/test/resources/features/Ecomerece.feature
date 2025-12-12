Feature: Test the Login functionality of Swag Labs Website
  Scenario: User opens the Swag Labs website and logins to account succeessfully
    Given User opens Swag Labs Website
    Then User Enter UserName as "standard_user"
    And User Enters Password as "secret_sauce"
    Then User Click on Login Button

