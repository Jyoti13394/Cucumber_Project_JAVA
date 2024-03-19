package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue = "step_definitions", monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
