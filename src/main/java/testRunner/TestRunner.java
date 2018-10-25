package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/SUMUKH/eclipse_workspace/Test/src/main/java/Features/HotelSearch.feature", 
				glue = {"stepDefinitions" }, 
				monochrome = true,
				format = { "pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml" }, 
				tags = { "~@ignore" }, dryRun = false)
public class TestRunner {

}
