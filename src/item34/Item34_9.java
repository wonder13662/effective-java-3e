package item34;

public class Item34_9 {

	private Item34_9() {}
	
	// 코드 34-9 전략 열거 타입 패턴
	public enum PayrollDay {
		MONDAY(PayType.WEEKDAY), 
		TUESDAY(PayType.WEEKDAY), 
		WEDNESDAY(PayType.WEEKDAY), 
		THURSDAY(PayType.WEEKDAY), 
		FRIDAY(PayType.WEEKDAY), 
		SATURDAY(PayType.WEEKEND), 
		SUNDAY(PayType.WEEKEND);
		
		private final PayType payType;
		
		PayrollDay(PayType payType) { this.payType = payType; }
		
		int pay(int minutesWorked, int payRate) {
			return payType.pay(minutesWorked, payRate);
		}
		
		// 전략 열거 타입
		enum PayType {
			WEEKDAY {
				int overtimePay(int minsWorked, int payRate) {
					return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
				}
			},
			WEEKEND {
				int overtimePay(int minsWorked, int payRate) {
					return minsWorked * payRate / 2;
				}
			};
			
			abstract int overtimePay(int mins, int payRate);
			private static final int MINS_PER_SHIFT = 8 * 60;
			
			int pay(int minsWorked, int payRate) {
				int basePay = minsWorked * payRate;
				return basePay + overtimePay(minsWorked, payRate);
			}
		}
	}

	public static void main(String[] args) {
		
	}
}
