package com.tnsif.streamdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
	public class StreamDemo {
	    public static void main(String[] args) {
	        List<Employee> empList = Arrays.asList(
	            new Employee(101, "Sam", 30000),
	            new Employee(102, "Divya", 45000),
	            new Employee(103, "Ravi", 25000),
	            new Employee(104, "Dolly", 50000)
	        );

	        // Intermediate Operation: filter
	        Stream<Employee> st = empList.stream()
	            .filter(emp -> emp.esal > 30000);

	        // Terminal Operation to trigger stream
	        st.forEach(emp -> System.out.println("EmpID: " + emp.empid + " Name: " + emp.ename));

	        // Another Intermediate Operation: map (to convert names to upper case)
	        List<String> names = Arrays.asList("Sam", "Lavanya", "Divya", "Dolly");

	        names.stream()
	            .map(String::toUpperCase)
	            .forEach(System.out::println);
	                List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);

	                // Sort in ascending order
	                List<Integer> sortedAsc = numbers.stream()
	                                                 .sorted()
	                                                 .collect(Collectors.toList());
	                System.out.println("Sorted Ascending: " + sortedAsc);

	                // Sort in descending order
	                List<Integer> sortedDesc = numbers.stream()
	                                                  .sorted(Comparator.reverseOrder())
	                                                  .collect(Collectors.toList());
	                System.out.println("Sorted Descending: " + sortedDesc);
	                        List<Integer> number = Arrays.asList(5, 3, 8, 3, 9, 5, 2);

	                        // Remove duplicates using distinct()
	                        List<Integer> distinctNumbers = number.stream()
	                                                               .distinct()
	                                                               .collect(Collectors.toList());

	                        System.out.println("Distinct elements: " + distinctNumbers);

	                                // Limit the stream to first 3 elements
	                                List<Integer> limitedNumbers = number.stream()
	                                                                      .limit(3)
	                                                                      .collect(Collectors.toList());

	                                System.out.println("Limited elements: " + limitedNumbers);
	                                        // Skip the first 3 elements
	                                        List<Integer> skippedNumbers = number.stream()
	                                                                              .skip(3)
	                                                                              .collect(Collectors.toList());

	                                        System.out.println("After skipping first 3 elements: " + skippedNumbers);
	                               
	    }
	}





