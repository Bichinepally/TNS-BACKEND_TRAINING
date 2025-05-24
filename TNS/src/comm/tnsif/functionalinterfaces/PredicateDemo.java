package comm.tnsif.functionalinterfaces;
import java.util.function.Predicate;
		// TODO Auto-generated method stub
		

		public class PredicateDemo {
		    public static void main(String[] args) {
		        Predicate<String> isLong = s -> s.length() > 5;
		        System.out.println(isLong.test("Hello"));   // false
		        System.out.println(isLong.test("Welcome")); // true
		    }
		

	}


