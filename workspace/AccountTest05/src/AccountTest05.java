public class AccountTest05 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account jane = new Account("Jane", "112233", 3000);
		
		
//		john.withdraw(200);
//		mary.deposit(100);
		
		//print
		System.out.println("●  john의 계좌");
		System.out.println("     식별번호 : " + john.getId());
		System.out.println("     계좌명의 : " + john.getName());
		System.out.println("     계좌번호 : " + john.getNum());
		System.out.println("     예금잔고 : " + john.getBalance());
		 
		System.out.println("●  mary의 계좌");
		System.out.println("     식별번호 : " + mary.getId());
		System.out.println("     계좌명의 : " + mary.getName());
		System.out.println("     계좌번호 : " + mary.getNum());
		System.out.println("     예금잔고 : " + mary.getBalance());
		
		System.out.println("●  jane의 계좌");
		System.out.println("     식별번호 : " + jane.getId());
		System.out.println("     계좌명의 : " + jane.getName());
		System.out.println("     계좌번호 : " + jane.getNum());
		System.out.println("     예금잔고 : " + jane.getBalance());
	}
}

//은행계좌 정보 class - 계좌명의, 계좌정보, 예금잔고
class Account {
	// class variable, static field
	// 1. class가 사용되기 직전에 생성됨
	// 2. class에 딱 하나만 생성 되어서 모든 instance에서 공유하는 값
	// 3. 모든 instance에서 공유하여 사용해야하는 변수에 적합. ex) 일련번호, 식별번호...
	private static int count = 0;
	
	// instance method, non-static field
	// 1. instance를 만들 때 마다 생성된다.
	private String name; // 계좌명의
	private String num;	// 계좌번호
	private int balance; // 예금잔고
	private int id; // 계좌 일련번호
		
	public Account(String name, String num, int balance) {
		this.name = name;
		this.num = num;
		this.balance = balance;
		this.id = ++count;
	}
	
	public Account(){
		
	}
	
	// instance method
	// getter
	public String getName(){
		return name;
	}
	public String getNum(){
		return num;
	}
	public int getBalance(){
		return balance;
	}
	public int getId() {
		return id;
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