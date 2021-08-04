package deliveryConfiguration_Tuseef.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="src/test/resources",
        glue = "deliveryConfiguration_Tuseef/step_def",
        monochrome = false,
        stepNotifications = false,
        dryRun = false,
        //publish = true,
        plugin =  {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "timeline:target/timeline-report",
                "junit:target/cucumber-html-reports/cucumber.xml",

        },

        tags = "@Login or @MyReports"
)
public class CucumberRunner {
}
