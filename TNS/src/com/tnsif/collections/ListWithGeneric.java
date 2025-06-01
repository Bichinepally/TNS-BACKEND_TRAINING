package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
//wrapper class
//int-->Integer
//float-->Float,double-->Double,short-->Short
import java.util.Set;
import java.util.TreeSet;


public class ListWithGeneric {

	public static void main(String[] args) {
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		System.out.println("The elements are:");
		for(int i:ll) {
			System.out.println(i);
		}
 //HashSet
		Set<Integer> l=new HashSet<Integer>();
		l.add(10);
		l.add(10);
		l.add(34);
		l.add(23);
		System.out.println("The elements are:");
		for(int i:l) {
			System.out.println(i);
		}
		//LinkedHashSet
		Set<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(10);
		ls.add(34);
		ls.add(23);
		System.out.println("The elements are:");
		for(int i:ls) {
			System.out.println(i);
		}
//TreeSet
		Set<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(10);
		ts.add(34);
		ts.add(23);
		System.out.println("The elements are:");
		for(int i:ts) {
			System.out.println(i);
		}
		
		
	}

}
