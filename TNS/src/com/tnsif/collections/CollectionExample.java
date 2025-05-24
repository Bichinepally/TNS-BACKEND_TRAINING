package com.tnsif.collections;
import java.util.*;

public class CollectionExample {
	public static void main(String[] args) {
		        // 1. ArrayList Example
		        List<String> fruits = new ArrayList<>();
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Mango");

		        System.out.println("ArrayList (Fruits):");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }

		        // 2. HashSet Example
		        Set<Integer> numbers = new HashSet<>();
		        numbers.add(10);
		        numbers.add(20);
		        numbers.add(10);  // duplicate value, won't be added

		        System.out.println("\nHashSet (Numbers):");
		        for (int num : numbers) {
		            System.out.println(num);
		        }

		        // 3. HashMap Example
		        Map<Integer, String> studentMap = new HashMap<>();
		        studentMap.put(101, "keerthana");
		        studentMap.put(102, "nanditha");
		        studentMap.put(103, "shivani");

		        System.out.println("\nHashMap (Student ID -> Name):");
		        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
		            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		        }
		    }
		

	}


