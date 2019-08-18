package chapter7.item42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Item42_1 {

	private Item42_1() {}
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		
		// 코드 42-1 익명 클래스의 인스턴스를 함수 객체로 사용 - 낡은 기법이다!
		Collections.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
	}
}
