package com.tnsif.collections;

public class ComparableExample {
		// TODO Auto-generated method stub
		class Student implements Comparable<Student> {
		    String name;
		    int age;

		    Student(String n, int a) {
		        name = n;
		        age = a;
		    }

		    public int compareTo(Student s) {
		        return this.age - s.age; // Sort by age
		    }

		    public String toString() {
		        return name + " - " + age;
		    }

		    public static void main(String[] args) {
		        List<Student> list = new ArrayList<>();
		        list.add(new Student("Alice", 22));
		        list.add(new Student("Bob", 20));

		        Collections.sort(list);
		        for (Student s : list) {
		            System.out.println(s);
		        }
		    }
		}

	}


