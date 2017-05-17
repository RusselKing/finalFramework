package com.stay.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/com/stay/features/",
				dryRun = true
				
		
				)


public class CucumberRunner {

}
