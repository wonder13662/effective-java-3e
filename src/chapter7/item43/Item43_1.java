package chapter7.item43;

import java.util.HashMap;
import java.util.Map;

public class Item43_1 {
	// https://www.oreilly.com/library/view/effective-java-3rd/9780134686097/
	// 7 Lambdas and Streams
	// Item 43: Prefer method references to lambdas
	// Item 43: 람다보다는 메서드 참조를 사용하라

	private Item43_1() {}
		
	public static void main(String[] args) {
		// Do something...
		
		// 1. Lambda
		Map<String, Integer> map = new HashMap<String, Integer>();
		String key = "key";
		map.merge(key, 1, (count, incr) -> count + incr);
		
		// 2. Method reference (better)
		map.merge(key, 1, Integer::sum);
	}
}
