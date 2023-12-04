package test.java.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/FeatureFiles/Home_page.feature", // Location of your feature files
    glue = "stepdefinations", // Location of your step definitions
    plugin = {"pretty", "html:target/cucumber-reports", "pretty", "html:target/cucumber-reports"} // Report generation options
)
public class TestRunnerHomePage {

}