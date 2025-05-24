package com.tnsif.collections;
		import java.util.*;

		public class NaturalSortingExample {
		    public static void main(String[] args) {
		        // Sorting integers
		        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);
		        Collections.sort(numbers);  // Natural ascending order
		        System.out.println("Sorted Numbers: " + numbers);

		        // Sorting strings
		        List<String> fruits = Arrays.asList("Mango", "Apple", "Banana", "Orange");
		        Collections.sort(fruits);  // Lexicographical order
		        System.out.println("Sorted Fruits: " + fruits);
		    }

	}


