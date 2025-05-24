package com.tnsif.generics;
		// TODO Auto-generated method stub
		import java.util.*;

		public class UpperBoundExample {
		    public static void printNumbers(List<? extends Number> list) {
		        for (Number n : list) {
		            System.out.println(n);
		        }
		    }

		    public static void main(String[] args) {
		        List<Integer> intList = Arrays.asList(10, 20, 30);
		        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

		        printNumbers(intList);
		        printNumbers(doubleList);
		    }
		
	}


