Feature: Login Functionality Test

  @SmokeTest
  Scenario: Login with valid username and valid password for positive test
    Given User navigate to website
    When  User enter valid credentials
      | tgbson@hotmail.com | 7980Tugba |
    Then  User should login successfully

  @SmokeTest
  Scenario Outline: Login with invalid username or password for negative test
    Given  User navigate to website
    When   User enter invalid "<email>" or invalid "<password>"
    Then   User should not login and receive error message

    Examples:
      | email              | password  |
      | tgbson@hotmail.com | 12345     |
      | tgbson@gmail.com   | 7980Tugba |
      | test@gmail.com     | 30303030  |

