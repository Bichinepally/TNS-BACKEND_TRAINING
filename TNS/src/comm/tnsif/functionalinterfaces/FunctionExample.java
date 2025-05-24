package comm.tnsif.functionalinterfaces;
		// TODO Auto-generated method stub
		import java.util.function.Function;

		public class FunctionExample {
		    public static void main(String[] args) {
		        Function<String, Integer> stringLength = s -> s.length();
		        System.out.println("Length: " + stringLength.apply("Lambda"));  // Output: 6
		    }
		

	}


