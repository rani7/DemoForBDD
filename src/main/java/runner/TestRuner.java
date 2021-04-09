package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		//features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\java\\feature\\login.feature", // path of feature files
		//features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\java\\feature\\contacts.feature",
		//features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\java\\feature\\deals.feature",
		//features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\java\\feature\\dealsmap.feature",
		//features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\java\\feature\\tagging.feature",
		//features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\java\\feature\\hooks.feature",
		features="F:\\Eclipse-selenium\\workspace\\DemoForBDD-master\\DemoForBDD-master\\src\\main\\java\\feature\\taggedhooks.feature",
		//glue={"stepDefinitions/LoginStepDefinition.java"}, // path of step definition file
		//glue={"stepDefinitions/ContactStepDefinition.java"},
	    //glue={"stepDefinitions/DealStepDefinition.java"},
		//glue={"stepDefinitions/DealsWithMapStepDefinition.java"},
		//glue={"stepDefinitions/TaggingStepDefinition.java"},
		//glue={"stepDefinitions/HooksStepDefinition.java"},
		glue={"stepDefinitions"},
		format ={"pretty","html:test-output", "json:json_xml/cucumber.xml", "junit:junit_xml/cucumber.xml"}, // to generate different types of reporting
		//monochrome = true, // display console output in a proper readable format
		dryRun = false // to check if mapping is proper between feature file and step definition file.
		//strict = true // to check if any step is not defined in step definition file
		//tags={"@SmokeTest"}
		// tags={"@SmokeTest,@RegressionTest"}   OR operator   execute all tests tagged as smoke or regression (either conditions satisfied)
		// tags={"@SmokeTest","@RegressionTest"}  AND operator  execute all tests tagged as smoke and regression (both conditions satisfied)
		//tags={"~@SmokeTest","~@RegressionTest","~@End2End"} //~ operator ignores the tag
		)

public class TestRuner {

}
