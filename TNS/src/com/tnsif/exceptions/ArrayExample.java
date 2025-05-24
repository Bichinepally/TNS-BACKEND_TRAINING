package com.tnsif.exceptions;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        int[] numbers = {1, 2, 3};
		        try {
		            System.out.println(numbers[5]);  // Invalid index
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Index is out of bounds.");
		        }
		    }
		}
	}


