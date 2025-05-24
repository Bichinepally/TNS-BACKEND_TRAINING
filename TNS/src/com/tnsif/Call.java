package com.tnsif;

public class Call {



			public int add(int a,int b) {
				return a+b;
			}
			public float add(float a,float b) {
				return a+b;
			}
			public float add(float a,float b,float c) {
				return a+b+c;
			}

			public static void main(String[] args) {
				Call ob=new Call();
				System.out.println(ob.add(2.8f,6.0f));
				System.out.println(ob.add(2,8));

			

		
	}

}
