Feature: check price

  Scenario Outline: user checks the price
    When user on amazon main page clicks on All button and clicks on Kindle E-readers and clicks on Kindle
    Then user validates price as '<price>'

    Examples: test data
      | price  |
      | $99.99 |

