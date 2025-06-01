package com.tnsif.exceptiondemo;

//Main class
public class ValidateAge {
 // Method to check age
  public static void validAge(int age) throws MyException {
     if (age<0) {
         throw new MyException("The entered age is not valid");
     } else {
         System.out.println("Valid age entered:"+age);
     }
  }
	public static void main(String[] args) {
		try {
			validAge(-5);//this will throw our custom exception
		}
		catch(MyException e) {
			System.out.println("Caught Exception:"+e.getMessage());
		}
		System.out.println("Program continues....");

	}

}
