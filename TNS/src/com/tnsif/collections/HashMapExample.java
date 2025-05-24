package com.tnsif.collections;
		import java.util.*;

		public class HashMapExample {
		    public static void main(String[] args) {
		        Map<Integer, String> map = new HashMap<>();
		        map.put(1, "Java");
		        map.put(2, "Python");
		        map.put(3, "C++");

		        for (Map.Entry<Integer, String> entry : map.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		

	}


