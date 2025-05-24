package com.tns.demostring;

public class Comparestring {


	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Capgemini";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s1));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(s2));
        System.out.println(s3.compareTo(s1));

		
		

	}

}