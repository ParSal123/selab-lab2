Feature: Calculator

    Scenario Outline: add two numbers
        Given Two input values, <first> and <second>
        When I compute the square root of two numbers divided sqrt(first / second)
        Then I expect the result <result>

        Examples:
            | first | second | result |
            | 4     | 1      | 2      |
            | 36    | 4      | 3      |