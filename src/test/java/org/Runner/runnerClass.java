package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Athul krishna\\eclipse-workspace\\mavenPractive\\src\\test\\resources\\features\\orangelogin.feature",
glue= {"org.stepdefinition"},
dryRun=false)

public class runnerClass {
	
	

}
