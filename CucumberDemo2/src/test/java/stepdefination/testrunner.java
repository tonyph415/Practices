package stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class testrunner {
/// I AM RUNNING WITH CUCUMBER CLASS
@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target//cucumber.json"}, 
		features = "feature//TestCase.feature",
		glue="stepdefination/teststep.java")

public class testrunner_googlehomepage
{
}
}