package com.tnsif;
		public class Animal {
			public void eat() {
				System.out.println("This animal eats food.");
			}
		}
		class Dog extends Animal{
			public void bark() {
				System.out.println("The dog barks.");
			}
		}
		 class SingleInheritanceDemo{
			public static void main(String[] args) {
				Dog d=new Dog();
				d.eat();
				d.bark();
				}
		}
	


