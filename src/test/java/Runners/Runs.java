package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@icon",
        plugin = {"pretty","json:target/maven-json-file/orangehrms.json"}
)
public class Runs {
}
