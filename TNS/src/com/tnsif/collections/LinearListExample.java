package com.tnsif.collections;
		// TODO Auto-generated method stub
		import java.util.ArrayList;
		import java.util.Scanner;

		public class LinearListExample {
		    public static void main(String[] args) {
		        ArrayList<Integer> linearList = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        // Adding elements to the list
		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < n; i++) {
		            int element = scanner.nextInt();
		            linearList.add(element);
		        }

		        // Displaying the list
		        System.out.println("\nLinear List Elements:");
		        for (int item : linearList) {
		            System.out.print(item + " ");
		        }

		        // Searching an element
		       

	}

}
