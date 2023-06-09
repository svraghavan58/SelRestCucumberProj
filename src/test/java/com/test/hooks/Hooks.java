package com.test.hooks;

import java.io.IOException;

import com.test.seleniumframe.BrowserMethods;
import com.test.seleniumframe.ScreenshotMethods;

import io.cucumber.java.After;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	
	
	@Before(order=1)
	public void beforeHooks1()
	{
		System.out.println("before Start1...");
	}
	
	@Before
	public void beforeHooks()
	{
		System.out.println("before Start...");
	}
	@After
	public void afterHooks()
	{
		System.out.println("after end......");
		BrowserMethods bm=new BrowserMethods();
		bm.quitBrowser();
	}
	@BeforeStep
	public void  beforeStep()
	{
		System.out.println("before step");
	}
	@AfterStep
	public void afterStep(Scenario scenario) throws IOException
	{
		ScreenshotMethods s=new ScreenshotMethods();
		
		scenario.attach(s.getScreenshots(),"image/png", null);
		
		System.out.println("after etep");
	}
	/*@AfterAll
	public void afterAll()
	{
		System.out.println("After All....");
	}*/
	
	@Before("@tag")
	public void beforeTag()
	{
		System.out.println("Before Tag");
	}
	@After("@tag")
	public void afterTag()
	{
		System.out.println("after tag....");
	}
		
	
	@After(order=1)
	public void afterHooks1()
	{
		System.out.println("before Start1...");
	}
}
