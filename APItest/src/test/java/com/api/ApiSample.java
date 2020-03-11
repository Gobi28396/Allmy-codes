package com.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiSample {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f= new FileReader("D:\\NewSelenium42\\APItest\\src\\test\\resources\\Files\\Employee.json");
		JSONParser p=new JSONParser();
		Object obj= p.parse(f);
		
		JSONObject o=(JSONObject)obj;
		Object o2 = o.get("data");
		
		JSONArray j=(JSONArray)o2;
		
			
		
		Object o3 = j.get(5);
		JSONObject o4 =(JSONObject)o3;
		System.out.println(o4.get("id"));
		System.out.println(o4.get("first_name"));
		System.out.println(o4.get("last_name"));
		System.out.println(o4.get("email"));
		}
	
	

}
