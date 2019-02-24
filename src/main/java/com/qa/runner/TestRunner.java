package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/main/java/com/qa/features",
//		features = "C:\\Users\\sande\\Selenium_Projects\\OpenSourceCMS\\src\\main\\java\\com\\qa\\features\\Login.feature",
		glue = {"com.qa.stepDefinitions"}, 
		format = {"pretty", "html:cucumber-outputs","json:cucumber-outputs/output.json" }, 
		//plugin = { "usage" }, 
		monochrome = true, 
		strict = true, 
		dryRun = false,
		tags= {"@SmokeTest"}
		)


public class TestRunner {


}
