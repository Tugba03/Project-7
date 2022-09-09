package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    tags = ("@SmokeTest or @RegressionTest"),
    features = {"src/test/java/FeatureFiles"},
    glue = {"StepDefinition"}
)

public class _01_TestRunnerBoth extends AbstractTestNGCucumberTests{
}
