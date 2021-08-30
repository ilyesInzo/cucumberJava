import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDefinitions {
    Calculator calculator ;
    Integer result;
    @Given("I have a calculator")
    public void i_have_a_calculator(){
        calculator = new Calculator();
        result= 0;
    }
    @When("I add <{int}> and <{int}>")
    public void i_add_and(Integer a, Integer b){
        result = calculator.add(a,b);
    }
    @Then("I should get <{int}>")
    public void i_should_get(Integer res){
        assertEquals(result,res);
    }
}
