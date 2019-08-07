package item31;
import java.util.HashSet;
import java.util.Set;

public class Item31 {

	private Item31() {}

	public static void main(String[] args) {
		// Java 1.9부터 가능
//		Set<Integer> integers = Set.of(1, 3, 5);
		
//		Set<Integer> integers = Set.of(1,2,3);
//		Set<Double> doubles = Set.of(1.0, 2.0, 3.0);
	}
	
	// code 30-2 generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
}
