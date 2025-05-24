package com.tnsif.generics;

public class GenericMethodExample {
		    public static <T> void displayArray(T[] array) {
		        for (T element : array) {
		            System.out.println(element);
		        }
		    }

		    public static void main(String[] args) {
		        Integer[] intArray = {1, 2, 3, 4};
		        String[] strArray = {"A", "B", "C"};

		        System.out.println("Integer Array:");
		        displayArray(intArray);

		        System.out.println("String Array:");
		        displayArray(strArray);
		    }
		

	}


