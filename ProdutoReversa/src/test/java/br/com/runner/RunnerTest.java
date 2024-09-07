package br.com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = "classpath:features/"
	    ,monochrome = true
		,dryRun = false
		,glue = ""
		,plugin = {"pretty","html:target/cucumber-reports"}
		,snippets = CucumberOptions.SnippetType.CAMELCASE
		
		,tags = "@login01"
		
		
		)



public class RunnerTest{
	
	
}