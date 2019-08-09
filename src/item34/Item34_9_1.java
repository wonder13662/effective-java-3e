package item34;

import item34.Item34_9_1.PayrollDay.PayType;

public class Item34_9_1 {

	private Item34_9_1() {}
	
	// 코드 34-9-1 전략 열거 타입 패턴 - 처리 패턴을 사용자 쪽에서 주입하는 방법(종훈의 제안)
	// 또다른 생각: 클라이언트에서 PayType을 선택한다면 관리의 어려움이 있지 않을까?
	public enum PayrollDay {
		MONDAY(), 
		TUESDAY(), 
		WEDNESDAY(), 
		THURSDAY(), 
		FRIDAY(), 
		SATURDAY(), 
		SUNDAY();
		
		int pay(int minutesWorked, int payRate, PayType payType) {
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
		System.out.println(PayrollDay.FRIDAY.pay(10, 10, PayType.WEEKDAY));
	}
}
