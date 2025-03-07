package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\thirumaran\\eclipse-workspace\\NexTestify_Cucumber\\src\\test\\resources\\FeatureFiles\\1_OEP_TestSetup.feature", glue = "stepDefinition", monochrome = true,
//dryRun = true,
//tags="@Test",
		plugin = {"pretty",
				"html:target/cucumber/Test Setup_cucumberhtml-report.html",
				"json:target/cucumber/Test Setup_cucumber.json",
				"rerun:target/failedScenarios/TestSetup_Failed.txt"
				})
public class OEP_1_TestSetupRunnerTest {

}
