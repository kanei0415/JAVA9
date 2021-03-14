public class AccountTest04 {
	public static void main(String[] args) {
		
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		
		
		john.withdraw(200);
		mary.deposit(100);
		
		//print
		System.out.println("●  john의 계좌");
		System.out.println("     계좌명의 : " + john.getName());
		System.out.println("     계좌번호 : " + john.getNum());
		System.out.println("     예금잔고 : " + john.getBalance());
		
		System.out.println("●  mary의 계좌");
		System.out.println("     계좌명의 : " + mary.getName());
		System.out.println("     계좌번호 : " + mary.getNum());
		System.out.println("     예금잔고 : " + mary.getBalance());
	}
}

//은행계좌 정보 class - 계좌명의, 계좌정보, 예금잔고
class Account {
	// class의 member variable
	// private - 같은 Class의 member만 접근 가능하다 -> 다른 Class에서는 접근 불가
	private String name;
	private String num;		
	private int balance;
		
	// 생성자(Constructor) -> def __init__():
	// 1. 생성자의 특징
	// - return type이 없다, 클래스의 이름과 같다
	// 2. 생성자의 역학
	// - instance의 생성할 때 호출되므로 초기화를 확실히 한다.
	// - 생성자는 instance를 만들 때만 호출된다.
	// 생성자 Overloading
	public Account(String name, String num, int balance) {
		this.name = name;
		this.num = num;
		this.balance = balance;
	}
	
	// 기본 생성자는 다른 생성자가 없다면 무조건 존재한다, 다른 생성자가 존재한다면 기본생성자가 사라진다.
	// 매개변수가 있는 생성자를 만든 후에도 만약 기본생성자를 사용하고 싶다면, 기본생성자를 직접 만들어 넣어주면 된다.
	public Account(){
		
	}
	
	// member method
	// public - 어디에서나 접근 가능
	// getter method - instance의 member variable의 값을 가져오는 역할
	public String getName(){
		return name;
	}
	public String getNum(){
		return num;
	}
	public int getBalance(){
		return balance;
	}
	
	// setter method - instance의 member variable의 값을 설정하는 역할
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금 메소드
	public void deposit(int money) {
		balance += money;
	}
	// 출금 메소드
	public void withdraw(int money) {
		balance -= money;
	}
}
