Feature: Purchase Functionality Test

  Background:
    Given User navigate to website
    When   User enter valid credentials
          |tgbson@hotmail.com|7980Tugba|
    Then  User should login successfully

  @SmokeTest    @RegressionTest
    Scenario: Purchase an item
      Given  Select any product and complete checkout
      Then   Validate you successfully purchase product
