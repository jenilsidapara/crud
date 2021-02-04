package com.practise.projectmng.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;



public class Response {
	
	public static void main(String args[]) {
	
	}		
		public HashMap<String, Object> addMap(LinkedHashMap<String,Object> outMap){
			LinkedHashMap<String, Object> map = new LinkedHashMap<String , Object>();
			map.put("code", 200);
			map.put("status", true);
			map.put("message", "Insert Employee");
			map.put("data", outMap);
			return map;
		}
		public HashMap<String , Object> getBooks(List<?> list) {
			LinkedHashMap<String , Object> hashmap = new LinkedHashMap<String , Object>();
			hashmap.put("code", 200);
			hashmap.put("status", true);
			hashmap.put("message", "Get All Books");
			hashmap.put("data", list);
			return hashmap;
		}
		
		public HashMap<String ,Object> deleteSingleBook(int employeeid){
			LinkedHashMap<String , Object> hashmap = new LinkedHashMap<String , Object>();
			hashmap.put("code", 200);
			hashmap.put("status", true);
			hashmap.put("message", "Delete Employee");
			hashmap.put("employeeid", employeeid);
			return hashmap;
		}
		
		public HashMap<String ,Object> updateSingleBook(LinkedHashMap<String,Object> outMap){
			LinkedHashMap<String , Object> hashmap = new LinkedHashMap<String , Object>();
			hashmap.put("code", 200);
			hashmap.put("status", true);
			hashmap.put("message", "Update Book");
			hashmap.put("data", outMap);
			return hashmap;
		}
	}

