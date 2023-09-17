package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty","html:cucumber-reports/htmlreprt.html", "json:cucumber-reports/report.json"},
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        publish = true,
        monochrome=true,
        dryRun=false,
        tags = ("@IRCTCBooking")

)
public class TestRunnerCucumber {
}
