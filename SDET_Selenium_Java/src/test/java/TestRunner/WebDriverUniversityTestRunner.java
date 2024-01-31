package TestRunner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/feature"},glue= {"StepDefinitions"},
plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
monochrome=true)

public class WebDriverUniversityTestRunner {
	
	
}
