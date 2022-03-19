Feature: Calculator
    
    Scenario: compute useless calculation
        Given Two input values, 64 and 4
        When I compute the square root of two numbers divided sqrt(first / second)
        Then I expect the result 4


    Scenario Outline: compute useless calculation
        Given Two input values, <first> and <second>
        When I compute the square root of two numbers divided sqrt(first / second)
        Then I expect the result <result>

        Examples:
            | first | second | result |
            | 4     | 1      | 2      |
            | 36    | 4      | 3      |