package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
plugin= {"pretty","html:target/cucumber-reports", "json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/Extents_report.html"},
	snippets=SnippetType.CAMELCASE,
	features = "./src/test/resources/Login.feature",
	glue= {"stepDefinition"},
	tags= {"@MyStoreLogin"},
	monochrome = true,
	strict = true,
	dryRun = false
	)

public class TestRunnerFile extends AbstractTestNGCucumberTests{
		
	
	}
