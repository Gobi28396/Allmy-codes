package com.api;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Postissue {


	@Test
	public void get() {
		Response re = RestAssured.given().headers("Content-Type", "application/json").auth().preemptive()
				.basic("gobi28031996@outlook.com", "NYfe2b5NZVSvHH8JpiHf90B3").body("{\r\n" + 
						"    \"fields\": {\r\n" + 
						"       \"project\":\r\n" + 
						"       {\r\n" + 
						"          \"key\": \"KOG0\"\r\n" + 
						"       },\r\n" + 
						"       \"summary\": \"login error\",\r\n" + 
						"       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
						"       \"issuetype\": {\r\n" + 
						"          \"name\": \"Bug\"\r\n" + 
						"       }\r\n" + 
						"   }\r\n" + 
						"}")
				.post("https://gobijira.atlassian.net/rest/api/2/issue/");

		System.out.println(re.getStatusCode());
		

	}

}
