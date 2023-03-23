package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
        //tags = "@loginSucesso",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
public class RunnerTest {

}
