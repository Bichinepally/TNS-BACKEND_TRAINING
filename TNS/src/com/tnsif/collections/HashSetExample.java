package com.tnsif.collections;
		import java.util.*;

		public class HashSetExample {
		    public static void main(String[] args) {
		        Set<String> set = new HashSet<>();
		        set.add("Red");
		        set.add("Blue");
		        set.add("Green");
		        set.add("Red");  // Duplicate, won't be added

		        for (String color : set) {
		            System.out.println(color);
		        }
		    }
		

	}


