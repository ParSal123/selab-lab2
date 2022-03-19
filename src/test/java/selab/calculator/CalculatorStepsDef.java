package selab.calculator;

import org.junit.Assert;

import calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepsDef {
    private Calculator calculator = new Calculator();
    private Integer v1, v2;
    private Integer result;

    @Given("Two input values, {int} and {int}")
    public void two_input_values_and(Integer int1, Integer int2) {
        v1 = int1;
        v2 = int2;
    }

    @When("I compute the square root of two numbers divided sqrt\\(first \\/ second)")
    public void i_compute_the_square_root_of_two_numbers_divided_sqrt_first_second() {
        result = calculator.compute(v1, v2);
    }

    @Then("I expect the result {int}")
    public void i_expect_the_result(Integer int1) {
        Assert.assertEquals(int1, result);
    }
}
