package item42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Item42_2 {

	private Item42_2() {}
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		
		// 코드 42-2 람다식을 함수 객체로 사용 - 익명 클래스 대체
		Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		// 람다 자리에 비교자 생성 메서드를 사용하면 이 코드를 더 간결하게 만들 수 있다.
		Collections.sort(words, Comparator.comparingInt(String::length));
		// 더 나아가 자바 8 때 List 인터페이스에 추가된 sort 메서드를 이용하면 더욱 짧아진다.
		words.sort(Comparator.comparingInt(String::length));
	}
}
