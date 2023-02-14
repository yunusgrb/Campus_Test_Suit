package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
        //plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}  // master report
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {

}
