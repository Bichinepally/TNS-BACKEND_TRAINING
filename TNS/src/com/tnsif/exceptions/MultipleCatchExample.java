package com.tnsif.exceptions;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        try {
		            int a = 10 / 0;
		            int[] arr = new int[5];
		            System.out.println(arr[10]);
		        } catch (ArithmeticException e) {
		            System.out.println("Arithmetic Error: " + e.getMessage());
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array Index Error: " + e.getMessage());
		        }
		    }
		
	}


