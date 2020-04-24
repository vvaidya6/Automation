package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/feature",
		glue="stepDefinations" ,tags="@SeleniumTest", monochrome=true, strict=true,
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json","junit:target/cucum.xml"})
	

public class TestRunner {

}
