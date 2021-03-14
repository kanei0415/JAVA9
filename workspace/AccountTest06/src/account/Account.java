package account;

// 부모 클래스, 상위 클래스
// 일반 계좌 class
public class Account {
	private String name; // 계좌명의
	private String num;	// 계좌번호
	private int balance; // 예금잔고
		
	public Account(String name, String num, int balance) {
		this.name = name;
		this.num = num;
		this.balance = balance;
	}
	public Account(){
		
	}
	
	public String getName(){
		return name;
	}
	public String getNum(){
		return num;
	}
	public int getBalance(){
		return balance;
	}

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
	
	public String toString() {
		return "계좌 명의 : " + name + " 계좌 번호 : " + num + " 잔액 : " + balance;
	}
	
	// 출력 메소드
	public void showInfo() {
		System.out.println("● 계좌 명의 : " + name);
		System.out.println("● 계좌 번호 : " + num);
		System.out.println("● 잔액 : " + balance);
	}
}
