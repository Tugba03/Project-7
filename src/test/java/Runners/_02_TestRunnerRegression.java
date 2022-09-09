package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinition"},
        plugin = {"html:target/site/report.html"}
)
public class _02_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
