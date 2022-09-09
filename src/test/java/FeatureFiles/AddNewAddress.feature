Feature: New Address Functionality Test

  Background:
    Given User navigate to website
    When  User enter valid credentials
      | tgbson@hotmail.com | 7980Tugba |
    Then  User should login successfully

  Scenario Outline: Add new address
    Given User click on manage address
    When  User add "<phone>" "<stAddress>" "<city>" "<state>" "<zipCode>" "<country>"
    Then  Validate Address created message successfully

    Examples:
      | phone      | stAddress         | city      | state | zipCode | country |
      | 3256478991 | 12 Sheridan rd    | Elizabeth | 42    | 12345   | US      |
      | 4123654789 | 123 mithatpasa mh | Adana     | 13    | 41526   | TR      |
      | 8965478632 | 856 Smithfield rd | Astoria   | 1     | 32659   | US      |








