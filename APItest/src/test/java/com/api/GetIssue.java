package com.api;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetIssue {

	@Test
	public void get() {
		Response re = RestAssured.given().headers("Content-Type", "application/json").auth().preemptive()
				.basic("gobi28031996@outlook.com", "NYfe2b5NZVSvHH8JpiHf90B3")
				.get("https://gobijira.atlassian.net/rest/api/2/search");

		System.out.println(re.getStatusCode());
		ResponseBody body = re.getBody();
		JsonPath p = body.jsonPath();
		Object object = p.get("maxResults"
				+ "");

		System.out.println(object);

	}
}
