package com.api;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Jsonpath {
	@Test
	public void get1() {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
ResponseBody body = res.getBody();
JsonPath p = body.jsonPath();
	Object object = p.get("data");
	
	System.out.println(object);
	
	
	
	
	
	
	
	
	
	}
}
