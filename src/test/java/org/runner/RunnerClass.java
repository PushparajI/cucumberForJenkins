package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\CucumberClass2\\src\\test\\resources\\Featurefile",
glue="org\\stepdefinition",dryRun=false,
monochrome=false,
snippets=SnippetType.CAMELCASE,plugin= {"pretty"})
public class RunnerClass {

}
