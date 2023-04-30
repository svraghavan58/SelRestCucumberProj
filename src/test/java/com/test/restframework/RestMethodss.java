package com.test.restframework;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestMethodss {
	
	public static Response response;
	
	public void openUrl(String url)
	{
		RestAssured.baseURI=url;
	}
	public void executeGet(RequestSpecification request)
	{
		response=request.when().get();
	}
	public void executePost(RequestSpecification request)
	{
		response=request.when().post();
	}
	public void executePut(RequestSpecification request)
	{
		response=request.when().put();
	}
	public void executePatch(RequestSpecification request)
	{
		response=request.when().patch();
	}

	public void executeDelete(RequestSpecification request)
	{
		response=request.when().delete();
	}
	public void getResponseCode()
	{
		response.getStatusCode();
		
	}
	public void getResponseMessage()
	{
		response.getStatusLine();
	}
	public String getStringValue(String path)
	{
		JsonPath js=response.jsonPath();
		
		return js.getString(path);
		//js.getString("store.book.category[0]");
	}
	public void verifyStatusCode()
	{
		response.then().assertThat().statusCode(200);
	}
	public void verifyJsonSchema(String fileName)
	{
		response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(fileName));
		
	}
	public void verifyJsonValues(String path,String value)
	{
		response.then().assertThat().body(path, Matchers.equalTo(value));
	}
	
}
