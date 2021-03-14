import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args){
		// 1. 완전수식명 (Full Qualified Name, FQN)
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 2. 단순명(Simple Name, SN)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n =sc.nextInt();
		
		System.out.println("입력한 정수는 " + n + "입니다.");
		
		sc.close();
	}
}
