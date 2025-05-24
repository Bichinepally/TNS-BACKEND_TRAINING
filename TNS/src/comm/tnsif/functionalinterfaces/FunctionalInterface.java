package comm.tnsif.functionalinterfaces;

public class FunctionalInterface {
		interface Greet {
		    void greet();
		}


		    public static void main(String[] args) {
		        Greet g = () -> System.out.println("Welcome!");
		        g.greet();
		    }
		

	}


