package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Automation\\OragneHrm\\src\\test\\resources\\features\\createOrder.feature",
glue= {"org.stepdefinition"},
 publish = true,
plugin= {"pretty",
        "html:target/cucumber-report/cucumber.html",
        "json:target/cucumber-report/cucumber.json"},
dryRun=false)

public class TestRunner {
	
}
