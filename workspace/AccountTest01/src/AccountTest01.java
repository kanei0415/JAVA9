
// 은행계좌를 클래스의 개념을 도입하지 않고 생성 
// -> 클래스의 필요성을 이해하기 위해서

// 문제점
// 1. 계좌의 정보를 변수명 혹은 comment를 통해 알 수 있다.
// 2. 한 사람의 계좌정보가 연관성이 없다. 하나로 묶여 취급되는것이 아니다.
// 3. 아무나 연산을 통해 입금과 출금이 가능하도록 되어있다. 외부에서 데이터를 참조가능

public class AccountTest01 {
	public static void main(String[] args) {
		// john의 계좌
		String johnAccountName = "John";  // john의 계좌명의
		String johnAccountNum = "123456"; // john의 계좌번호
		int johnAccountBalance = 1000;    // john의 예금잔고 
		
		// mary의 계좌
		String maryAccountName = "Mary";  // mary의 계좌명의
		String maryAccountNum = "654321"; // mary의 계좌번호
		int maryAccountBalance = 500;     // mary의 예금잔고 
		
		johnAccountBalance -= 200; // john의 예금잔고에서 출금
		maryAccountBalance += 100; // mary의 예금잔고에서 입금
		
		System.out.println("●  john의 계좌");
		System.out.println("     계좌명의 : " + johnAccountName);
		System.out.println("     계좌번호 : " + johnAccountNum);
		System.out.println("     예금잔고 : " + johnAccountBalance);
		
		System.out.println("●  mary의 계좌");
		System.out.println("     계좌명의 : " + maryAccountName);
		System.out.println("     계좌번호 : " + maryAccountNum);
		System.out.println("     예금잔고 : " + maryAccountBalance);
		
	}
}
