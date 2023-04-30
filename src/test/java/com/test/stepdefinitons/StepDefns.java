package com.test.stepdefinitons;

import java.util.List;
import java.util.Map;

import com.test.seleniumframe.BrowserMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefns  {
	
	BrowserMethods bm=new BrowserMethods();
	
	@Given("I open {string} browser")
	public void i_open_browser(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		bm.openBrowser(browser);
		
	}
	@When("I enter the url  {string}")
	public void i_enter_the_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		bm.maximizeBrowser();
		bm.openUrl(url);
	}
	@Then("I close the browser")
	public void i_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions

		bm.quitBrowser();
	}

	@When("I enter the below url")
	public void i_enter_the_below_url(io.cucumber.datatable.DataTable data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<Map<String,String>> d=data.asMaps(String.class,String.class);
		String url=d.get(0).get("url");
		bm.maximizeBrowser();
		bm.openUrl(url);
	}






}
