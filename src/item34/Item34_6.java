package item34;

public class Item34_6 {

	private Item34_6() {}
	
	// 코드 34-6 상수별 클래스 몸체(class body)와 데이터를 사용한 열거타입
	public enum Operation {
		PLUS("+") {public double apply(double x, double y) {return x + y;}},
		MINUS("-") {public double apply(double x, double y) {return x - y;}}, 
		TIMES("*") {public double apply(double x, double y) {return x * y;}}, 
		DIVIDE("/") {public double apply(double x, double y) {return x / y;}};
		
		private final String symbol;
		
		Operation(String symbol) { this.symbol = symbol; }
		
		@Override public String toString() { return symbol; }
		public abstract double apply(double x, double y);
	}
	
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		for (Operation op : Operation.values()) 
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
}
