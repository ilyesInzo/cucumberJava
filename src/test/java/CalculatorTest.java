import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//glue = "" to define the package where the steps definition exists
@CucumberOptions( features = "classpath:features")
public class CalculatorTest {
}
