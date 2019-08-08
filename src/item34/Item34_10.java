package item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Item34_10 {

	private Item34_10() {}
	
	
	public enum Operation {
		PLUS("+") {public double apply(double x, double y) {return x + y;}},
		MINUS("-") {public double apply(double x, double y) {return x - y;}}, 
		TIMES("*") {public double apply(double x, double y) {return x * y;}}, 
		DIVIDE("/") {public double apply(double x, double y) {return x / y;}};
		
		private final String symbol;
		
		Operation(String symbol) { this.symbol = symbol; }
		
		@Override public String toString() { return symbol; }
		public abstract double apply(double x, double y);
		
		private static final Map<String, Operation> stringToEnum = Stream.of(values()).collect(Collectors.toMap(Object::toString, e -> e));
		
		// 지정한 문자열에 해당하는 Operation을 (존재한다면) 반환한다.
		public static Optional<Operation> fromString(String symbol) {
			return Optional.ofNullable(stringToEnum.get(symbol));
		}
	}
	
	// 코드 34-10 switch 문을 이용해 원래 열거 타입에 없는 기능을 수행한다
	public static Operation inverse(Operation op) {
		switch(op) {
		case PLUS:	return Operation.MINUS;
		case MINUS:	return Operation.PLUS;
		case TIMES:	return Operation.DIVIDE;
		case DIVIDE:	return Operation.TIMES;
		
		default: throw new AssertionError("알 수 없는 연산: " + op);
		}
	}
}
