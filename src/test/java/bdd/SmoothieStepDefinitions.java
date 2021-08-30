package bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class SmoothieStepDefinitions {

    private DrinkCatalog drinkCatalog = new DrinkCatalog();
    private SmoothieSchema smoothieSchema = new SmoothieSchema(drinkCatalog);
    private PunktCalculator punktCalculator = new PunktCalculator(smoothieSchema);
    @Given("The Drink category:")
    public void the_drink_category(List<Map<String,String>> dataTable) {

        dataTable.stream().forEach( value -> {
            String getrank = value.get("Getrank");
            String kategory = value.get("Kategory");
            Integer punkte = Integer.parseInt(value.get("Punkte"));
            drinkCatalog.addDrink(getrank,kategory );
            smoothieSchema.setPointByCategory(kategory,punkte );
        });

    }
    @Given("^arriving to the (.*)$")
    public void arriving_to_the_store(String ort) {
    }

    @When("^you purshase (\\d+)(.*) drinks$")
    public void you_purshase_drinks(Integer menge, String getrank) {
        punktCalculator.order(getrank.trim(), menge);
    }
    @Then("you should earn {int}")
    public void you_should_earn(Integer expectedValue) {

        Assert.assertEquals(expectedValue,punktCalculator.getPunkte());

    }

}
