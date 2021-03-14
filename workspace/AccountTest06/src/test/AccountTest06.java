package test;

// 1. 단일형 import
//import account.Account;
//import account.TimeAccount;

// 2. on-demand import
import account.*;

public class AccountTest06 {
	public static void main(String[] args) {
		Account a1 = new Account("김연경", "123456", 5000);
		TimeAccount t1 = new TimeAccount("이다영", "654321", 3000, 100);
		
		Account x;
		x = a1;
		x = t1; // 가능 - 부모의 참조변수에 자식의 참조를 대입할 수 있다.
		
		TimeAccount y;
//		y = a1; // 불가능 - 자식의 참조변수에 부모의 참조를 대입할 수 없다.
		y = t1;
		
//		System.out.println(a1);
//		System.out.println(t1);
		
		a1.showInfo();
		System.out.println();
		t1.showInfo();
	}
}
