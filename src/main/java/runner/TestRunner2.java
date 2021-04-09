package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			
			features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\resources\\feature\\testbackground.feature",
			glue={"stepDefinitions"},
		    dryRun=false,
		    format ={"pretty","html:test-output", "json:json_xml/cucumber.xml", "junit:junit_xml/cucumber.xml"}
)

public class TestRunner2 {
	
}


