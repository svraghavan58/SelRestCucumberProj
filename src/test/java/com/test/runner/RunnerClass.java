package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",dryRun=false,glue={"com.test.stepdefinitons","com.test.hooks"},monochrome=true,plugin= {"pretty","junit:target/report.xml","html:target/report.html","json:target/report.json","rerun:target/rerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags="@tag2 and not @tag1 or @tag")
public class RunnerClass {

	
}
