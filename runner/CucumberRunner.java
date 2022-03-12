package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/main/java/Feature",
		glue = "step",
		monochrome=true,
		publish = true
		
		
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
