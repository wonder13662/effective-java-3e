package item34;

public class Item34_5 {

	private Item34_5() {}
	
	// 코드 34-5 상수별 메서드 구현을 활용한 열거타입
	public enum Operation {
		PLUS{public double apply(double x, double y) {return x + y;}},
		MINUS{public double apply(double x, double y) {return x - y;}}, 
		TIMES{public double apply(double x, double y) {return x * y;}}, 
		DIVIDE{public double apply(double x, double y) {return x / y;}};
		
		public abstract double apply(double x, double y);
	}	
}
