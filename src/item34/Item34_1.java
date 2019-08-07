package item34;

public class Item34_1 {

	private Item34_1() {}
	
	// 코드 34-1 정수 열거 패턴 - 상당히 취약하다!
	public static final int APPLE_FUJI = 0;
	public static final int APPLE_PIPPIN = 1;
	public static final int APPLE_GRANNY_SMITH = 2;
	
	public static final int ORANGE_NAVEL = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD = 2;
	
	public static void main(String[] args) {
		// 향긋한 오렌지 향의 사과 소스!
		int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN;
	}
}
