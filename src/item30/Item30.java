package item30;

import java.util.HashSet;
import java.util.Set;

public class Item30 {

	private Item30() {}

	public static void main(String[] args) {
		// 코드 30-3 제네릭 메서드를 활용하는 간단한 프로그램
		// Set<String> guys = Set.of("톰", "딕", "해리");
	}
	
	// code 30-2 generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
}
