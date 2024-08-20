package Project1;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/prog.feature", glue="Project1", monochrome=true, dryRun=false)


public class TESTRUN {

}
