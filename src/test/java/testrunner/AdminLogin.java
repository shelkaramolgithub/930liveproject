package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/calculator.feature",glue="stepDefinition",plugin={"pretty","junit:target/cucumber.xml","html:target/cucumber-reports.html"},dryRun=false)
public class AdminLogin {

}
