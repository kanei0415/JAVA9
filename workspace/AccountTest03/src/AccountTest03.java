
public class AccountTest03 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		
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

//은행계좌 정보 class - 계좌명의, 계좌정보, 예금잔고
class Account {
	// class의 member variable
	String name;
	String num;
	int balance;
	
	// 생성자(Constructor) -> def __init__():
	// 1. 생성자의 특징
	// - return type이 없다, 클래스의 이름과 같다
	// 2. 생성자의 역학
	// - instance의 생성할 때 호출되므로 초기화를 확실히 한다.
	// - 생성자는 instance를 만들 때만 호출된다.
	Account(String userName, String userNum, int userBalance) {
		name = userName;
		num = userNum;
		balance = userBalance;
	}
}
