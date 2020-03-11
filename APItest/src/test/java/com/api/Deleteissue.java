package com.api;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Deleteissue {

	@Test
	public void get() {
		Response re = RestAssured.given().headers("Content-Type", "application/json").auth().preemptive()
				.basic("gobi28031996@outlook.com", "NYfe2b5NZVSvHH8JpiHf90B3")
				.delete("https://gobijira.atlassian.net/rest/api/2/issue/KOG0-1");

		System.out.println(re.getStatusCode());


	}


}
