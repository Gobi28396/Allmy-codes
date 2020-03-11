package com.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JSONTasks {
	@Test
	public void get1() {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals("verify", 200, code);
	}
	@Test
	public void get3() {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals("verify", 200, code);
	}
	@Test
	public void get4() {
		Response res = RestAssured.get("https://reqres.in/api/users/23");
		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals("verify", 404, code);
	}
	@Test
	public void get5() {
		Response res = RestAssured.get("https://reqres.in/api/unknown");
		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals("verify", 200, code);
	}
	@Test
	public void get6() {
		Response res = RestAssured.get("https://reqres.in/api/unknown/2");
		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals("verify", 200, code);
	}
	@Test
	public void get7() {
		Response res = RestAssured.get("https://reqres.in/api/unknown/23");
		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals("verify", 404, code);
	}
	@Test
	public void get2() throws ParseException {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		int code = res.getStatusCode();
		ResponseBody bo = res.getBody();
		String str = bo.asString();
		JSONParser p = new JSONParser();
		Object obj = p.parse(str);

		// page check
		JSONObject j = (JSONObject) obj;
		Object obj2 = j.get("page");
		String z = obj2.toString();
		System.out.println(z);
		Assert.assertEquals("verify id", 2, Integer.parseInt(obj2.toString()));

		// data fisrt id check
		Object da = j.get("data");
		JSONArray z1 = (JSONArray) da;
		Object dai = z1.get(0);
		JSONObject da1 = (JSONObject) dai;
		Object data = da1.get("id");
		System.out.println(data.toString());
		Assert.assertEquals("verify id", 7, Integer.parseInt(data.toString()));

		// data 2nd email check
		Object email = z1.get(1);
		JSONObject em = (JSONObject) email;
		Object emai = em.get("email");
		System.out.println(emai.toString());
		Assert.assertEquals("verify id", "lindsay.ferguson@reqres.in", (emai.toString()));

		// data 3rd First name
		Object fn = z1.get(2);
		JSONObject fna = (JSONObject) fn;
		Object fname = fna.get("first_name");
		System.out.println(fname.toString());
		Assert.assertEquals("verify id", "Tobias", (fname.toString()));

		// data 4th avatar
		Object av = z1.get(3);
		JSONObject ava = (JSONObject) av;
		Object object = ava.get("avatar");
		System.out.println(object);
		Assert.assertEquals("verify id", "https://s3.amazonaws.com/uifaces/faces/twitter/russoedu/128.jpg",
				(object.toString()));

	}

}
