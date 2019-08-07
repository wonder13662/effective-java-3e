package item34;

public class Item34_3 {

	private Item34_3() {}
	
	// 코드 34-3 데이터와 메서드를 갖는 열거 타입
	public enum Planet {
		MERCURY	(3.302e+23, 2.439e6),
		VENUS	(3.302e+23, 2.439e6),
		EARTH	(3.302e+23, 2.439e6),
		MARS	(3.302e+23, 2.439e6),
		JUPITER	(3.302e+23, 2.439e6),
		SATURN	(3.302e+23, 2.439e6),
		URANUS	(3.302e+23, 2.439e6),
		NEPTUNE	(3.302e+23, 2.439e6);
		
		private final double mass;			// 질량(단위: 킬로그램)
		private final double radius;		// 반지름(단위: 미터)
		private final double surfaceGravity;// 표면중력(단위: m / s^2)
		
		// 중력상수(단위: m^3 / kg s^2)
		private static final double G = 6.67300E-11;
		
		// 생성자
		Planet(double mass, double radius) {
			this.mass = mass;
			this.radius = radius;
			surfaceGravity = G * mass / (radius * radius);
		}
		
		public double mass() { return mass; }
		public double radius() { return radius; }
		public double surfaceGravity() { return surfaceGravity; }
		
		public double surfaceWeight(double mass) {
			return mass * surfaceGravity; // F = ma
		}
	}
	
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble(args[0]);
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values()) 
			System.out.printf("%s에서의 무게는 %f이다.%n",p ,p.surfaceWeight(mass));
	}
}
