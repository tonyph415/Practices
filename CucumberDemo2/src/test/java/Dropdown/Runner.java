package Dropdown;


	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	public class Runner {
	/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(
			format = {"pretty", "json:target//cucumber.json"}, 
			features = "C:\\Users\\tuand\\git\\Practices\\CucumberDemo2\\src\\test\\java\\Dropdown\\Test.feature",
			glue="C:\\Users\\tuand\\git\\Practices\\CucumberDemo2\\src\\test\\java\\Dropdown\\TestStep.java")

	public class Runer_mercury
	{
	}
	}

