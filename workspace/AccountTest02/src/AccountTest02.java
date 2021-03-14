
// 해결
// 1. 계좌 정보를 class를 통해 생성함으로써 instance name으로 알 수 있다.
// 2. 각 data가 instance를 통해 하나로 묶여 처리된다.

// 문제점
// 1. instance name을 통해 어디서나 data에 접근할 수 있음
// 2. 확실한 초기화의 보장이 되고있지 않다. instance생성과 data input이 분리됨

public class AccountTest02 {
	public static void main(String[] args) {
		// instance 생성
		Account john = new Account(); // john의 계좌
		Account mary = new Account(); // mary의 계좌
		
		// data input
		
//		// john의 계좌
//		john.name = "John";  // john의 계좌명의
//		john.num = "123456"; // john의 계좌번호
//		john.balance = 1000;    // john의 예금잔고 
//				
//		// mary의 계좌
//		mary.name = "Mary";  // mary의 계좌명의
//		mary.num = "654321"; // mary의 계좌번호
//		mary.balance = 500;     // mary의 예금잔고
		
		// 입금, 출금
//		john.balance -= 200; // john의 계좌 출금
//		mary.balance += 100; // mary의 계좌 입금
		
		//print
		System.out.println("●  john의 계좌");
		System.out.println("     계좌명의 : " + john.name);
		System.out.println("     계좌번호 : " + john.num);
		System.out.println("     예금잔고 : " + john.balance);
		
		System.out.println("●  mary의 계좌");
		System.out.println("     계좌명의 : " + mary.name);
		System.out.println("     계좌번호 : " + mary.num);
		System.out.println("     예금잔고 : " + mary.balance);
	}
}

// 은행계좌 정보 class - 계좌명의, 계좌정보, 예금잔고
class Account {
	// class의 member variable
	String name;
	String num;
	int balance;
	
	// 기본 생성자(Default Constructor)
	// Class를 만들면 만들지 않아도 무조건 존재
	Account(){
		
	}
}