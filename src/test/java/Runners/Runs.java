package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@regression",
        plugin = {"pretty","json:target/cucumber-parallel/orange_hrms.json",
        "html:target/cucumber-parallel/orange_hrms.html"}
)
public class Runs {
}
