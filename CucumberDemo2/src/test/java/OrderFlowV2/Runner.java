package OrderFlowV2;


	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	public class Runner {
	/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(
			format = {"pretty", "json:target//cucumber.json"}, 
			features = "OrderFlow\\Order.feature",
			glue="OrderFlow\\OrderStepDefination_V2.java")
	
	public class Runer_Order
	{
	}
	}

