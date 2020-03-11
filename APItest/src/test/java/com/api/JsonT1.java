package com.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JsonT1 {
	@Test
	public void test1() {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals("verify", 200, code);
	}

	@Test
	public void test2() {
		Response rea = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = rea.getBody();
		String asString = body.asString();
		System.out.println(asString);
	}

	@Test
	public void test3() throws ParseException {
		Response rea = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = rea.getBody();
		String asString = body.asString();
		JSONParser p = new JSONParser();
		Object parse = p.parse(asString);
		JSONObject jo = (JSONObject) parse;
		Object ob1 = jo.get("data");
		JSONArray ja1 = (JSONArray) ob1;
		Object id = ja1.get(0);
		JSONObject jo2 = (JSONObject) id;
		Object uu = jo2.get("id");
		System.out.println(uu);
		Assert.assertEquals("verify id", 7, Integer.parseInt(uu.toString()));
		Object email = ja1.get(1);
		JSONObject jo3 = (JSONObject) email;
		Object ee = jo3.get("email");
		System.out.println(ee);
		Assert.assertEquals("verify email", "lindsay.ferguson@reqres.in", ee.toString());

		
		
		
		Object firstname = ja1.get(2);
		JSONObject jo4 = (JSONObject) firstname;
		Object aa = jo4.get("first_name");
		System.out.println(aa);
		Assert.assertEquals("verify firstname", "Tobias", aa.toString());

		Object lastname = ja1.get(3);
		JSONObject jo5 = (JSONObject) lastname;
		Object bb = jo5.get("last_name");
		System.out.println(bb);
		Assert.assertEquals("verify lastnem", "Fields", bb.toString());

		Object avatar = ja1.get(5);
		JSONObject jo6 = (JSONObject) lastname;
		Object cc = jo6.get("avatar");
		System.out.println(cc);
		Assert.assertEquals("verify avatar",
		"https://s3.amazonaws.com/uifaces/faces/twitter/hebertialmeida/128.jpg",cc.toString());
	}

}
