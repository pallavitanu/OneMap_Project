package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/FeatureFiles/OneMap.feature", 
		glue = { "stepDefs" }, 
		plugin = { "pretty",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.JSON",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	/*@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/
}