package com.tnsif.collections;
		import java.util.*;

		class Student {
		    String name;
		    int age;

		    Student(String n, int a) {
		        name = n;
		        age = a;
		    }

		    public String toString() {
		        return name + " - " + age;
		    }
		}

		class NameComparator implements Comparator<Student> {
		    public int compare(Student s1, Student s2) {
		        return s1.name.compareTo(s2.name);
		    }
		}

		public class ComparatorExample {
		    public static void main(String[] args) {
		        List<Student> list = new ArrayList<>();
		        list.add(new Student("Keerthana", 23));
		        list.add(new Student("Nanditha", 21));

		        Collections.sort(list, new NameComparator());

		        for (Student s : list) {
		            System.out.println(s);
		        }
		    }
		

	}


