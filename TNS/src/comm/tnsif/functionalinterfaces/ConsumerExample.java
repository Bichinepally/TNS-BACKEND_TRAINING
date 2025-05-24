package comm.tnsif.functionalinterfaces;
		import java.util.function.Consumer;

		public class ConsumerExample {
		    public static void main(String[] args) {
		        Consumer<String> printer = s -> System.out.println("Hello, " + s);
		        printer.accept("Keerthana");  // Output: Hello, Keerthana
		    }

	}


