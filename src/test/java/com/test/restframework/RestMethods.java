package com.test.restframework;

import java.util.LinkedHashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestMethods {
	
	//public static Response response;
 
	
	public void executeGet(String uri)
	{
		RestAssured.baseURI=uri;
		JSONObject js=new JSONObject();
		js.put("abcd", "abc");
		js.put("bcd", "bcd");
		
		RequestSpecification request=RestAssured.given().auth().basic("abc", "abc").queryParam("abc", "abc").body(js.toJSONString()).header("autjorisation","Bearer token");
		Response response=request.when().get();
	}
public Map<String,String> verifyHeader(Response response)
{
	Headers headers=response.headers();
	LinkedHashMap<String ,String> lm=new LinkedHashMap<String,String>();
	for(Header header:headers)
	{
		lm.put(header.getName(), header.getValue());
	}
	
	return lm;
}
public void getResponseCode(Response response)
{
	response.getStatusCode();
}
public void getResponseLine(Response response)
{
	response.getStatusLine();
}
public void getHeader(Response response,String headerName)
{
	response.getHeader(headerName);
}
public void verifyJsonSchema(Response response)
{
	response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("src/test/resource/1.json"));
}
public void verifyResponseCode(Response response)
{
	response.then().assertThat().statusCode(200);
}
public void verifyResponseMessage(Response response)
{
	response.then().assertThat().statusLine("abc");
}
public void verifyResponseHeader(Response response)
{
	response.then().assertThat().header("abc", "abc");
}
public void verifyJsonPath(Response response)
{
	JsonPath jpath=response.jsonPath();
	jpath.getString("data.id[0]");
	jpath.getList("data");
}
public void verifyValues(Response response)
{
	response.then().assertThat().body("book.author[0]", Matchers.equalTo("Nigel Rees"));
	response.then().assertThat().body("book.author[0]", Matchers.hasItems());
}
	
public void ResponseBody(Response response)
{
	io.restassured.response.ResponseBody body=response.getBody();
	
}

}
