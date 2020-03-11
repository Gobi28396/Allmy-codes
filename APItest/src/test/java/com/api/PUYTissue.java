package com.api;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUYTissue {

	@Test
	public void get() {
		Response re = RestAssured.given().headers("Content-Type", "application/json").auth().preemptive()
				.basic("gobi28031996@outlook.com", "NYfe2b5NZVSvHH8JpiHf90B3").body("{\r\n" + 
						"    \"fields\": {\r\n" + 
						"      \r\n" + 
						"       \"summary\": \"logut error\",\r\n" + 
						"       \"description\": \" logout operation not performed well\"\r\n" + 
						"      \r\n" + 
						"   }\r\n" + 
						"}")
				.put("https://gobijira.atlassian.net/rest/api/2/issue/KOG0-13");

		System.out.println(re.getStatusCode());
		
	}

}
