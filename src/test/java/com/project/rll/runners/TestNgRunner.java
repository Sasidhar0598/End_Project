package com.project.rll.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( // This annotation is used to provide additional configuration options for
					// Cucumber when running tests.
		features = "src/test/resource/Features/", glue = { "com.project.rll.steps" },

		plugin = { "html:target/ChilternOak_Report.html", "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }, tags = "@chilternoak"

)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}

//AbstractTestNGCucumberTests- Runs each cucumber scenario found in the features as separated test.