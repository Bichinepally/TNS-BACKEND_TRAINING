package comm.tnsif.functionalinterfaces;

public class Calculator {


		interface Addable {
		    int add(int a, int b);
		}
		    public static void main(String[] args) {
		        Addable adder = (a, b) -> a + b;
		        System.out.println("Sum: " + adder.add(10, 20));
		    }
		

	}


