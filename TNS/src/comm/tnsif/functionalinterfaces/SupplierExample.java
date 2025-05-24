package comm.tnsif.functionalinterfaces;
		import java.util.function.Supplier;

		public class SupplierExample {
		    public static void main(String[] args) {
		        Supplier<String> nameSupplier = () -> "Keerthana";
		        System.out.println("Name: " + nameSupplier.get());  // Output: Keerthana
		    }
	

	}


