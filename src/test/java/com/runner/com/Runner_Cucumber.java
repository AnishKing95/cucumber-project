package com.runner.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\91989\\eclipse-workspace\\Anish eclipse\\Anish_Maven_Cucumber\\Features"}
                 ,glue="com.stepdefenition.com")

public class Runner_Cucumber {

	
	
}
