package com.tnsif.generics;
		// TODO Auto-generated method stub
		import java.util.*;

		public class LowerBoundExample {
		    public static void addNumbers(List<? super Integer> list) {
		        list.add(100);
		        list.add(200);
		    }

		    public static void main(String[] args) {
		        List<Number> numberList = new ArrayList<>();
		        addNumbers(numberList);

		        for (Object obj : numberList) {
		            System.out.println(obj);
		        }
		    }
		

	}


