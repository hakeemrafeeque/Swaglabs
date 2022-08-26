package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature", glue={"StepDefinitions"}, tags="@swaglabs",
monochrome = true, plugin={"pretty", "html:target/reports/report.html"})
public class SwaglabsRunner {
    
}
