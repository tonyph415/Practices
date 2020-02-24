package FBtest;


	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	public class Runner {
	/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(
			format = {"pretty", "json:target//cucumber.json"}, 
			features = "C:\\Users\\tuand\\eclipse-workspace\\PracticeCucumber2\\src\\test\\java\\FBlogin\\Test.feature",
			glue="C:\\Users\\tuand\\eclipse-workspace\\PracticeCucumber2\\src\\test\\java\\FBlogin\\TestStep.java")

	public class Runer_FBlogin
	{
	}
	}

