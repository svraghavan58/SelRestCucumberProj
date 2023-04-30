package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@traget/rerun.txt",dryRun=false,glue="com.test.stepdefinitons",monochrome=true,plugin= {"pretty","junit:target/reports.xml","html:target/reports.html","json:target/reports.json","rerun:traget/rerun.txt"})


public class RunnerFailureClass {

}
