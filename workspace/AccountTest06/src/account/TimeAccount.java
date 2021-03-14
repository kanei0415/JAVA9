package account;

// TimeAccount class는 Account class로부터 모든 것을 상속받는다.
// TimeAccount class는 Account class를 확장한다.

// 상속 관계 class 명칭
// 1. 상속 하는 클래스 : Account     - 부모, 기반(기본), 상위, 슈퍼
// 2. 상속 받는 클래스 : TimeAccount - 자식,    파생,   하위, 서브

// 자식클래스
public class TimeAccount extends Account {
	private int timeBalance;
	
	// constructor, initializer는 상속되지 않는다.
	
	// constructor
	public TimeAccount(String name, String number, int balance, int timeBalance) {
		// 1. private에 접근 불가능
		//this.~ = ~
		// 2. constructor 는 new에 의해서만 호출가능
//		Account(name, number, balance);
		
		// 해결책 : super(*args 사용)
		// super(*args)
		super(name, number, balance);

		this.timeBalance = timeBalance;
		
	}
	
	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	
	public int getTimeBalance() {
		return timeBalance;
	}
	
	// 정기 예금 해약
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	// super. : 자식클래스에서 부모클래스에 멤버 method에 접근하는 방법
	public String toString() {
		return super.toString() + " 정기 예금 잔고 : " + timeBalance;
	}
	
	// 오버라이딩(OverRiding)
	// 1. method의 재정의
	// 2. 상속의 관계에서 부모 클래스의 메소드를 자식클래스에서 재정의 하는 것
	// 3. 오버라이딩을 할 때는 자식 클래스의 메소드는 부모 클래스의 메소드와 완벽하게 일치해야 한다.
	
	public void showInfo() {
		super.showInfo();
		System.out.println("● 정기 예금 잔고 : " + timeBalance);
	}
}
